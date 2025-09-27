plugins {
    kotlin("jvm") version "1.9.24"
    application
}
repositories { mavenCentral() }

dependencies { testImplementation(kotlin("test")) }

tasks.test { useJUnitPlatform() }

kotlin { jvmToolchain(17) }

dependencies {
    testImplementation(kotlin("test")) // trae kotlin.test
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.2")
}

application {
    mainClass.set("com.example.app.AppKt")
}
