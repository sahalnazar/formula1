package com.sahalnazar.formula1.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sahalnazar.formula1.ui.theme.AppTheme

@Composable
private fun TimerUnit(
    value: String,
    label: String,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = value,
            style = AppTheme.textStyles.msTimerLarge,
            color = AppTheme.color.brazilGreen
        )
        Text(
            text = label,
            style = AppTheme.textStyles.msTimerLabel,
            color = AppTheme.color.white
        )
    }
}

@Composable
fun StartsInTimer(
    title: String,
    days: String,
    hours: String,
    minutes: String,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(
            text = title,
            style = AppTheme.textStyles.msTimerHeading,
            color = AppTheme.color.white
        )

        Row(
            horizontalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            TimerUnit(value = days, label = "Days")
            TimerUnit(value = hours, label = "Hours")
            TimerUnit(value = minutes, label = "Minutes")
        }
    }
}