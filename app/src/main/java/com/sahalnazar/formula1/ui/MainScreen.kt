package com.sahalnazar.formula1.ui

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.sahalnazar.formula1.navigation.NavGraph
import com.sahalnazar.formula1.navigation.Screen
import com.sahalnazar.formula1.ui.component.BottomNavBar
import com.sahalnazar.formula1.ui.theme.AppTheme

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    val routeToTabMapping = mapOf(Screen.RaceDetail.route to Screen.Home.route)
    val selectedRoute = routeToTabMapping[currentRoute] ?: currentRoute

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = AppTheme.color.black,
        contentWindowInsets = WindowInsets(0, 0, 0, 0),
        bottomBar = {
            BottomNavBar(
                currentRoute = selectedRoute,
                onNavigate = { route ->
                    navController.navigate(route) {
                        popUpTo(navController.graph.startDestinationId) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    ) { paddingValues ->
        NavGraph(
            navController = navController,
            paddingValues = paddingValues
        )
    }
}
