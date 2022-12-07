package com.sd.demo.compose_demo

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

open class Display {
    private var _content by mutableStateOf<(@Composable () -> Unit)?>(null)

    fun setContent(content: @Composable () -> Unit) {
        _content = content
    }
}

open class SubDisplay : Display()
