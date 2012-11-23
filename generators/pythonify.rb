#!/usr/bin/ruby

private_scope = false
python_class = nil
namespace = nil
comment = nil

cls = ''

puts 'import rdflib'
puts ''
puts 'from rdflib import Namespace'
puts ''

STDIN.each { |line|
  line.chomp!

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
  elsif line.strip.start_with?('if ') or line.strip.start_with?('elsif') then
    transduction = "#{line.sub(/ then$/, '').sub('elsif', 'elif').gsub('@@', 'cls.__').gsub(/RDF::URI\.new\(([^)]+)\)/, "_namespace_#{python_class}(\\1)").gsub(/(\w)\?\(/, '\1(')}:"
  elsif line.strip.start_with?('private') then
    private_scope = true
    transduction = nil
    puts "__namespace_#{python_class} = Namespace('#{namespace}')"
    puts ''
    puts "def _namespace_#{python_class}(accession):"
    puts "    return __namespace_#{python_class}[accession]"
    puts ''
  else
    transduction = line.gsub('@@', '__').gsub('=>', ':').gsub(/RDF::URI\.new\(([^)]+)\)/, "_namespace_#{python_class}(\\1)").gsub('true', 'True').gsub('false', 'False').gsub(/(\w+)\.select ?\{ ?\|(\w+)\| ?(.*[^ ]) ?\}/, 'filter(lambda \2: \3, \1)').gsub(/(\w)\?\(/, '\1(').gsub('has_parent(', 'cls.has_parent(')
    transduction.gsub!('__', 'cls.__') unless line.strip.start_with?('@@')
  end

  cls << "#{transduction.gsub(/^( +)/, '\1\1')}\n" if transduction

}

puts cls

