package com.packtpub

import org.springframework.stereotype.Service


/** HelloWorld is a Our Spring-Bean */

@Service
open class HelloWorld {
    fun sayHello(){
        println("Hi Zem, Welcome in the REST")
    }
}