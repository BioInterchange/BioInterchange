#!/usr/bin/ruby

def record(id, description, uri)
  puts "  # Returns the link-out URI for objects of \"#{description}\"."
  puts "  def self.#{id}"
  puts "    RDF::URI.new(\"#{uri}\")"
  puts '  end'
  puts ''
end

puts 'class GOXRef'
puts ''

in_record = false

id = nil
description = nil
uri = nil

STDIN.each { |line|
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

record(id, description, uri) if uri

puts 'end'

