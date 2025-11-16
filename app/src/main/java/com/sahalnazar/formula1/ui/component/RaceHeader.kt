package com.sahalnazar.formula1.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.sahalnazar.formula1.R
import com.sahalnazar.formula1.ui.screen.racedetails.RaceHeaderUiData
import com.sahalnazar.formula1.ui.theme.AppTheme

@Composable
fun RaceHeader(
    uiData: RaceHeaderUiData?,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.fillMaxWidth()
    ) {
        Image(
            painter = painterResource(R.drawable.bg_race_detail_header),
            contentDescription = null,
            modifier = Modifier.matchParentSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .statusBarsPadding()
                .fillMaxWidth(),
        ) {
            Text(
                text = "Upcoming race",
                style = AppTheme.textStyles.msHeaderSemiBold,
                color = AppTheme.color.white,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            )

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(20.dp)
            ) {

                Column(Modifier.weight(1f)) {
                    RaceInfo(
                        round = uiData?.round ?: "Round --",
                        raceName = uiData?.raceName ?: "No Race",
                        location = uiData?.location ?: "--",
                        dateRange = uiData?.dateRange ?: "--"
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    StartsInTimer(
                        title = "${uiData?.nextSessionName ?: "Session"} Starts in",
                        days = uiData?.daysUntil ?: "00",
                        hours = uiData?.hoursUntil ?: "00",
                        minutes = uiData?.minutesUntil ?: "00"
                    )
                }

                Image(
                    painter = painterResource(R.drawable.img_3d_circuit),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .padding(horizontal = 12.dp)
                )
            }
        }
    }
}
