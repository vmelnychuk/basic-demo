import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    kotlin("jvm") version "1.3.11"
    id("com.github.johnrengelman.shadow") version "2.0.4"
    java
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    testCompile("junit:junit:4.12")
}

tasks.withType<ShadowJar> {

    baseName = "io.neko"
    classifier = "inajar"
    version = "0.0.1"

    manifest.attributes.apply {
        put("Implementation-Title", "Base Demo")
        put("Main-Class", "io.neko.App")
    }

}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

repositories {
    jcenter()
}
