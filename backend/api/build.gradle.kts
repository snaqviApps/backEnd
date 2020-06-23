plugins{
    id("org.jetbrains.kotlin.plugin.spring") version embeddedKotlinVersion
}
apply {
    plugin("org.springframework.boot")
}
dependencies {
    val springBootVersion: String = parent!!.properties["springBootVersion"] as String
    val springBootVersion_flux: String = properties["springBootVersionWebflux"] as String
    val kotlinHtmlVersion: String = properties["kotlinHtmlVersion"] as String
    implementation (project(":backend:component"))
//    implementation ("org.springframework.boot:spring-boot-starter-webflux:$springBootVersion_flux")   // web -> webflux
    implementation ("org.springframework.boot:spring-boot-starter-webflux:$springBootVersion")   // web -> webflux

    implementation ("org.springframework.boot:spring-boot-devtools:$springBootVersion")
    implementation ("org.jetbrains.kotlinx:kotlinx-html-jvm:$kotlinHtmlVersion")
}