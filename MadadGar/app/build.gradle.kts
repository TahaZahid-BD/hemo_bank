plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services")
    id("kotlin-android")
    id("dagger.hilt.android.plugin")
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
    id("androidx.navigation.safeargs")
    id("kotlin-parcelize")
}

android {
    namespace = "com.taha.madadgar"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.taha.madadgar"
        minSdk = 25
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
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        dataBinding = true
        viewBinding = true
    }
}

dependencies {

    val lifecycle_version = "2.7.0"
    val okhttp_version = "4.9.1"
    val coroutine_version = "1.6.4"
    val dagger_hilt_version = "2.50"
    val nav_version = "2.7.6"

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //Gson
    implementation("com.google.code.gson:gson:2.10")

    // Dagger hilt
    implementation("com.google.dagger:hilt-android:$dagger_hilt_version")
    implementation("androidx.hilt:hilt-navigation-fragment:1.1.0")
    kapt("com.google.dagger:hilt-android-compiler:$dagger_hilt_version")

    // Coroutine
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutine_version")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutine_version")

    // Networking
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.okhttp3:okhttp:$okhttp_version")
    implementation ("com.squareup.okhttp3:logging-interceptor:$okhttp_version")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")

    // ViewModel
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")

    // LiveData
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")

    // Saved state module for ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-savedstate:$lifecycle_version")

    // alternately - if using Java8, use the following instead of lifecycle-compiler
    implementation("androidx.lifecycle:lifecycle-common-java8:$lifecycle_version")

    // Kotlin Navigation Jetpack
    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")

    //SDP
    implementation("com.intuit.sdp:sdp-android:1.1.0")

    //SSP
    implementation("com.intuit.ssp:ssp-android:1.1.0")

    //OTP
    implementation("com.github.GoodieBag:Pinview:v1.5")

    //Country Picker
    implementation("io.michaelrocks:libphonenumber-android:8.12.44")
    implementation("com.github.joielechong:countrycodepicker:2.4.2")

    //Circular ImageView
    implementation("de.hdodenhof:circleimageview:3.1.0")

    //BadgeCounterView
    implementation("com.github.tompadz:BadgeCounterView:1.0.1")

    //Image Cropper
    implementation("com.vanniktech:android-image-cropper:4.5.0")

    //Glide
    implementation("com.github.bumptech.glide:glide:4.13.1")
    annotationProcessor("com.github.bumptech.glide:compiler:4.11.0")

    //Coil
    implementation("io.coil-kt:coil:2.5.0")

    //Image Zoom
    implementation("com.github.chrisbanes:PhotoView:2.3.0")

    //Shimmer
    implementation("com.facebook.shimmer:shimmer:0.5.0")

    //Swip Layout
    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")

    //MultiState View
    implementation("com.github.Kennyc1012:MultiStateView:2.2.0")

    //Powerfull Image Lib
    implementation("io.github.stefanosiano.powerful_libraries:imageview_rs:1.0.25")

    //SpinKit
    implementation("com.github.ybq:Android-SpinKit:1.2.0")

    //Firebase
    implementation("com.google.firebase:firebase-auth-ktx:21.0.2")
    implementation("com.google.firebase:firebase-database-ktx:20.0.4")
}