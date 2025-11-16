package com.sahalnazar.formula1.ui.screen.racedetails

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.sahalnazar.formula1.ui.component.RaceDetails
import com.sahalnazar.formula1.ui.component.RaceHeader
import com.sahalnazar.formula1.ui.theme.AppTheme

@Composable
fun RaceDetailsScreen(
    viewModel: RaceDetailViewModel = hiltViewModel()
) {
    val raceHeaderUiData by viewModel.raceHeaderUiData.collectAsStateWithLifecycle()
    val raceDetailsUiData by viewModel.raceDetailsUiData.collectAsStateWithLifecycle()

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(AppTheme.color.black),
    ) {
        item {
            RaceHeader(uiData = raceHeaderUiData)
        }

        item {
            RaceDetails(uiData = raceDetailsUiData)
        }
    }
}
