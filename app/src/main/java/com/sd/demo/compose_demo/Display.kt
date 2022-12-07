package com.sd.demo.compose_demo

import androidx.compose.runtime.Composable

open class Display {
    var content: @Composable () -> Unit = {}
}

open class SubDisplay : Display()
