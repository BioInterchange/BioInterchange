#!/usr/bin/ruby

def record(id, description, uri)
  cls = "  # Returns the link-out URI for objects of \"#{description}\".\n"
  cls << "  def self.#{id}\n"
  cls << "    RDF::URI.new(\"#{uri}\")\n"
  cls << "  end\n\n"

  cls
end

def goxrefify(ontology)
  cls = "class GOXRef\n\n"

  in_record = false

  id = nil
  description = nil
  uri = nil

  ontology.each { |line|
    line.chomp!

    if line.empty? then
      record(id, description, uri) if uri and not uri.match(/\[.*\]/)
      uri = nil
      in_record = false
    end

    if line.start_with?('abbreviation:') and not in_record then
      id = line.sub(/^abbreviation: /, '').gsub(/[-\/]/, '_')
      in_record = true
    end
    
    description = line.sub(/^database: /, '') if line.start_with?('database:') and in_record
    uri = line.sub(/^url_syntax: /, '').sub(/\[example_id\]$/, '') if line.start_with?('url_syntax:') and in_record
  }

  cls << record(id, description, uri) if uri

  cls << "end\n"

  cls
end

unless @loaded_externally then
  puts goxrefify(STDIN)
end

