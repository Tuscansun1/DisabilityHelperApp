

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id ("com.android.application") version "8.5.1" apply false
    id ("org.jetbrains.kotlin.android") version "1.9.0" apply false
    id ("org.jetbrains.compose") version "1.4.3" apply false
    id("org.gradle.version-catalog")
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}
