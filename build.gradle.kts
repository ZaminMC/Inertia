plugins {
    id("com.gradleup.shadow") version "9.4.2"
}

allprojects {
    apply(plugin = "java")

    group = "org.inertia.Inertia"
    version = "1.0.0"
    description = "Inertia is a base codebase for AntiCheats"

    repositories {
        mavenCentral()
        maven {
            name = "papermc"
            url = uri("https://repo.papermc.io/repository/maven-public/")
        }
    }
}
