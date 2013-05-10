#!/usr/bin/ruby

def pythonify(rubysource, namespace)
  private_scope = false
  python_class = nil
  comment = nil

  namespace_wrapper_generated = false

  cls = <<EOS
import rdflib

from rdflib import Namespace

EOS

  rubysource.each { |line|
    line.chomp!

    next if line.start_with?('module ') or line.start_with?('require ')

    if line.match('http://') then
      namespace = line.scan(/http:\/\/[^']+/)[0].sub(/(\/[^\/#]+)'$/, '').sub(/(#).*$/, '\1') unless namespace
      line.gsub!(namespace, '')
    end

    if line.start_with?('class') then
      python_class = line.sub(/^.* /, '')
      transduction = "#{line}:"
    elsif line.strip.start_with?('def ') then
      leading_spaces = line.gsub(/[^ ].*$/, '')
      transduction = "#{leading_spaces}@classmethod\n"
      leading_spaces << '  '
      if comment then
        transduction << "#{line.sub('?', '').sub(/self\./, '')}:\n#{('"""' + comment).gsub(/^/, "#{leading_spaces}")}\n#{leading_spaces}\"\"\""
        comment = nil
      else
        transduction << "#{line.sub('?', '').sub(/self\./, '')}:"
      end
      transduction.sub!('(', '(cls, ')
      transduction.sub!(':', '(cls):') unless line.match(/\(/)
    elsif line.strip.start_with?('#') then
      unless comment then
        comment = line.strip.sub(/^# ?/, '')
      else
        comment << "\n#{line.strip.gsub(/^# ?/, '').gsub(/\+([^+]+)\+::/, '\1 --')}"
      end
      transduction = nil
    elsif line.strip.start_with?('end') then
      transduction = nil
      cls.gsub!(/_namespace_#{python_class}\(/, 'RDF::URI.new(') if line.start_with?('end') and not namespace_wrapper_generated
    elsif line.strip.start_with?('if ') or line.strip.start_with?('elsif') then
      transduction = "#{line.sub(/ then$/, '').sub('elsif', 'elif').gsub('@@', 'cls.__').gsub(/RDF::URI\.new\(([^)]+)\)/, "_namespace_#{python_class}(\\1)").gsub(/(\w)\?\(/, '\1(')}:"
    elsif line.strip.start_with?('private') then
      private_scope = true
      namespace_wrapper_generated = true
      transduction = nil
      cls << "__namespace_#{python_class} = Namespace('#{namespace}')\n\n"
      cls << "def _namespace_#{python_class}(accession):\n"
      cls << "    return __namespace_#{python_class}[accession]\n\n"
    else
      transduction = line.gsub('@@', '__').gsub('=>', ':').gsub(/RDF::URI\.new\(([^)]+)\)/, "_namespace_#{python_class}(\\1)").gsub('true', 'True').gsub('false', 'False').gsub(/(\w+)\.select ?\{ ?\|(\w+)\| ?(.*[^ ]) ?\}/, 'filter(lambda \2: \3, \1)').gsub(/(\w)\?\(/, '\1(').gsub('has_parent(', 'cls.has_parent(')
      transduction.gsub!('__', 'cls.__') unless line.strip.start_with?('@@')
    end

    cls << "#{transduction.gsub(/^( +)/, '\1\1')}\n" if transduction

  }

  cls
end

unless @loaded_externally then
  namespace = nil

  if ARGV.length == 1 then
    namespace = ARGV[0]
  end

  puts pythonify(STDIN, namespace)
end

