plugins {
    kotlin("jvm") version "1.8.0"
    id("io.ktor.plugin") version "2.3.0"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-core:2.3.0")
    implementation("io.ktor:ktor-server-netty:2.3.0")
    implementation("io.github.resilience4j:resilience4j-kotlin:1.7.0")
    runtimeOnly("ch.qos.logback:logback-classic:1.2.3")
}