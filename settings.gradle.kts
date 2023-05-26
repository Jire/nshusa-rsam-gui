rootProject.name = "RSAM"

dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")

    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

pluginManagement {
    plugins {
        id("com.github.johnrengelman.shadow") version "8.1.1"
    }
}
