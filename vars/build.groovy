#!/usr/bin/env groovy

def call(String name = 'build') {
  new GlobalVars(script:this).run()
  echo "Hello this is, ${name} step."
}
