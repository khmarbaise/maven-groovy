package com.soebes.groovy.first


/**
* Example Groovy class.
*/
class Example {
    Helper help
    JavaExampleClass j
    def show() {
        println 'Hello World'
        foo "foo" bar "hello" // some Groovy 1.8 syntax
    }
    Example foo(x) { this }
    def bar(x) { println x }
    
}
