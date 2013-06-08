#!/usr/bin/ruby

def javaify(rubycode, namespace = nil)
  private_scope = false
  java_class = nil
  comment = nil

  namespace_wrapper_generated = false
  class_closed = false

  cls = <<EOS
package org.biointerchange.vocabulary;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.ResourceFactory;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;

EOS

  rubycode.each { |line|
    line.chomp!

    next if line.start_with?('module ') or line.start_with?('require ')

    if line.match('https?://') and not line.strip.start_with?('#') then
      unless namespace then
        namespace = line.scan(/https?:\/\/[^']+/)[0].sub(/(\/[^\/#]+)'.*$/, '')
        if namespace.include?('#') then
          namespace.sub!(/(#).*$/, '\1')
        else
          namespace.sub!(/(\/)[^\/]*$/, '\1')
        end
      end
      line.gsub!(namespace, '')
    end

    if line.start_with?('class') then
      java_class = line.sub(/^.* /, '')
      transduction = "public class #{java_class} {"
    elsif line.strip.start_with?('def ') then
      leading_spaces = line.gsub(/[^ ].*$/, '')
      transduction = ''
      if comment then
        transduction << "#{("/**\n *" + comment).gsub(/^/, "#{leading_spaces}")}\n#{leading_spaces} */\n"
        comment = nil
      end
      transduction << "  public static #{line.sub('?', '').sub(/self\./, '').sub(/ *def\ /, '')}"
      method_name = transduction.sub(/^.*public static /m, '').sub(/(\(.*)?$/, '')
      transduction.sub!("public static #{method_name}", "public static _#{method_name}_") if method_name.match(/^(true|false|class|public|private|static|return|if|while|do|clone|equals|toString|hashCode|byte|char|short|int|long|float|double|boolean)$/)
      variables = transduction.scan(/^\s*public static \w+\((.+)\)$/)
      variables = variables[0][0].split(',').map { |variable| variable.strip } if variables.length > 0
      if method_name == 'is_object_property' then
        transduction.sub!(/public static .*$/, "public static boolean isObjectProperty(Resource #{variables[0]})")
      elsif method_name == 'is_datatype_property' then
        transduction.sub!(/public static .*$/, "public static boolean isDatatypeProperty(Resource #{variables[0]})")
      elsif method_name == 'is_class' then
        transduction.sub!(/public static .*$/, "public static boolean isClass(Resource #{variables[0]})")
      elsif method_name == 'is_named_individual' then
        transduction.sub!(/public static .*$/, "public static boolean isNamedIndividual(Resource #{variables[0]})")
      elsif method_name == 'with_parent' then
        transduction.sub!(/public static .*$/, "public static Set<Resource> withParent(Set<Resource> #{variables[0]}, final Resource #{variables[1]})")
      elsif method_name == 'has_parent' then
        transduction.sub!(/public static .*$/, "public static boolean hasParent(Resource #{variables[0]}, Resource #{variables[1]})")
      else
        if transduction.match(/\/\*\*[^E]*Either:.*Or:/m) or transduction.match(/\/\*\*[^A]*Ambiguous label\./) then
          transduction.sub!(/public static /, 'public static Set<Resource> ')
        else
          transduction.sub!(/public static /, 'public static Resource ')
        end
      end
      transduction << '()' unless transduction.end_with?(")")
      transduction << ' {'
    elsif line.strip.start_with?('#') then
      unless comment then
        comment = line.strip.sub(/^# ?/, ' ')
      else
        comment << "\n#{line.strip.gsub(/^# ?/, ' * ').gsub(/\+([^+]+)\+::/, '@param \1')}"
      end
      transduction = nil
    elsif line.strip.start_with?('end') then
      if class_closed then
        transduction = nil
      else
        if line.start_with?('end') then
          class_closed = true
          cls.gsub!(/_namespace_#{java_class}\(/, 'return ResourceFactory.createResource(') unless namespace_wrapper_generated
        end
        transduction = line.sub(/end/, '}')
      end
    elsif line.strip.start_with?('if ') or line.strip.start_with?('elsif') then
      transduction = "#{line.sub(/ then$/, '').sub('elsif', 'else if').gsub('@@', '__').gsub(/RDF::URI\.new\(([^)]+)\)/, "_namespace_#{java_class}(\\1)").gsub(/(\w)\?\(/, '\1(')}".gsub(/\.has_key\(([^)]+)\)/, '.containsKey(\1)').gsub(/\[([^\]]+)\]/, '.get(\1)')
      transduction.sub!(/\s*==\s*(_namespace_\w+\([^)]+\))/, '.equals(\1)')
      transduction.sub!(/\s*==\s*(\w+)/, '.equals(\1)')
      transduction.sub!(/if /, 'if (')
      transduction.sub!(/$/, ') {')
    elsif line.strip.start_with?('return [') then
      transduction = line.sub(/return \[/, 'return new HashSet<Resource>(Arrays.asList(new Resource[] {').sub(/\]$/, '}));').gsub(/RDF::URI\.new\(([^)]+)\)/, "_namespace_#{java_class}(\\1)")
    elsif line.strip.start_with?('private') then
      private_scope = true
      namespace_wrapper_generated = true
      transduction = "  private static Resource _namespace_#{java_class}(String accession) {\n"
      transduction << "    return ResourceFactory.createResource(\"#{namespace}\" + accession);\n"
      transduction << "  }\n\n"
    else
      transduction = line.gsub('@@', '__').gsub(/RDF::URI\.new\(([^)]+)\)/, "_namespace_#{java_class}(\\1)").gsub(/(\w+)\.select ?\{ ?\|(\w+)\| ?(.*[^ ]) ?\}/, 'new HashSet<Resource>(CollectionUtils.select(\1, new Predicate() { public boolean evaluate(Object \2) { return \3; } }))').gsub(/(\w)\?\(/, '\1(').gsub('has_parent(', 'hasParent((Resource)').gsub(/\[([^\]]+)\]/, '.get(\1)')
      transduction.gsub!('__', '__') unless line.strip.start_with?('@@')
      transduction << ';' unless line.strip.empty?
    end

    if transduction and transduction.strip.start_with?('__') then
      variable = transduction.scan(/__\w+/)[0]
      map = {}
      map = Hash[*transduction.sub(/^.* \{/, '').sub(/\};/, '').split(',').map { |assignment| assignment.split('=>').map { |kv| kv.strip } }.flatten.map { |function| if function.match(/'\w+'/) then "#{namespace}#{function.scan(/'\w+'/)[0].gsub(/'/, '')}" else nil end }.compact ] if transduction.match(/\{\s*\S+.*\}/)
      transduction = "  private static Map<Resource, Resource> #{variable} = _init_#{variable}();\n\n"
      transduction << "  private static Map<Resource, Resource> _init_#{variable}() {\n"
      transduction << "    Map<Resource, Resource> map = new HashMap<Resource, Resource>();\n\n"
      map.each_pair { |key, value| transduction << "    map.put(ResourceFactory.createResource(\"#{key}\"), ResourceFactory.createResource(\"#{value}\"));\n" }
      transduction << "\n"
      transduction << "    return map;\n"
      transduction << "  }\n"
    end

    cls << "#{transduction}\n".gsub(/'/, '"') if transduction
  }

  cls
end

unless @loaded_externally then
  namespace = nil

  if ARGV.length == 1 then
    namespace = ARGV[0]
  end

  puts javaify(STDIN, namespace)
end

