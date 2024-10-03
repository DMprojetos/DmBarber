plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.example.barber"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.barber"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        compose=true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.0" // Verifique se essa é a versão mais recente
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
}

dependencies {
    // Dependências do Compose
    implementation("androidx.compose.ui:ui:1.5.0")
    implementation("androidx.compose.material:material:1.5.0")
    implementation("androidx.compose.ui:ui-tooling-preview:1.5.0")
    implementation("androidx.activity:activity-compose:1.7.0")
    implementation ("androidx.compose.ui:ui:1.4.0")
    implementation ("androidx.compose.material3:material3:1.0.0")
    implementation ("androidx.activity:activity-compose:1.6.1")

    // Dependências do Lifecycle
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")

    // Dependências do AndroidX
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)

    // Dependências de Teste
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
