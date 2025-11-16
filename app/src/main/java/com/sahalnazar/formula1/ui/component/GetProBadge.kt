package com.sahalnazar.formula1.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sahalnazar.formula1.R
import com.sahalnazar.formula1.ui.theme.AppTheme

@Composable
fun GetProBadge(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier
            .size(height = 26.dp, width = 89.dp),
        color = AppTheme.color.white.copy(alpha = .1f),
        shape = RoundedCornerShape(20.dp),
        onClick = {

        }
    ) {
        Image(
            painter = painterResource(R.drawable.ic_get_pro),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp, horizontal = 8.dp)
        )
    }
}