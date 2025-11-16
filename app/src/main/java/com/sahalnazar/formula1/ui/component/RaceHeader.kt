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
import com.sahalnazar.formula1.ui.theme.AppTheme

@Composable
fun RaceHeader(modifier: Modifier = Modifier) {
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
                        round = "Round 12",
                        raceName = "São Paulo GP",
                        location = "São Paulo",
                        dateRange = "23 - 30 April"
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    StartsInTimer(
                        title = "FP1 Starts in",
                        days = "07",
                        hours = "16",
                        minutes = "42"
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
