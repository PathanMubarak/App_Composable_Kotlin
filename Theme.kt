package com.example.app_composable_kotlin

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColors = lightColorScheme(
    primary = Color(0xFF6200EE),
    secondary = Color(0xFF03DAC5),
    background = Color.White
)

private val DarkColors = darkColorScheme(
    primary = Color(0xFF3700B3),
    secondary = Color(0xFF03DAC5),
    background = Color.Black
)

@Composable
fun AppComposableKotlinTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColors else LightColors
    MaterialTheme(
        colorScheme = colors,
        content = content
    )
}
