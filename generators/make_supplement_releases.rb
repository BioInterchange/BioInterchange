#!/usr/bin/ruby

# Creates supplemental vocabulary wrappers in multiple languages (besides Ruby):
#
# 1. Java
# 2. Python

# This variable tells the loaded Ruby files below that they are not being called
# from the command line (which would make their code run reading from STDIN):
@loaded_externally = true

# Each language has a converter that translates a Ruby vocabulary wrapper into their language:
load 'generators/javaify.rb'
load 'generators/pythonify.rb'

# Directory in which Ruby vocabulary wrappers are located:
vocabulary_path = 'lib/biointerchange'

# Directory in which translated vocabulary wrappers are placed (language dependent):
java_path = 'supplemental/java/biointerchange/src/main/java/org/biointerchange/vocabulary'
python_path = 'supplemental/python/biointerchange'

# Non-nil values overwrite URIs defaults (class- and property-URI prefixes):
namespaces = {
  'gff3o.rb'  => nil,
  'goxref.rb' => '',
  'gvf1o.rb'  => nil,
  'sio.rb'    => nil,
  'so.rb'     => 'http://purl.obolibrary.org/obo/',
  'sofa.rb'   => 'http://purl.obolibrary.org/obo/'
}

# Loop through all vocabulary wrappers:
Dir.foreach(vocabulary_path) { |filename|
  next unless filename.end_with?('.rb')
  File.open("#{vocabulary_path}/#{filename}") { |rubyfile|
#    if rubyfile.grep(/@@parent_properties/).length > 0 then
    classes = rubyfile.grep(/^\s*class/)
    rubyfile.rewind
    instance_methods = rubyfile.grep(/^\s*def\s+(\.|\w)+/).select { |method| method.index('self.') == nil }
    rubyfile.rewind
    if classes.length == 1 and instance_methods.length == 0 and not filename == 'registry.rb' then
      rubyfile.rewind
      # Note: the 'strip' is to remove whitespace and newlines from the end of the string
      classname = rubyfile.grep(/^class \w+/)[0].sub(/^class\s+/, '').strip
      rubyfile.rewind
      File.open("#{java_path}/#{classname}.java", 'w') { |javafile|
        javafile.puts(javaify(rubyfile, namespaces[filename]))
      }
      rubyfile.rewind
      File.open("#{python_path}/#{filename.sub(/\.rb$/, '.py')}", 'w') { |pythonfile|
        pythonfile.puts(pythonify(rubyfile, namespaces[filename]))
      }
    end
  }
}

