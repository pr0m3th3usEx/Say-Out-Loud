package com.pr0m3th3usex.sayoutloud.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val screen: Screen,
    val title: String,
    val icon: ImageVector
) {
    object Home : BottomBarScreen(
        screen = Screen.Home,
        title = "Home",
        icon = Icons.Default.Home
    )

    object Profile : BottomBarScreen(
        screen = Screen.Profile,
        title = "Profile",
        icon = Icons.Default.Home
    )
}
