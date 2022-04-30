package com.pr0m3th3usex.sayoutloud.ui.navigation

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.pr0m3th3usex.sayoutloud.ui.screens.AnimatedSplash

object NavigationGraph {
    @Composable
    fun SetupNavigationGraph(navController: NavHostController, startDestination: String = "splash") {
        NavHost(navController, startDestination) {
            composable(route = Screen.Splash.route) {
                AnimatedSplash(navController)
            }
        }
    }
}