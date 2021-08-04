plugins {
    id(BuildPlugins.ANDROID_APPLICATION)
    id(BuildPlugins.KOTLIN_ANDROID)
    id(BuildPlugins.KOTLIN_KAPT)
    id(BuildPlugins.HILT)
}

android {
    compileSdkVersion(BuildAndroidConfiguration.COMPILE)
    buildToolsVersion(BuildAndroidConfiguration.BUILD_TOOLS_VERSION)

    defaultConfig {
        applicationId = BuildAndroidConfiguration.APPLICATION_ID
        minSdkVersion(BuildAndroidConfiguration.MIN)
        targetSdkVersion(BuildAndroidConfiguration.TARGET)
        versionCode = BuildAndroidConfiguration.VERSION_CODE
        versionName = BuildAndroidConfiguration.VERSION_NAME

        testInstrumentationRunner = BuildAndroidConfiguration.TEST_INSTRUMENTATION_RUNNER
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
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
    implementation(Libraries.hiltAndroid)
    kapt(Libraries.hiltCompiler)
    implementation(Libraries.navigationFragment)
    implementation(Libraries.navigationUi)
    implementation(project(Modules.CORE))
    implementation(project(Modules.NAVIGATION))
    implementation(project(Modules.Features.SPLASH))


    testImplementation(TestLibraries.junit4)
    androidTestImplementation(TestLibraries.testExtJunit)
    androidTestImplementation(TestLibraries.espressoCore)
}