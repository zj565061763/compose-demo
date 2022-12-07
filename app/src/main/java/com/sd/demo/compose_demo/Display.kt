package com.sd.demo.compose_demo

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

open class Display {
    var content by mutableStateOf<(@Composable () -> Unit)?>(null)
}

open class SubDisplay : Display()
