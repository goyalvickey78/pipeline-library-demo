#!/usr/bin/env groovy
package com.cleverbuilder

class GlobalVars {
   static String foo = "bar"
   Script script
   
   def run() {
      script.echo("This is running through MPL")
   }
   
   
   // refer to this in a pipeline using:
   //
   // import com.cleverbuilder.GlobalVars
   // println GlobalVars.foo
}
