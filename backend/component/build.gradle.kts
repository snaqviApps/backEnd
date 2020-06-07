plugins{
    id("org.jetbrains.kotlin.plugin.spring") version embeddedKotlinVersion
}
dependencies {
    val springBootVersion: String = parent!!.properties["springBootVersion"] as String
    compile ("org.springframework.boot:spring-boot-starter-web:$springBootVersion")
    compile ("org.springframework.boot:spring-boot-devtools:$springBootVersion")
}