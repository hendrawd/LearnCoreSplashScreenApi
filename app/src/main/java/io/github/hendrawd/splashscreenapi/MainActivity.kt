package io.github.hendrawd.splashscreenapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // TODO 5 call installSplashScreen() before setContentView
        installSplashScreen()
        setContentView(R.layout.activity_main)
    }
}