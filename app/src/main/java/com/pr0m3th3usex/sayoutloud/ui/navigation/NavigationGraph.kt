package com.pr0m3th3usex.sayoutloud.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.pr0m3th3usex.sayoutloud.ui.screens.AnimatedSplash
import com.pr0m3th3usex.sayoutloud.ui.screens.Introduction
import com.pr0m3th3usex.sayoutloud.ui.screens.Login
import com.pr0m3th3usex.sayoutloud.ui.screens.SignUp

object NavigationGraph {
    @Composable
    fun SetupNavigationGraph(navController: NavHostController, startDestination: String = "splash") {
        NavHost(navController, startDestination) {
            composable(route = Screen.Splash.route) {
                AnimatedSplash(navController)
            }

            composable(route = Screen.Introduction.route) {
                Introduction(navController)
            }

            composable(route = Screen.Login.route) {
                Login(navController)
            }

            composable(route = Screen.SignUpEmail.route) {
                SignUp.Email(navController)
            }

            composable(route = Screen.SignUpUsername.route) {
                SignUp.Username(navController)
            }

            composable(route = Screen.SignUpPassword.route) {
                SignUp.Password(navController)
            }
        }
    }
}
