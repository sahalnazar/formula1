package com.sahalnazar.formula1.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.sahalnazar.formula1.R
import com.sahalnazar.formula1.navigation.Screen
import com.sahalnazar.formula1.ui.theme.AppTheme

@Composable
fun BottomNavBar(
    currentRoute: String?,
    onNavigate: (String) -> Unit,
) {
    BottomAppBar(
        modifier = Modifier
            .navigationBarsPadding()
            .background(AppTheme.color.black2)
            .fillMaxWidth(),
        containerColor = AppTheme.color.black2,
        windowInsets = WindowInsets(0, 0, 0, 0)
    ) {
        NavigationBarItem(
            selected = currentRoute == Screen.Home.route,
            onClick = { onNavigate(Screen.Home.route) },
            icon = {
                Icon(
                    painter = painterResource(R.drawable.ic_home),
                    contentDescription = "Home"
                )
            },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = AppTheme.color.white,
                unselectedIconColor = AppTheme.color.lightGray,
                indicatorColor = AppTheme.color.darkGray
            )
        )

        NavigationBarItem(
            selected = currentRoute == Screen.Calendar.route,
            onClick = { onNavigate(Screen.Calendar.route) },
            icon = {
                Icon(
                    painter = painterResource(R.drawable.ic_calendar),
                    contentDescription = "Calendar"
                )
            },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = AppTheme.color.white,
                unselectedIconColor = AppTheme.color.lightGray,
                indicatorColor = AppTheme.color.darkGray
            )
        )

        NavigationBarItem(
            selected = currentRoute == Screen.Trophy.route,
            onClick = { onNavigate(Screen.Trophy.route) },
            icon = {
                Icon(
                    painter = painterResource(R.drawable.ic_trophy),
                    contentDescription = "Trophy"
                )
            },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = AppTheme.color.white,
                unselectedIconColor = AppTheme.color.lightGray,
                indicatorColor = AppTheme.color.darkGray
            )
        )


        NavigationBarItem(
            selected = currentRoute == Screen.Globe.route,
            onClick = { onNavigate(Screen.Globe.route) },
            icon = {
                Icon(
                    painter = painterResource(R.drawable.ic_globe),
                    contentDescription = "Globe"
                )
            },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = AppTheme.color.white,
                unselectedIconColor = AppTheme.color.lightGray,
                indicatorColor = AppTheme.color.darkGray
            )
        )

        NavigationBarItem(
            selected = currentRoute == Screen.About.route,
            onClick = { onNavigate(Screen.About.route) },
            icon = {
                Icon(
                    painter = painterResource(R.drawable.ic_about),
                    contentDescription = "About"
                )
            },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = AppTheme.color.white,
                unselectedIconColor = AppTheme.color.lightGray,
                indicatorColor = AppTheme.color.darkGray
            )
        )
    }
}
