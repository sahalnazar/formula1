package com.sahalnazar.formula1.ui.theme

import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontVariation
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.sahalnazar.formula1.R

@OptIn(ExperimentalTextApi::class)
val SpaceGrotesk = FontFamily(
    Font(
        resId = R.font.space_grotesk_variable,
        weight = FontWeight.Light,
        variationSettings = FontVariation.Settings(
            FontVariation.weight(300)
        )
    ),
    Font(
        resId = R.font.space_grotesk_variable,
        weight = FontWeight.Normal,
        variationSettings = FontVariation.Settings(
            FontVariation.weight(400)
        )
    ),
    Font(
        resId = R.font.space_grotesk_variable,
        weight = FontWeight.Medium,
        variationSettings = FontVariation.Settings(
            FontVariation.weight(500)
        )
    ),
    Font(
        resId = R.font.space_grotesk_variable,
        weight = FontWeight.Bold,
        variationSettings = FontVariation.Settings(
            FontVariation.weight(700)
        )
    )
)

@OptIn(ExperimentalTextApi::class)
val Montserrat = FontFamily(
    Font(
        resId = R.font.montserrat_variable,
        weight = FontWeight.Normal,
        variationSettings = FontVariation.Settings(
            FontVariation.weight(400)
        )
    ),
    Font(
        resId = R.font.montserrat_variable,
        weight = FontWeight.SemiBold,
        variationSettings = FontVariation.Settings(
            FontVariation.weight(600)
        )
    ),
    Font(
        resId = R.font.montserrat_variable,
        weight = FontWeight.Bold,
        variationSettings = FontVariation.Settings(
            FontVariation.weight(700)
        )
    ),
    Font(
        resId = R.font.montserrat_variable,
        weight = FontWeight.Black,
        variationSettings = FontVariation.Settings(
            FontVariation.weight(900)
        )
    )
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
    val sgDisplayLarge: TextStyle = TextStyle(
        fontFamily = SpaceGrotesk,
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    val sgDisplayMedium: TextStyle = TextStyle(
        fontFamily = SpaceGrotesk,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
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
    val sgBodyMedium: TextStyle = TextStyle(
        fontFamily = SpaceGrotesk,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 14.sp,
        letterSpacing = 0.sp
    ),
    val sgBodyNormal: TextStyle = TextStyle(
        fontFamily = SpaceGrotesk,
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp,
        lineHeight = 14.sp,
        letterSpacing = 0.sp
    ),
    val sgCaption: TextStyle = TextStyle(
        fontFamily = SpaceGrotesk,
        fontWeight = FontWeight.Medium,
        fontSize = 10.sp,
        lineHeight = 9.sp,
        letterSpacing = 0.sp
    ),
    val sgCaptionMedium: TextStyle = TextStyle(
        fontFamily = SpaceGrotesk,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        lineHeight = 36.sp,
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
        fontSize = 16.sp,
        lineHeight = 18.sp,
        letterSpacing = 0.sp
    ),
    val msButtonLarge: TextStyle = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        lineHeight = 20.sp,
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
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.sp
    ),
    val msHeaderSemiBold: TextStyle = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.04.sp,
        lineHeight = 16.04.sp,
        letterSpacing = 0.sp
    ),
    val msBodySemiBold: TextStyle = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp,
        lineHeight = 14.sp,
        letterSpacing = 0.sp
    ),
    val msHeadingBold: TextStyle = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        lineHeight = 18.sp,
        letterSpacing = 0.sp
    ),
    val msBodyMedium: TextStyle = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
        lineHeight = 18.sp,
        letterSpacing = 0.sp
    ),
    val msTimerLarge: TextStyle = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.Medium,
        fontSize = 28.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    val msTimerLabel: TextStyle = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.Medium,
        fontSize = 8.sp,
        lineHeight = 12.sp,
        letterSpacing = 0.sp
    ),
    val msTimerHeading: TextStyle = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.Medium,
        fontSize = 10.sp,
        lineHeight = 12.sp,
        letterSpacing = 0.sp
    ),
)

val CustomAppTextStyles = AppTextStyles()
