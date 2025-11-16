package com.sahalnazar.formula1.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.sahalnazar.formula1.ui.screen.home.HomeScreen
import com.sahalnazar.formula1.ui.screen.placeholder.PlaceholderScreen
import com.sahalnazar.formula1.ui.screen.racedetails.RaceDetailViewModel
import com.sahalnazar.formula1.ui.screen.racedetails.RaceDetailsScreen

private const val HOME_GRAPH_ROUTE = "home_graph"

@Composable
fun NavGraph(
    navController: NavHostController,
    paddingValues: PaddingValues
) {
    NavHost(
        navController = navController,
        startDestination = HOME_GRAPH_ROUTE,
        modifier = Modifier.padding(paddingValues)
    ) {
        composable(route = Screen.Trophy.route) {
            PlaceholderScreen(title = "Trophy")
        }

        composable(route = Screen.About.route) {
            PlaceholderScreen(title = "About")
        }

        homeNavigationGraph(navController = navController)

        composable(route = Screen.Calendar.route) {
            PlaceholderScreen(title = "Calendar")
        }

        composable(route = Screen.Globe.route) {
            PlaceholderScreen(title = "Globe")
        }
    }
}

fun NavGraphBuilder.homeNavigationGraph(
    navController: NavHostController
) {
    navigation(
        route = HOME_GRAPH_ROUTE,
        startDestination = Screen.Home.route
    ) {
        composable(route = Screen.Home.route) { backStackEntry ->
            val parentEntry = remember(backStackEntry) {
                navController.getBackStackEntry(HOME_GRAPH_ROUTE)
            }
            val raceDetailViewModel: RaceDetailViewModel = hiltViewModel(parentEntry)

            HomeScreen(
                navController = navController,
                raceDetailViewModel = raceDetailViewModel
            )
        }

        composable(route = Screen.RaceDetail.route) { backStackEntry ->
            val parentEntry = remember(backStackEntry) {
                navController.getBackStackEntry(HOME_GRAPH_ROUTE)
            }
            val raceDetailViewModel: RaceDetailViewModel = hiltViewModel(parentEntry)

            RaceDetailsScreen(viewModel = raceDetailViewModel)
        }
    }
}
