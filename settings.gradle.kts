rootProject.name = "basic-demo"

include("core", "ui", "http")

pluginManagement {
    repositories {
        jcenter()
        gradlePluginPortal()
        maven {
           url = uri("https://plugins.gradle.org/m2/")
        }
    }
}

gradle.allprojects {
    buildscript {
        repositories {
            jcenter()
            maven {
                url = uri("https://plugins.gradle.org/m2/")
            }
        }
    }
    repositories {
        jcenter()
    }
}
