package scripts

import org.gradle.api.JavaVersion
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.withType

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")

}

android {
    compileSdkVersion(BuildAndroidConfiguration.COMPILE)
    buildToolsVersion(BuildAndroidConfiguration.BUILD_TOOLS_VERSION)
    defaultConfig {
        minSdkVersion(BuildAndroidConfiguration.MIN)
        targetSdkVersion(BuildAndroidConfiguration.TARGET)
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles (getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    configure<JavaPluginConvention> {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            jvmTarget = JavaVersion.VERSION_1_8.toString()
        }
    }
}

dependencies {
    implementation(Libraries.kotlinStdLib)
    implementation(Libraries.kotlinReflect)
    implementation(Libraries.ktxCore)
    implementation(Libraries.appCompat)
    implementation(Libraries.material)
    implementation(Libraries.constraintLayout)
    implementation(Libraries.navigationFragment)
    implementation(Libraries.navigationUi)
    implementation(Libraries.hiltAndroid)
    implementation(Libraries.timber)
    kapt(Libraries.hiltCompiler)
    testImplementation(TestLibraries.junit4)
    androidTestImplementation(TestLibraries.testExtJunit)
    androidTestImplementation(TestLibraries.espressoCore)
}