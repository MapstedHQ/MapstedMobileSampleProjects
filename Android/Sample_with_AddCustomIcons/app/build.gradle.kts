
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.mapsted.sampleaddcustomicons"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.mapsted.sampleaddcustomicons"
        minSdk = 26
        manifestPlaceholders["versionCode"] = "1"
        manifestPlaceholders["dateString"] = "2026-07-09"
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
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
    packaging {
        resources.excludes.add("META-INF/gradle/*")
        resources.excludes.add("META-INF/*")
    }

    buildFeatures {
        dataBinding = true
    }

}

kotlin {
    compilerOptions {
        jvmTarget = org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_1_8
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.firebase.messaging.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // Mapsted
    implementation(libs.sdk.loc.share)
    implementation(libs.sdk.core)
    implementation(libs.sdk.map.ui)
    implementation(libs.sdk.map)
    implementation(libs.sdk.loc.marketing)
    implementation(libs.sdk.geofence)
    implementation(libs.sdk.inapp.notification)

}