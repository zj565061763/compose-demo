package com.sd.demo.compose_demo

import android.os.Bundle
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppDisplay().content = {}
    }
}

class AppDisplay : SubDisplay()