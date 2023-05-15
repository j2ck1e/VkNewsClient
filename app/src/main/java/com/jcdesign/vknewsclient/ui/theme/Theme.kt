package com.jcdesign.vknewsclient.ui.theme

import android.annotation.SuppressLint
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

import androidx.compose.ui.graphics.Color

@SuppressLint("ConflictingOnColor")
private val DarkColorPalette = darkColors(
    primary = Black900,
    secondary = Black900,
    primaryVariant = Black900,

//    background = Color.Black,
//    surface = Color.Black,
    onPrimary = Color.White,
    onSecondary = Black500
//    onBackground = Color.White,
//    onSurface = Color.White,
)

@SuppressLint("ConflictingOnColor")
private val LightColorPalette = lightColors(
    primary = Color.White,
    secondary = Color.White,
    primaryVariant = Color.White,

//    background = Color.White,
//    surface = Color.White,
    onPrimary = Black900,
    onSecondary = Black500,
//    onBackground = Color.Black,
//    onSurface = Color.Black,

    )

@Composable
fun VkNewsClientTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = when {

        darkTheme -> DarkColorPalette
        else -> LightColorPalette
    }


    MaterialTheme(
        colors = colors,
        typography = Typography,
        content = content
    )
}