// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Dependencies.android.gradlePlugin)
        classpath(Dependencies.kotlin.gradlePlugin)
        classpath(Dependencies.google.hilt.gradlePlugin)
        classpath(Dependencies.androidX.navigation.safeArgPlugin)
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}