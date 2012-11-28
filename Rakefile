# encoding: utf-8

require 'rubygems'
require 'bundler'
begin
  Bundler.setup(:default, :development)
rescue Bundler::BundlerError => e
  $stderr.puts e.message
  $stderr.puts "Run `bundle install` to install missing gems"
  exit e.status_code
end
require 'rake'

require 'jeweler'
Jeweler::Tasks.new do |gem|
  # gem is a Gem::Specification... see http://docs.rubygems.org/read/chapter/20 for more options
  gem.name = "biointerchange"
  gem.homepage = "http://www.biointerchange.org"
  gem.license = "MIT"
  gem.summary = %Q{An open source framework for transforming heterogeneous data formats into RDF.}
  gem.description = %Q{BioInterchange is a Ruby gem, command-line tool, web-service for turning heterogeneous data formats such as JSON, XML, GFF3, etc., into RDF."}
  gem.email = "joachim.baran@gmail.com"
  gem.authors = ["Joachim Baran", "Kevin B. Cohen", "Geraint Duck", "Michel Dumontier", "Jin-Dong Kim"]
  gem.executable = 'biointerchange'
  # dependencies defined in Gemfile
end
Jeweler::RubygemsDotOrgTasks.new

require 'rspec/core'
require 'rspec/core/rake_task'
RSpec::Core::RakeTask.new(:spec) do |spec|
  spec.pattern = FileList['spec/**/*_spec.rb']
end

RSpec::Core::RakeTask.new(:rcov) do |spec|
  spec.pattern = 'spec/**/*_spec.rb'
  spec.rcov = true
end

task :default => :spec

require 'rdoc/task'
Rake::RDocTask.new do |rdoc|
  version = File.exist?('VERSION') ? File.read('VERSION') : ""

  rdoc.rdoc_dir = 'rdoc'
  rdoc.title = "BioInterchange #{version}"
  # rdoc.rdoc_files.include('README*')
  rdoc.rdoc_files.include('lib/**/*.rb')
end
