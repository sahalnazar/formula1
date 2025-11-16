package com.sahalnazar.formula1.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sahalnazar.formula1.ui.theme.AppTheme

@Composable
fun PlaceholderScreen(
    title: String,
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(AppTheme.color.black)
            .padding(18.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "$title Screen",
            style = AppTheme.textStyles.sgHeadingLarge,
            color = AppTheme.color.white
        )
    }
}
