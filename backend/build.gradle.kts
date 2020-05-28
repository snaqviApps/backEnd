import org.gradle.api.file.CopySpec
import org.gradle.api.tasks.bundling.Jar
import org.gradle.kotlin.dsl.*
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    repositories {
        maven { setUrl("https://repo.spring.io/milestone") }
    }
    dependencies{
        classpath("org.springframework.boot:spring-boot-gradle-plugin:2.0.0.M3")
    }
}

repositories {
    mavenCentral()
    maven { setUrl("https://repo.spring.io/milestone") }
    maven { setUrl("https://repo.spring.io/snapshot") }
}

plugins {
    kotlin("jvm") version embeddedKotlinVersion
    id("io.spring.dependency-management") version "1.0.3.RELEASE"
    id("org.springframework.boot") version "2.0.4.RELEASE"
}

dependencies {
    compile("org.springframework.boot:spring-boot-starter")
    compile(kotlin("stdlib"))
//    compile(kotlin("stdlib-jre8"))          // changed from line above that worked in initial code
    compile(kotlin("reflect"))
}

val project = mapOf(
    name to "backend"
)

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

/** removed fatJar 'task' as new dependencies above will manage those tasks */