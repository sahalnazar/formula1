package com.sahalnazar.formula1.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.sahalnazar.formula1.ui.screen.HomeScreen
import com.sahalnazar.formula1.ui.screen.PlaceholderScreen
import com.sahalnazar.formula1.ui.screen.RaceDetailScreen

@Composable
fun NavGraph(
    navController: NavHostController,
    paddingValues: PaddingValues,
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
        modifier = Modifier.padding(paddingValues)
    ) {
        composable(route = Screen.Trophy.route) {
            PlaceholderScreen(title = "Trophy")
        }

        composable(route = Screen.About.route) {
            PlaceholderScreen(title = "About")
        }

        composable(route = Screen.Home.route) {
            HomeScreen(navController = navController)
        }

        composable(route = Screen.Calendar.route) {
            PlaceholderScreen(title = "Calendar")
        }

        composable(route = Screen.Globe.route) {
            PlaceholderScreen(title = "Globe")
        }

        composable(route = Screen.RaceDetail.route) {
            RaceDetailScreen()
        }
    }
}
