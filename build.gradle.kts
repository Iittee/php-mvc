plugins {
    alias(libs.plugins.android.application) // Apply Android Application plugin
    alias(libs.plugins.google.services) // Apply Google services plugin for Firebase, etc.
}

android {
    namespace = "com.example.guestbook"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.guestbook"
        minSdk = 21
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
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation(libs.firebase.firestore)
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation("com.android.volley:volley:1.2.1")
    implementation("com.google.firebase:firebase-auth:21.2.0")
    implementation("com.google.firebase:firebase-database:20.0.6") // Firebase Database dependency
    implementation(libs.firebase.auth) // If using version catalogs
}
