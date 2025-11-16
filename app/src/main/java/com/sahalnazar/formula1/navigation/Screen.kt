package com.sahalnazar.formula1.navigation

sealed class Screen(val route: String) {
    data object Trophy : Screen("trophy")
    data object About : Screen("about")
    data object Home : Screen("home")
    data object Calendar : Screen("calendar")
    data object Globe : Screen("globe")
    data object RaceDetail : Screen("race_detail")
}
