package com.sahalnazar.formula1.ui.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.sahalnazar.formula1.R

val SpaceGrotesk = FontFamily(
    Font(R.font.space_grotesk_variable, FontWeight.Normal, FontStyle.Normal)
)

val Montserrat = FontFamily(
    Font(R.font.montserrat_variable, FontWeight.Normal)
)

data class AppTextStyles(
    // Space Grotesk Styles
    val sgDisplay: TextStyle = TextStyle(
        fontFamily = SpaceGrotesk,
        fontWeight = FontWeight.Bold,
        fontSize = 164.sp,
        lineHeight = 164.sp,
        letterSpacing = (-12).sp
    ),
    val sgHeadingLarge: TextStyle = TextStyle(
        fontFamily = SpaceGrotesk,
        fontWeight = FontWeight.Light,
        fontSize = 72.sp,
        lineHeight = 70.sp,
        letterSpacing = 0.sp
    ),
    val sgHeadingMedium: TextStyle = TextStyle(
        fontFamily = SpaceGrotesk,
        fontWeight = FontWeight.Bold,
        fontSize = 36.sp,
        lineHeight = 36.sp,
        letterSpacing = 0.sp
    ),
    val sgButtonLarge: TextStyle = TextStyle(
        fontFamily = SpaceGrotesk,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.sp
    ),
    val sgButtonMedium: TextStyle = TextStyle(
        fontFamily = SpaceGrotesk,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        lineHeight = 18.sp,
        letterSpacing = 0.sp
    ),
    val sgCaption: TextStyle = TextStyle(
        fontFamily = SpaceGrotesk,
        fontWeight = FontWeight.Medium,
        fontSize = 10.sp,
        lineHeight = 9.sp,
        letterSpacing = 0.sp
    ),

    // montserrat styles
    val msHeadingBlack: TextStyle = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.Black,
        fontSize = 22.sp,
        lineHeight = 26.sp,
        letterSpacing = 0.sp
    ),
    val msHeadingMedium: TextStyle = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        lineHeight = 18.sp,
        letterSpacing = 0.sp
    ),
    val msButtonLarge: TextStyle = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        lineHeight = 18.sp,
        letterSpacing = 0.sp
    ),
    val msBody: TextStyle = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp,
        lineHeight = 14.sp,
        letterSpacing = 0.sp
    ),
    val msCaptionMedium: TextStyle = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
        lineHeight = 18.sp,
        letterSpacing = 0.sp
    ),
)

val CustomAppTextStyles = AppTextStyles()
