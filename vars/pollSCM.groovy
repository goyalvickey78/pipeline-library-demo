#!/usr/bin/env groovy

def call(String name = 'poll scm') {
  //new GlobalVars(script:this).run()
  echo "Hello this is, ${name} step."
}
