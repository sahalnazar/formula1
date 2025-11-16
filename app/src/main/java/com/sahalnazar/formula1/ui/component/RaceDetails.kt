package com.sahalnazar.formula1.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sahalnazar.formula1.ui.theme.AppTheme

@Composable
private fun InfoSection(
    title: String,
    descriptions: List<String>,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
    ) {
        Text(
            text = title,
            style = AppTheme.textStyles.msHeadingBold,
            color = AppTheme.color.white,
            modifier = Modifier.padding(bottom = 12.dp)
        )

        descriptions.forEachIndexed { index, description ->
            Text(
                text = description,
                style = AppTheme.textStyles.msBodyMedium,
                color = AppTheme.color.white
            )

            if (descriptions.size > 1) {
                HorizontalDivider(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 20.dp, bottom = if (index < descriptions.size - 1) 20.dp else 0.dp),
                    thickness = 1.dp,
                    color = Color(0xFF141414)
                )
            }
        }
    }
}

@Composable
fun RaceDetails(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(20.dp)
            .padding(top = 10.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        InfoSection(
            title = "São Paulo Circuit",
            descriptions = listOf(
                "Bahrain International circuit is located in Sakhir, Bahrain and it was designed by German architect Hermann Tilke. It was built on the site of a former camel farm, in Sakhir. It measures 5.412 km, has 15 corne..."
            )
        )

        InfoSection(
            modifier = Modifier.padding(top = 30.dp),
            title = "Circuit Facts",
            descriptions = listOf(
                "His brother Arthur Leclerc is currently set to race for DAMS in the 2023 F2 Championship",
                "He's not related to Édouard Leclerc, the founder of a French supermarket chain"
            )
        )
    }
}
