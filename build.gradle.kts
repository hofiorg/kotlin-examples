plugins {
    kotlin("jvm") version "1.9.24"
    application
}

kotlin {
    jvmToolchain(21)
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.junit.jupiter:junit-jupiter:5.10.2")

    testImplementation(kotlin("test"))
    testImplementation(kotlin("test-junit"))
    testImplementation("org.mockito:mockito-core:5.12.0")
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass.set("kotlin_examples.AppKt")
}