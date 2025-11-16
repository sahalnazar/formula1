package com.sahalnazar.formula1.ui.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sahalnazar.formula1.R
import com.sahalnazar.formula1.ui.theme.AppTheme
import com.sahalnazar.formula1.ui.theme.Formula1Theme

data class UpcomingRaceCardData(
    val name: String,
    val date: String,
    val time: Time,
    val location: String,
    @DrawableRes
    val circuitImage: Int,
)

data class Time(
    val time: String,
    val amOrPm: String,
)

@Composable
fun UpcomingRaceCard(
    modifier: Modifier = Modifier,
    upcomingRaceCardData: UpcomingRaceCardData,
) {
    Surface(
        modifier = modifier,
        shape = RoundedCornerShape(16.dp),
        color = AppTheme.color.darkGreen
    ) {
        Column(
            modifier = Modifier.padding(12.dp),
            verticalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Bottom
            ) {
                Text(
                    text = upcomingRaceCardData.name,
                    style = AppTheme.textStyles.sgBodyNormal,
                    color = AppTheme.color.white
                )

                Image(
                    painter = painterResource(upcomingRaceCardData.circuitImage),
                    contentDescription = null
                )
            }

            Row(
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_calender),
                    contentDescription = null,
                    tint = AppTheme.color.white
                )
                Text(
                    text = upcomingRaceCardData.date,
                    style = AppTheme.textStyles.sgButtonMedium,
                    color = AppTheme.color.white
                )
            }

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier.alignByBaseline(),
                    text = upcomingRaceCardData.time.time,
                    style = AppTheme.textStyles.sgHeadingMedium,
                    color = AppTheme.color.white
                )
                Text(
                    modifier = Modifier.alignByBaseline(),
                    text = upcomingRaceCardData.time.amOrPm,
                    style = AppTheme.textStyles.sgCaptionMedium,
                    color = AppTheme.color.white
                )
            }
        }
    }
}

@Preview(heightDp = 132, widthDp = 163)
@Composable
fun UpcomingRaceCardPreview() {
    Formula1Theme {
        UpcomingRaceCard(
            upcomingRaceCardData = UpcomingRaceCardData(
                name = "FP1",
                date = "04 Friday",
                time = Time(
                    time = "5:00",
                    amOrPm = "PM"
                ),
                location = "Yas Marina Circuit",
                circuitImage = R.drawable.ic_circuit
            )
        )
    }
}