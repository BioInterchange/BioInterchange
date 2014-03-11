#!/usr/bin/ruby

require 'biointerchange'

if ARGV.length != 1 then
  puts 'Usage: tsv2rubyclass rubyclassname'
  puts ''
  puts 'Reads a TSV file from STDIN, where the first column values become'
  puts 'method names (sanitized for spaces, etc.) in the class and the'
  puts 'second column values are returned as a string.'
  puts ''
  puts 'The generated Ruby class is output on STDOUT.'
  exit 1
end

classname = ARGV[0]

puts "class #{classname}"
puts ''

STDIN.each { |line|
  key, value = line.chomp.split("\t")

  puts "  def self.#{BioInterchange.make_safe_label(key)}"
  puts "    \"#{value}\""
  puts '  end'
  puts ''
}

puts 'end'

