plugins {
    id ("com.android.library")
    id ("org.jetbrains.kotlin.android")
    id ("kotlin-kapt")
    id ("dagger.hilt.android.plugin")
}

android {
    compileSdk = 32

    defaultConfig {
        minSdk = 23
        targetSdk = 32

        val APP_VERSION = project.property("APP_VERSION") as String
        buildConfigField("String","APP_VERSION",APP_VERSION)

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures{
        dataBinding = true
    }
}

dependencies {
    implementation (project (":domain"))
    implementation (project (":data"))

    implementation (AndroidX.CORE_KTX)
    implementation (AndroidX.APP_COMPAT)
    implementation (Google.MATERIAL)
    implementation (AndroidX.CONSTRAINT_LAYOUT)

    // dagger hilt
    implementation (DaggerHilt.DAGGER_HILT)
    kapt (DaggerHilt.DAGGER_HILT_COMPILER)
    kapt (DaggerHilt.DAGGER_HILT_ANDROIDX_COMPILER)

    // Lifecycle
    implementation (AndroidX.LIFECYCLE_LIVEDATA)
    implementation (AndroidX.LIFECYCLE_VIEWMODEL)
    implementation (AndroidX.LIFECYCLE_VIEWMODEL_SAVEDSTATE)
    kapt (AndroidX.LIFECYCLER_ANNOTATION_PROCESSOR)

    implementation (AndroidX.ACTIVITY)
    implementation (AndroidX.FRAGMENT)

//    // Retrofit
//    implementation (Retrofit.RETROFIT)
//    implementation (Retrofit.CONVERTER_GSON)
//    implementation (Retrofit.CONVERTER_JAXB)
//
//    //okHttp
//    implementation (OkHttp.OKHTTP)
//    implementation (OkHttp.LOGGING_INTERCEPTOR)

    //coroutines
    implementation (Coroutines.COROUTINES)

    //nav component
    implementation (NavComponent.NAVIGATION_FRAGMENT)
    implementation (NavComponent.NAVIGATION_UI)
    implementation (NavComponent.NAVIGATION_DYNAMIC_FEATURES_FRAGMENT)
    implementation (NavComponent.NAVIGATION_COMPOSE)

    testImplementation (Test.JUNIT)

    androidTestImplementation (AndroidTest.EXT_JUNIT)
    androidTestImplementation (AndroidTest.ESPRESSO_CORE)
//    androidTestImplementation (NavComponent.NAVIGATION_TESTING)
}