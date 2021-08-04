object Kotlin {
    const val standardLibrary = "1.5.10"
    const val coroutines = "1.3.9"
}

object BuildAndroidConfiguration {
    const val MIN = 21
    const val COMPILE = 30
    const val TARGET = COMPILE
    const val APPLICATION_ID = "com.huawei.bookmate"
    const val BUILD_TOOLS_VERSION = "30.0.3"
    const val VERSION_CODE = 1
    const val VERSION_NAME = "1"
    const val TEST_INSTRUMENTATION_RUNNER = "androidx.test.runner.AndroidJUnitRunner"

}

object ScriptPlugins {
    const val ANDROID_LIBRARY_BASE = "scripts.android-library-base"
    const val UI_DEPENDENCIES = "scripts.ui-dependencies"
}

object BuildPlugins {
    const val ANDROID_APPLICATION = "com.android.application"
    const val ANDROID_LIBRARY = "com.android.library"
    const val KOTLIN_ANDROID = "kotlin-android"
    const val KOTLIN_KAPT = "kotlin-kapt"
    const val HILT = "dagger.hilt.android.plugin"

}

object Modules {
    const val APP = ":app"
    const val CORE = ":core"
    const val NAVIGATION = ":navigation"

    object Features {
        const val SPLASH = ":features:splash"
    }
}

object Libraries {
    object Versions {
        const val material = "1.4.0"
        const val constraintLayout = "2.1.0"
        const val ktx = "1.6.0"
        const val appCompat = "1.3.1"
        const val hilt = "2.35"
        const val kotlinReflect = "1.4"
        const val navigation = "2.3.5"
    }
    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib:${Kotlin.standardLibrary}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val ktxCore = "androidx.core:core-ktx:${Versions.ktx}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val hiltAndroid = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
    const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:${Kotlin.standardLibrary}"
    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
}

object TestLibraries {
    private object Versions {
        const val junit4 = "4.+"
        const val testExtensions = "1.1.3"
        const val espresso = "3.4.0"
    }
    const val junit4 = "junit:junit:${Versions.junit4}"
    const val testExtJunit = "androidx.test.ext:junit:${Versions.testExtensions}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}