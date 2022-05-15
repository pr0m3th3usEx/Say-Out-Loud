package com.pr0m3th3usex.sayoutloud.ui.components

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.pr0m3th3usex.sayoutloud.ui.navigation.Screen
import com.pr0m3th3usex.sayoutloud.ui.theme.Gold400

@Composable
fun CustomBottomBar(navController: NavHostController) {
    val screens = listOf(
        Screen.Home,
        Screen.Record,
        Screen.Profile,
    )

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    BottomNavigation(
        backgroundColor = Gold400,
        contentColor = if (isSystemInDarkTheme()) Color.White else Color.Black,
    ) {
        screens.forEach {
            AddItem(
                screen = it,
                currentDestination = currentDestination,
                navController = navController
            )
        }
    }
}

@Composable
fun RowScope.AddItem(
    screen: Screen,
    currentDestination: NavDestination?,
    navController: NavHostController,
) {
    BottomNavigationItem(
        onClick = {
            navController.navigate(screen.route)
        },
        icon = {
            if (screen.icon != null) {
                Icon(
                    painter = painterResource(screen.icon),
                    contentDescription = "Et c'est pas fini"
                )
            }
        },
        selected = currentDestination?.hierarchy?.any {
            it.route === screen.route
        } === true,
        alwaysShowLabel = false,
    )
}