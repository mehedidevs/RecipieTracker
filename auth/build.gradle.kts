plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

apply(from = "$rootDir/compose-module.gradle")

android {
    namespace = "com.plcoding.onboarding_presentation"
}

dependencies {

}