plugins {
    id ("com.android.application")
    id ("org.jetbrains.kotlin.android")
    id ("kotlin-kapt")
    id ("dagger.hilt.android.plugin")
}

android {
    compileSdk = 32

    defaultConfig {
        applicationId = "com.ej.snackapp"
        minSdk = 23
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"

        val BASE_URL = project.property("MY_URL") as String
        buildConfigField("String","BASE_URL",BASE_URL)

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            isTestCoverageEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
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
    }
}

dependencies {
    implementation (project (":data"))
    implementation (project (":domain"))
    implementation (project (":presentation"))

    implementation (AndroidX.CORE_KTX)
    implementation (AndroidX.APP_COMPAT)
    implementation (AndroidX.CONSTRAINT_LAYOUT)
    implementation (Google.MATERIAL)

    // Retrofit
    implementation (Retrofit.RETROFIT)
    implementation (Retrofit.CONVERTER_GSON)
    implementation (Retrofit.CONVERTER_JAXB)

    //okHttp
    implementation (OkHttp.OKHTTP)
    implementation (OkHttp.LOGGING_INTERCEPTOR)

    // dager hilt
    implementation (DaggerHilt.DAGGER_HILT)
    kapt (DaggerHilt.DAGGER_HILT_COMPILER)
    kapt (DaggerHilt.DAGGER_HILT_ANDROIDX_COMPILER)

    testImplementation (Test.JUNIT)

    androidTestImplementation (AndroidTest.EXT_JUNIT)
    androidTestImplementation (AndroidTest.ESPRESSO_CORE)
}