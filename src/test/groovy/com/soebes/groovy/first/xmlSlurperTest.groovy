package com.soebes.groovy.first

import groovy.util.GroovyTestCase
import groovy.util.XmlSlurper

class xmlSlurperTest extends GroovyTestCase {

    void testFirst() {
	
	def pom = new XmlSlurper().parse(new File('pom.xml'))
		
        //def params = [ key1:'value1', key2:'value2', key3:'value3 ']
        //
        //println params.collect { k, v -> "$k=$v" }.join('&')
        //
        //pom.project.each { child -> println child }
        //
        //for (module in pom.project.modules) {
        //    println "${module.@name}"
        //}
        //
        //println "Hello here i am."
		
	println pom.size()
	pom.childNodes().each {
	    item -> println "Item:" +item.name()
	}
	
	def version = pom.childNodes().find {
	    item -> item.name().equals("version")
	}
	println pom.@project.size()
	
	println "Node: Version:" + version.text()
    }

}
