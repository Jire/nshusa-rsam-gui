import org.gradle.jvm.toolchain.JvmVendorSpec

plugins {
    java
    application
    id("com.github.johnrengelman.shadow")
}

version = "1.0.7"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
        vendor.set(JvmVendorSpec.BELLSOFT)
    }
}

application {
    mainClass.set("io.nshusa.App")
}

tasks {
    javadoc {
        options.encoding = "UTF-8"
    }
    compileJava {
        options.encoding = "UTF-8"
    }
    compileTestJava {
        options.encoding = "UTF-8"
    }
}

dependencies {
    implementation("org.apache.commons:commons-compress:1.23.0")
    implementation("com.google.code.gson:gson:2.10.1")
    implementation(files("lib/jfxrt.jar"))
    implementation(files("lib/rsam-1.0.4.jar"))
}