import org.gradle.api.file.CopySpec
import org.gradle.api.tasks.bundling.Jar
import org.gradle.kotlin.dsl.*
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile



plugins {
    id("org.jetbrains.kotlin.jvm") version "1.3.72"
}

buildscript {
    val springBootVersion: String = properties["springBootVersion"] as String
    repositories {
        maven { setUrl("https://repo.spring.io/milestone") }
    }
    dependencies{
        classpath("org.springframework.boot:spring-boot-gradle-plugin:$springBootVersion")
    }
}

subprojects {
    repositories {
        mavenCentral()
        maven { setUrl("https://repo.spring.io/milestone") }
        maven { setUrl("https://repo.spring.io/snapshot") }
    }

    apply {
        plugin("kotlin")
    }

    dependencies {
        implementation(kotlin("stdlib-jdk8"))          // changed from line above that worked in initial code
//        compile(kotlin("stdlib"))          // changed from line above that worked in initial code
        implementation(kotlin("reflect"))
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }
}

/** removed fatJar 'task' as new dependencies above will manage those tasks */