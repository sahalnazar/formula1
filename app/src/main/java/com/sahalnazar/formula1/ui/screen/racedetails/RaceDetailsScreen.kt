package com.sahalnazar.formula1.ui.screen.racedetails

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sahalnazar.formula1.ui.component.RaceDetails
import com.sahalnazar.formula1.ui.component.RaceHeader
import com.sahalnazar.formula1.ui.theme.AppTheme

@Composable
fun RaceDetailsScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(AppTheme.color.black),
    ) {
        item {
            RaceHeader()
        }

        item {
            RaceDetails()
        }
    }
}
