package com.sahalnazar.formula1.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sahalnazar.formula1.ui.theme.AppTheme

@Composable
fun RaceInfo(
    round: String,
    raceName: String,
    location: String,
    dateRange: String,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(
            text = round,
            style = AppTheme.textStyles.msBodySemiBold,
            color = AppTheme.color.white
        )

        Text(
            text = raceName,
            style = AppTheme.textStyles.msHeadingBlack,
            color = AppTheme.color.white
        )

        Text(
            text = location,
            style = AppTheme.textStyles.msBodySemiBold,
            color = AppTheme.color.brazilGreen
        )

        Text(
            text = dateRange,
            style = AppTheme.textStyles.msBodySemiBold,
            color = AppTheme.color.white
        )
    }
}