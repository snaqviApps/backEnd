package com.packtpub

interface HelloSayer {
    fun sayHelloI(nameIn: String): String
}

/** HelloWorld is our Spring-Bean
 * as well as: Service
 **/
internal class HelloWorld : HelloSayer {
    override fun sayHelloI(nameIn: String) =
        "Hi: $nameIn"
}