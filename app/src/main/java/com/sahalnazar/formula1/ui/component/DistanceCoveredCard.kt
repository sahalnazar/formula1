package com.sahalnazar.formula1.ui.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sahalnazar.formula1.R
import com.sahalnazar.formula1.ui.theme.AppTheme
import com.sahalnazar.formula1.ui.theme.Formula1Theme

@Composable
fun DistanceCoveredCard(
    modifier: Modifier = Modifier,
    currentDistance: Float,
    totalDistance: Float,
    distanceUnit: String,
) {
    val progress: Float = if (totalDistance > 0) {
        (currentDistance / totalDistance).coerceIn(0f, 1f)
    } else {
        0.0f
    }

    Surface(
        modifier = modifier,
        border = BorderStroke(width = 1.dp, color = AppTheme.color.darkGray),
        shape = RoundedCornerShape(16.dp),
        color = Color.Transparent
    ) {
        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            Spacer(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(progress)
                    .background(AppTheme.color.red)
            )

            Row(
                modifier = Modifier.padding(vertical = 16.dp, horizontal = 8.dp),
                horizontalArrangement = Arrangement.spacedBy(2.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_route),
                    contentDescription = null,
                    tint = AppTheme.color.white,
                    modifier = Modifier.size(28.dp)
                )

                Row(verticalAlignment = Alignment.Bottom) {
                    Text(
                        modifier = Modifier.alignByBaseline(),
                        text = currentDistance.toString(),
                        style = AppTheme.textStyles.sgDisplayLarge,
                        color = AppTheme.color.white
                    )
                    Text(
                        modifier = Modifier.alignByBaseline(),
                        text = distanceUnit,
                        style = AppTheme.textStyles.sgDisplayMedium,
                        color = AppTheme.color.white
                    )
                }
            }
        }
    }
}

@Preview(
    showBackground = true,
    backgroundColor = 0xFF000000
)
@Composable
fun DistanceCoveredCardPreview() {
    Formula1Theme {
        DistanceCoveredCard(
            modifier = Modifier.size(height = 60.dp, width = 163.dp),
            currentDistance = 342f,
            totalDistance = 500f,
            distanceUnit = "KM"
        )
    }
}