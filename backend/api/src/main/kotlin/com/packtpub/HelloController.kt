package com.packtpub

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(private val helloSayer: IHelloWorld)  {        /** no need to use 'open' thanks to 'gradle-spring' plugin */

    @GetMapping                                                   /** Initial End Point */
    fun controllerSayHello(@RequestParam("nameInput") nameInput: String): String =
        helloSayer.sayHello(nameInput)
}