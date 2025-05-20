package org.example.multiplatformnotesapp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Multi-Platform-Notes-App",
    ) {
        App()
    }
}