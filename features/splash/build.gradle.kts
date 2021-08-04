plugins {
    id(ScriptPlugins.ANDROID_LIBRARY_BASE)
    id(BuildPlugins.HILT)
}

dependencies {
    implementation(project(Modules.CORE))
    implementation(project(Modules.NAVIGATION))
}