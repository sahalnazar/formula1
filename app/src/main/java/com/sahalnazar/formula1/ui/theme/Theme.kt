package com.sahalnazar.formula1.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf

val LocalAppTextStyles = staticCompositionLocalOf { CustomAppTextStyles }

object AppTheme {
    val textStyles: AppTextStyles
        @Composable
        get() = LocalAppTextStyles.current
}

@Composable
fun Formula1Theme(
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(LocalAppTextStyles provides CustomAppTextStyles) {
        MaterialTheme(
            content = content
        )
    }
}