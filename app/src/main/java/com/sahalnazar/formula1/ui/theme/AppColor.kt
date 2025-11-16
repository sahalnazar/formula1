package com.sahalnazar.formula1.ui.theme

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

object AppColor {

    object Team {
        val mcLaren = Color(0xffFF5A08)
    }

    object TextColor {
        val paleYellow = Color(0xffff873a)
        val white = Color(0xFFFFFFFF)
    }

    object IconColor {
        val yellow = Color(0xFFFEE102)
    }

    object GradientColor {

        val linearGradientBrush = Brush.linearGradient(
            colors = listOf(
                TextColor.white,
                Team.mcLaren
            ),
            start = Offset(0f, 0f),
            end = Offset(0f, Float.POSITIVE_INFINITY)
        )

    }
}