package com.example.miminimart.common.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import com.example.miminimart.common.ui.theme.colors.AppColors
import com.example.miminimart.common.ui.theme.colors.DarkColors
import com.example.miminimart.common.ui.theme.colors.LightColors
import com.example.miminimart.common.ui.theme.size.AppConfigSize
import com.example.miminimart.common.ui.theme.size.AppSize

private val LocalAppColors = staticCompositionLocalOf { LightColors }
private val LocalAppSize = staticCompositionLocalOf { AppConfigSize }


object AppTheme {
    val colors: AppColors
        @Composable @ReadOnlyComposable
        get() = LocalAppColors.current

    val size: AppSize
        @Composable @ReadOnlyComposable
        get() = LocalAppSize.current
}

@Composable
fun AppThemeProvider(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColors else LightColors
    CompositionLocalProvider(LocalAppColors provides colors) {
        content()
    }
}