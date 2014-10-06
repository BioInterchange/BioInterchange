#!/bin/bash

bundle exec rake gemspec ; bundle exec gem build biointerchange.gemspec ; sudo gem install --no-rdoc --no-ri biointerchange

