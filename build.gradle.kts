// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false // Apply the Android Application plugin in the app module
    alias(libs.plugins.google.services) apply false // Apply the Google Services plugin where required
}
