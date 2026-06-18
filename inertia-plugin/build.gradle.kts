plugins {
    id("java")
    id("xyz.jpenilla.run-paper") version "3.0.2"
    id("com.gradleup.shadow") version "9.4.2"
}

dependencies {
    implementation(project(":inertia-api"))
    implementation(project(":inertia-checks"))
    implementation(project(":inertia-core"))
    implementation(project(":inertia-packets"))
    implementation(project(":inertia-version"))
    implementation(project(":inertia-simulation"))
    implementation(project(":inertia-testkit"))

    compileOnly("io.papermc.paper:paper-api:1.21.11-R0.1-SNAPSHOT")
}
tasks {
    processResources {
        val props = mapOf("version" to project.version, "description" to project.description)
        inputs.properties(props)
        filteringCharset = "UTF-8"

        filesMatching("plugin.yml") {
            expand(props)
        }
    }

    runServer {
        downloadPlugins {

        }

        minecraftVersion("26.1.2")
    }
    // runFolia
    runPaper.folia.registerTask()

    shadowJar {
        configurations = project.configurations.runtimeClasspath.map { setOf(it) }
        archiveClassifier.set("")
    }
}