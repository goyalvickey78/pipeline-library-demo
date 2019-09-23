#!/usr/bin/env groovy

def call(String name = 'poll scm') {
  new Deployer(script:this).run()
  echo "Hello this is, ${name} step."
}
