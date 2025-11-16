package com.sahalnazar.formula1.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sahalnazar.formula1.ui.theme.AppTheme

@Composable
fun RaceDetailScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AppTheme.color.black)
            .statusBarsPadding()
            .padding(18.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Race Details",
            style = AppTheme.textStyles.sgHeadingMedium,
            color = AppTheme.color.white
        )

        Text(
            text = "Race details will be displayed here",
            style = AppTheme.textStyles.sgBodyNormal,
            color = AppTheme.color.lightGray
        )
    }
}
