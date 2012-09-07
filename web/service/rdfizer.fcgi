#!/usr/bin/ruby

require 'rubygems'
require 'net/http'
require 'uri'
require 'cgi'
require 'fcgi'
require 'json'

FCGI.each { |fcgi|
  request = fcgi.in.read

  http_query = fcgi.env['QUERY_STRING']

  fcgi.out.print("Content-Type: #{type}\r\n")
  fcgi.out.print("\r\n")
  fcgi.out.print("HELLO!")
  fcgi.finish
}

