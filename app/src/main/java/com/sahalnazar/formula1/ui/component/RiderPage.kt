package com.sahalnazar.formula1.ui.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sahalnazar.formula1.R
import com.sahalnazar.formula1.ui.theme.AppColor
import com.sahalnazar.formula1.ui.theme.AppTheme

data class RiderPageData(
    val bgColor: Color,
    val riderName: String,
    @DrawableRes val riderImage: Int,
    val riderPos: Int,
    val riderWins: Int,
    val riderPts: Int,
)

@Composable
fun RiderPage(
    modifier: Modifier = Modifier,
    data: RiderPageData,
) {
    Box(
        modifier = modifier
            .background(data.bgColor)
            .fillMaxWidth()
    ) {

        Text(
            modifier = Modifier.padding(top = 18.dp, start = 18.dp),
            text = data.riderName,
            style = AppTheme.textStyles.sgDisplay,
            color = AppColor.TextColor.paleYellow,
            overflow = TextOverflow.Clip,
            maxLines = 1
        )

        Image(
            painter = painterResource(data.riderImage),
            contentDescription = null,
            modifier = Modifier
                .padding(top = 18.dp)
                .align(Alignment.BottomEnd)
                .fillMaxHeight(0.84f),
            contentScale = ContentScale.Crop
        )

        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .fillMaxHeight(0.5f)
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent, Color.Black
                        )
                    )
                )
        )

        Image(
            painter = painterResource(R.drawable.ic_get_pro),
            contentDescription = null,
            modifier = Modifier
                .padding(top = 14.dp, start = 18.dp)
                .size(height = 26.dp, width = 89.dp)
        )


        RiderStats(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(horizontal = 26.dp, vertical = 42.dp),
            position = data.riderPos,
            wins = data.riderWins,
            points = data.riderPts
        )

    }
}


@Preview(widthDp = 389, heightDp = 420)
@Composable
fun RiderPagePreview() {
    val data = RiderPageData(
        bgColor = AppColor.Team.mcLaren,
        riderName = "Lando Norris",
        riderImage = R.drawable.img_lando_norris,
        riderPos = 18,
        riderWins = 2,
        riderPts = 20,
    )
    RiderPage(data = data)
}