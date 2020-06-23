//package com.packtpub
//
//import kotlinx.html.*
//import kotlinx.html.stream.createHTML
//import org.springframework.context.annotation.Bean
//import org.springframework.core.io.ClassPathResource
//import org.springframework.http.MediaType
////import org.springframework.web.reactive.function.server.RouterFunction
//import org.springframework.web.reactive.function.server.ServerResponse
//import org.springframework.web.reactive.function.server.body
//import org.springframework.web.reactive.function.server.router
//import reactor.core.publisher.Mono
//
////class ViewRoutes(private val ihelloWorld: IHelloWorld) {
//class ViewRoutes(private val ihelloSayer: HelloSayer) {
//
//    private val links = mapOf(
//            "Kotlin" to "https://github.com/JetBrains/kotlin",
//            "Spring" to "https://github.com/JetBrains/kotlin",
//            "React" to "https://github.com/facebook/react",
//            "Full Stack Development" to "https://github.com/Xantier/fullstack-kotlin"
//    )
//
//    @Bean
//    fun viewRouter() =
//            router {
//                accept(MediaType.TEXT_HTML).nest {
//                    /** Enables Reactive-Streams available in Java-9 */
//                    GET("/hi") { req ->
//                        val nameInputIn = req.queryParam("nameInput").orElse("User")
//                        ServerResponse.ok()                         // Mono-Server Type response, makes it a 'funtional-router-bean'
//                                .contentType(MediaType.TEXT_HTML)
//                                .body(Mono.just(
//                                        createHTML(true).html {
//                                            head {
//                                                title("Full Stack Kotlin")
//                                                styleLink("/static/css/hello.css")
//                                            }
//                                            body {
//                                                h4 {
//                                                    +ihelloSayer.sayHelloI(nameInputIn)
//                                                }
//                                                p {
//                                                    +"Welcome to full stack kotlin"
//                                                }
//                                                p {
//                                                    +"Our Resources"
//                                                    ul {
//                                                        links.map { (nameU, url) ->
//                                                            li {
//                                                                a(url) {
//                                                                    target = ATarget.blank
//                                                                    +nameU
//                                                                }
//                                                            }
//                                                        }
//                                                    }
//                                                }
//                                                script(src = "/static/hello.js")
//                                            }
//                                        }
//                                ))
//                    }
//                }
//                resources("/**", ClassPathResource("/static"))
//            }
//}
