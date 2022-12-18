import Versions.ANDROIDX_COMPAT
import Versions.ANDROIDX_CONSTRAINT_LAYOUT_VERSION
import Versions.ANDROIDX_CORE_KTX_VERSION
import Versions.DAGGER_VERSION
import Versions.EXPRESSO_CORE
import Versions.EXT_JUNIT_VERSION
import Versions.GOOGLE_MATERIAL_VERSION
import Versions.HILT_COMPILER_VERSION
import Versions.JAVAX_INJECT_VERSION
import Versions.JUNIT_VERSION

//import Versions.NAV_VERSION



object Versions {
    const val NAV_VERSION = "2.4.0-alpha10"

    // Dagger Hilt
    const val DAGGER_VERSION = "2.44"
    const val HILT_VERSION = "1.0.0"
    const val HILT_COMPILER_VERSION = "1.0.0"
    const val JAVAX_INJECT_VERSION = "1"

    // AndroidX
    const val ANDROIDX_CORE_KTX_VERSION = "1.8.0"
    const val ANDROIDX_COMPAT = "1.5.1"
    const val ANDROIDX_CONSTRAINT_LAYOUT_VERSION = "2.1.4"

    // Google
    const val GOOGLE_MATERIAL_VERSION = "1.7.0"

    // Test
    const val JUNIT_VERSION = "4.13.2"

    // AndroidTest
    const val EXT_JUNIT_VERSION = "1.1.4"
    const val EXPRESSO_CORE = "3.5.0"

}

//object Kotlin {
//    const val SDK = "org.jetbrains.java:java-stdlib-jdk8:1.5.21"
//}

object AndroidX {
    const val CORE_KTX = "androidx.core:core-ktx:$ANDROIDX_CORE_KTX_VERSION"
    const val APP_COMPAT = "androidx.appcompat:appcompat:$ANDROIDX_COMPAT"
    const val MATERIAL = "androidx.compose.material:material:1.0.0-rc02"
    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:$ANDROIDX_CONSTRAINT_LAYOUT_VERSION"

    const val LEGACY = "androidx.legacy:legacy-support-v4:1.0.0"
    const val LIFECYCLE_VIEW_MODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.0"
    const val LIFECYCLE_LIVEDATA = "androidx.lifecycle:lifecycle-livedata-ktx:2.3.1"
    const val ACTIVITY = "androidx.activity:activity-ktx:1.3.1"
    const val FRAGMENT = "androidx.fragment:fragment-ktx:1.5.2"
    const val DATASTORE = "androidx.datastore:datastore-preferences:1.0.0"
}

object Google {
    const val MATERIAL = "com.google.android.material:material:$GOOGLE_MATERIAL_VERSION"
}

object Test {
    const val JUNIT = "junit:junit:$JUNIT_VERSION"
    const val ANDROID_JUNIT_RUNNER = "AndroidJUnitRunner"
}

object AndroidTest {
    const val EXT_JUNIT = "androidx.test.ext:junit:$EXT_JUNIT_VERSION"
//    const val TEST_RUNNER = "androidx.test:runner:1.4.0"
    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:$EXPRESSO_CORE"
}

object DaggerHilt {
    const val DAGGER_HILT = "com.google.dagger:hilt-android:$DAGGER_VERSION"
    const val DAGGER_HILT_COMPILER = "com.google.dagger:hilt-android-compiler:$DAGGER_VERSION"
    const val DAGGER_HILT_ANDROIDX_COMPILER = "androidx.hilt:hilt-compiler:$HILT_COMPILER_VERSION"
    const val DAGGER_HILT_JAVAX = "javax.inject:javax.inject:$JAVAX_INJECT_VERSION"
}
//
//object Retrofit {
//    const val RETROFIT = "com.squareup.retrofit2:retrofit:2.9.0"
//    const val CONVERTER_GSON = "com.squareup.retrofit2:converter-gson:2.9.0"
//    const val CONVERTER_JAXB = "com.squareup.retrofit2:converter-jaxb:2.9.0"
//}
//
//object OkHttp {
//    const val OKHTTP = "com.squareup.okhttp3:okhttp:4.9.1"
//    const val LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:4.9.1"
//}
//
//object Coroutines {
//    const val COROUTINES = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2"
//    const val COROUTINES_PLAY_SERVICES = "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.1.1"
//}
//
//object NavComponent {
//    const val NAVIGATION_FRAGMENT = "androidx.navigation:navigation-fragment-ktx:$NAV_VERSION"
//    const val NAVIGATION_UI = "androidx.navigation:navigation-ui-ktx:$NAV_VERSION"
//    const val NAVIGATION_DYNAMIC_FEATURES_FRAGMENT = "androidx.navigation:navigation-dynamic-features-fragment:$NAV_VERSION"
//    const val NAVIGATION_TESTING = "androidx.navigation:navigation-testing:$NAV_VERSION"
//    const val NAVIGATION_COMPOSE = "androidx.navigation:navigation-compose:2.4.0-alpha10"
//}
//
//object Firebase{
//    const val FIREBASE_DATABASE_KTX = "com.google.firebase:firebase-database-ktx:20.0.3"
//    const val FIREBASE_FIRESTORE_KTX = "com.google.firebase:firebase-firestore-ktx:24.0.0"
//}
//
//object TestTool {
//    const val JUNIT = "junit:junit:4.+"
//    const val ANDROID_X_JUNIT = "androidx.test.ext:junit:1.1.3"
//    const val ANDROID_X_ESPRESSO = "androidx.test.espresso:espresso-core:3.4.0"
//}