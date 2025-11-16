package com.sahalnazar.formula1.ui.theme

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

object AppColor {

    val mcLaren = Color(0xffFF5A08)
    val paleYellow = Color(0xffff873a)
    val white = Color(0xFFFFFFFF)
    val yellow = Color(0xFFFEE102)


    val green = Color(0xff86FF0E)
    val black = Color(0xFF000000)

    val linearGradientBrush = Brush.linearGradient(
        colors = listOf(
            white,
            mcLaren
        ),
        start = Offset(0f, 0f),
        end = Offset(0f, Float.POSITIVE_INFINITY)
    )
}