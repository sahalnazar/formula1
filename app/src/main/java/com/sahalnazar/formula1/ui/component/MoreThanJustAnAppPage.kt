package com.sahalnazar.formula1.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sahalnazar.formula1.R
import com.sahalnazar.formula1.ui.theme.AppTheme
import com.sahalnazar.formula1.ui.theme.Formula1Theme

@Composable
fun MoreThanJustAnAppPage(
    modifier: Modifier = Modifier,
    onFollowUsClick: () -> Unit = {}
) {
    Column(
        modifier
            .background(AppTheme.color.black)
            .statusBarsPadding(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        GetProBadge(
            Modifier
                .padding(top = 14.dp, start = 18.dp)
                .align(Alignment.Start)
        )

        Image(
            painter = painterResource(R.drawable.img_more_just_an_app),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 18.dp)
                .align(Alignment.CenterHorizontally),
            contentScale = ContentScale.Fit
        )

        Surface(
            modifier = Modifier
                .padding(bottom = 60.dp)
                .align(Alignment.CenterHorizontally),
            shape = RoundedCornerShape(55.dp),
            color = AppTheme.color.green,
            onClick = onFollowUsClick
        ) {
            Text(
                text = "Follow Us",
                style = AppTheme.textStyles.msButtonLarge,
                modifier = Modifier.padding(horizontal = 29.dp, vertical = 12.dp),
                color = AppTheme.color.black
            )
        }

    }
}

@Preview(widthDp = 389, heightDp = 420)
@Composable
fun MoreThanJustAnAppPagePreview() {
    Formula1Theme {
        MoreThanJustAnAppPage()
    }
}