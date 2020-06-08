plugins{
    id("org.jetbrains.kotlin.plugin.spring") version embeddedKotlinVersion
}
dependencies {
    val springBootVersion: String = parent!!.properties["springBootVersion"] as String
    implementation ("org.springframework.boot:spring-boot-starter-web:$springBootVersion")
    implementation ("org.springframework.boot:spring-boot-devtools:$springBootVersion")
}