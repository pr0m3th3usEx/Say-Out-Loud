package com.pr0m3th3usex.sayoutloud.ui.navigation

import android.content.res.Resources
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import com.pr0m3th3usex.sayoutloud.R

sealed class Screen(val route: String, val title: String, val icon: Int? = null) {
    object Splash : Screen("splash", "Splash")
    object Introduction : Screen("intro", "Introduction")
    object Login : Screen("login", "Login")
    object SignUpEmail : Screen("signup-email", "Sign Up")
    object SignUpUsername : Screen("signup-username", "Sign Up")
    object SignUpPassword : Screen("signup-password", "Sign Up")
    object Profile : Screen("profile", "Profile", icon = R.drawable.ic_profile)
    object Home : Screen("home", "Home", icon = R.drawable.ic_home)
    object Record : Screen("record", "Record", icon = R.drawable.ic_record)
    object Publish : Screen("publish", "Publish")
    object SettingsHome : Screen("settings-home", "Settings")
}
