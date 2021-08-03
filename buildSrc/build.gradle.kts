object Dependencies {
    const val AndroidBuildTools = "com.android.tools.build:gradle:4.2.2"
    const val KotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.10"
}
plugins {
    `kotlin-dsl`
}
repositories {
    jcenter()
    google()
}

dependencies {
    implementation(Dependencies.AndroidBuildTools)
    implementation(Dependencies.KotlinGradlePlugin)
}