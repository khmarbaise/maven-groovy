package com.soebes.groovy.first
import groovy.util.XmlSlurper

def pom = new XmlSlurper().parse(new File('pom.xml'))

def params = [ key1:'value1', key2:'value2', key3:'value3 ']

println params.collect { k, v -> "$k=$v" }.join('&')

pom.project.each { child -> println child }

for (module in pom.project.modules) {
    println "${module.@name}"
}

