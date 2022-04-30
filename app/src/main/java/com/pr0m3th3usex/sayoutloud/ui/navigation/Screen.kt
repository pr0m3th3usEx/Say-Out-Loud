package com.pr0m3th3usex.sayoutloud.ui.navigation

sealed class Screen(val route: String) {
    object Splash : Screen("splash")
    object Home : Screen("home")
    object Introduction : Screen("intro")
    object Login : Screen("login")
    object SignUpEmail : Screen("signup-email")
    object SignUpUsername : Screen("signup-username")
    object SignUpPassword : Screen("signup-password")
    object Profile : Screen("profile")
    object SettingsHome: Screen("settings-home")
    object Record : Screen("record")
    object Publish : Screen("publish")
}