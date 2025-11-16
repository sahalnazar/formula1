package com.sahalnazar.formula1.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sahalnazar.formula1.R
import com.sahalnazar.formula1.ui.theme.AppTheme
import com.sahalnazar.formula1.ui.theme.Formula1Theme

@Composable
fun RiderStats(
    modifier: Modifier = Modifier,
    position: Int,
    wins: Int,
    points: Int,
) {
    Column(
        modifier = modifier, verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            RiderCompactStats(
                icon = getIcon(RiderStatsIcon.POSITION),
                value = position.toString(),
                title = "Pos"
            )
            RiderCompactStats(
                icon = getIcon(RiderStatsIcon.WINS),
                value = wins.toString(),
                title = "Wins"
            )
        }

        Row(
            horizontalArrangement = Arrangement.spacedBy(4.dp), verticalAlignment = Alignment.Bottom
        ) {
            Text(
                modifier = Modifier.alignByBaseline(),
                text = points.toString(),
                style = AppTheme.textStyles.sgHeadingLarge.copy(brush = AppTheme.color.linearGradientBrush)
            )
            Surface(
                modifier = Modifier.alignByBaseline(), color = AppTheme.color.mcLaren, shape = RoundedCornerShape(5.dp)
            ) {
                Text(
                    text = "PTS",
                    style = AppTheme.textStyles.sgBodyMedium,
                    color = AppTheme.color.white,
                    modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                )
            }
        }
    }
}

@Composable
fun RiderCompactStats(
    icon: Painter,
    value: String,
    title: String,
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(4.dp), verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = icon, contentDescription = null, modifier = Modifier.size(16.dp), tint = AppTheme.color.yellow
        )
        Text(
            text = value,
            style = AppTheme.textStyles.sgButtonLarge,
            color = AppTheme.color.white,
            modifier = Modifier.alignByBaseline()
        )
        Text(
            text = title,
            style = AppTheme.textStyles.sgCaption,
            color = AppTheme.color.white,
            modifier = Modifier.alignByBaseline()
        )
    }
}

@Composable
private fun getIcon(icon: RiderStatsIcon): Painter {
    return when (icon) {
        RiderStatsIcon.POSITION -> painterResource(R.drawable.ic_position)
        RiderStatsIcon.WINS -> painterResource(R.drawable.ic_wins)
    }
}

enum class RiderStatsIcon {
    POSITION, WINS
}

@Preview
@Composable
fun RiderStatsPreview() {
    Formula1Theme {
        Box(
            modifier = Modifier
                .background(AppTheme.color.mcLaren)
                .padding(26.dp)
        ) {
            RiderStats(
                position = 1, wins = 3, points = 331
            )
        }
    }
}

@Preview
@Composable
fun RiderCompactStatsPreview() {
    Formula1Theme {
        Box(
            modifier = Modifier
                .background(AppTheme.color.mcLaren)
                .padding(16.dp)
        ) {
            RiderCompactStats(
                icon = painterResource(R.drawable.ic_position), value = "1", title = "Pos"
            )
        }
    }
}