import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val kotestVersion: String by project

plugins {
    kotlin("jvm") version "1.5.10"
    application
    id("org.jmailen.kotlinter") version "3.9.0"
}

group = "me.shengyou"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("io.kotest:kotest-runner-junit5:$kotestVersion")
    testImplementation("io.kotest:kotest-assertions-core:$kotestVersion")
    testImplementation("io.kotest:kotest-property:$kotestVersion")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

application {
    mainClass.set("MainKt")
}