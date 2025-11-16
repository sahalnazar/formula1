package com.sahalnazar.formula1.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
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

@Composable
fun EducationCard(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
) {
    Surface(
        modifier = modifier,
        color = AppTheme.color.blue,
        shape = RoundedCornerShape(16.dp),
        onClick = onClick
    ) {
        Row(Modifier.fillMaxWidth()) {
            Row(
                Modifier
                    .weight(1f)
                    .padding(
                        start = 14.dp,
                        top = 14.dp,
                        bottom = 14.dp,
                    ),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {

                Image(
                    painter = painterResource(R.drawable.ic_medium),
                    contentDescription = null,
                    modifier = Modifier
                        .size(32.dp)
                )

                Column(horizontalAlignment = Alignment.Start) {
                    Text(
                        text = "Formula 1",
                        style = AppTheme.textStyles.msCaptionMedium,
                        color = AppTheme.color.white
                    )
                    Text(
                        "Education", style = AppTheme.textStyles.msCaptionMedium,
                        color = AppTheme.color.white
                    )
                }
            }

            Image(
                painter = painterResource(R.drawable.ic_url_arrow),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.Top)
                    .padding(top = 8.dp, end = 8.dp)
                    .size(16.dp)
            )
        }
    }
}

@Preview
@Composable
fun EducationCardPreview() {
    Formula1Theme {
        EducationCard(
            onClick = {}
        )
    }
}