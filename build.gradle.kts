plugins {
    id("java")
    kotlin("jvm")
    id("com.diffplug.spotless") version "6.25.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation(kotlin("stdlib-jdk8"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}

spotless {
    java {
        googleJavaFormat("1.15.0")
        indentWithTabs(2)
        indentWithSpaces(4)
        removeUnusedImports()
    }
}