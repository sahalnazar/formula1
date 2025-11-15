package com.sahalnazar.formula1.ui.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

data class RiderPage(
    val bgColor: Color = Color.Transparent,
    val riderName: String? = null,
    val riderImage: String? = null,
    val riderPos: String? = null,
    val riderWins: String? = null,

)

@Composable
fun RiderPage(modifier: Modifier = Modifier) {
    
}

@Preview
@Composable
fun RiderPagePreview() {
    RiderPage()
}