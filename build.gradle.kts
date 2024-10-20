import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.8.10"
}

group = "com.imhui.code"
version = "1.0-SNAPSHOT"
description = ""

repositories {
    mavenCentral()
}

dependencies {
    implementation("jakarta.annotation:jakarta.annotation-api:2.1.1")
    implementation("jakarta.inject:jakarta.inject-api:2.0.1")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}