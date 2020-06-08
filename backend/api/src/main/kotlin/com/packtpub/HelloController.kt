package com.packtpub

import kotlinx.html.*
import kotlinx.html.stream.createHTML
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(private val helloSayer: IHelloWorld)  {        //  no need to use 'open' thanks to 'gradle-spring' plugin */

//    val links = mapOf<String, String>(
    val links = mapOf(
        "Kotlin" to "https://github.com/JetBrains/kotlin",
        "Spring" to "https://github.com/JetBrains/kotlin",
        "React" to "https://github.com/facebook/react",
        "Full Stack Development" to "https://github.com/Xantier/fullstack-kotlin"

    )

    @GetMapping(produces = arrayOf("text/html"))                     // Initial End Point */
    fun controllerSayHello(@RequestParam("nameInput", required = false) nameInput: String?)
        : String =
        /**
         * with kotlinx-html, this method come handy
         * this 'pretty-print' to design html pages
         * whereby multiple 'bloks can be 'piped' together
         * */
        createHTML(true).html {
            head {
                title("Full Stack Kotlin")
            }
            body {
                h4 {
                    +helloSayer.sayHello(nameInput ?: "User")
                }
                p {
                    +"Welcome to full stack kotlin"
                }
                p {
                    +"Our Resources"
                    ul {
                        links.map { (name, url) ->
                            li {
                                a(url) {
                                    target = ATarget.blank
                                    +name
                                }
                            }
                        }
                    }
                }
            }
        }

}

