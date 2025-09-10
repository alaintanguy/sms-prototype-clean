plugins {
  id("com.android.application")
  id("org.jetbrains.kotlin.android")
}
android {
  namespace = "com.example.wearproto"
  compileSdk = 34
  defaultConfig {
    applicationId = "com.example.wearproto"
    minSdk = 26
    targetSdk = 34
    versionCode = 1
    versionName = "1.0"
  }
  compileOptions { sourceCompatibility = JavaVersion.VERSION_17; targetCompatibility = JavaVersion.VERSION_17 }
  kotlinOptions { jvmTarget = "17" }
  buildTypes {
    release {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
  }
}
dependencies {
  implementation("androidx.core:core-ktx:1.13.1")
  implementation("androidx.appcompat:appcompat:1.7.0")
  implementation("androidx.wear:wear:1.3.0")
  implementation("com.google.android.gms:play-services-wearable:18.1.0")
}
