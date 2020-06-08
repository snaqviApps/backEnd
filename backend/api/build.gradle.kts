plugins{
    id("org.jetbrains.kotlin.plugin.spring") version embeddedKotlinVersion
}
apply {
    plugin("org.springframework.boot")
}
dependencies {
    val springBootVersion: String = parent!!.properties["springBootVersion"] as String
    val kotlinHtmlVersion: String = properties["kotlinHtmlVersion"] as String
    implementation (project(":backend:component"))
    implementation ("org.springframework.boot:spring-boot-starter-web:$springBootVersion")
    implementation ("org.springframework.boot:spring-boot-devtools:$springBootVersion")

    implementation ("org.jetbrains.kotlinx:kotlinx-html-jvm:$kotlinHtmlVersion")

}