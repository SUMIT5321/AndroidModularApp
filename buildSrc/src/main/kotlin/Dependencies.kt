object Dependencies {
    val android = Android
    object Android {
        const val gradlePlugin= "com.android.tools.build:gradle:${Version.gradlePlugin}"

        object Version {
            const val gradlePlugin = "7.0.4"
        }
    }

    val androidX = AndroidX
    object AndroidX {
        const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
        const val appCompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

        val navigation = Navigation
        object Navigation {
            const val safeArgPlugin = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}"
            const val fragmentKtx = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
            const val uiKtx = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
            const val dynamicFeaturesFragment = "androidx.navigation:navigation-dynamic-features-fragment:${Versions.navigation}"
            const val testing = "androidx.navigation:navigation-testing:${Versions.navigation}"
        }

        val test = Test
        object Test {
            const val extJunit = "androidx.test.ext:junit:${Versions.extJunit}"
            const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espresso}"
        }

        object Versions {
            const val coreKtx = "1.7.0"
            const val appcompat = "1.4.0"
            const val constraintLayout = "2.1.2"
            const val navigation = "2.3.5"

            // test
            const val extJunit = "1.1.3"
            const val espresso = "3.4.0"
        }
    }

    val kotlin = Kotlin
    object Kotlin {
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
        const val stdLibJdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"

        object  Versions {
            const val kotlin = "1.6.10"
        }
    }

    val google = Google
    object Google {
        const val material = "com.google.android.material:material:${Versions.material}"

        val hilt = Hilt
        object Hilt {
            const val gradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hiltPlugin}"
            const val hiltAndroid = "com.google.dagger:hilt-android:${Versions.hilt}"
            const val compiler = "com.google.dagger:hilt-compiler:${Versions.hilt}"
            const val androidTesting = "com.google.dagger:hilt-android-testing:${Versions.hilt}"
            const val androidCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
        }

        object Versions {
            const val material = "1.4.0"
            const val hilt = "2.38.1"
            const val hiltPlugin = "2.40.5"
        }
    }

    val junit = Junit
    object Junit {
        const val junit = "junit:junit:${Versions.junit}"

        object Versions {
            const val junit = "4.+"
        }
    }
}