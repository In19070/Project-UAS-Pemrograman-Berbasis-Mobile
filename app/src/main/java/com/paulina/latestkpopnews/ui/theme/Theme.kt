package com.paulina.latestkpopnews.ui.theme

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Define your color palette
private val LightColorScheme = lightColorScheme(
    primary = PrimaryColor,
    onPrimary = OnPrimaryColor,
    secondary = SecondaryColor,
    onSecondary = OnSecondaryColor,
    background = BackgroundColor,
    onBackground = OnBackgroundColor,
    surface = SurfaceColor,
    onSurface = OnSurfaceColor,
    error = ErrorColor,
    onError = OnErrorColor
)

private val DarkColorScheme = darkColorScheme(
    primary = PrimaryColor,
    onPrimary = OnPrimaryColor,
    secondary = SecondaryColor,
    onSecondary = OnSecondaryColor,
    background = SurfaceColor,
    onBackground = OnSurfaceColor,
    surface = BackgroundColor,
    onSurface = OnBackgroundColor,
    error = ErrorColor,
    onError = OnErrorColor
)

@Composable
fun LatestkpopnewsTheme(
    darkTheme: Boolean = false, // Set to true for dark theme
    content: @Composable () -> Unit
) {
    // Use the appropriate color scheme based on the theme
    val colorScheme = if (darkTheme) {
        DarkColorScheme
    } else {
        LightColorScheme
    }

    // Provide the MaterialTheme with the defined color scheme
    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography, // You can define your typography in a separate file
        shapes = Shapes, // You can define your shapes in a separate file
        content = content
    )
}