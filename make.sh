#!/usr/bin/env bash

bundle exec rake gemspec ; bundle exec gem build biointerchange.gemspec ; gem install --no-rdoc --no-ri biointerchange

