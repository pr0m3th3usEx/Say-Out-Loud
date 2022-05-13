package com.pr0m3th3usex.sayoutloud.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.pr0m3th3usex.sayoutloud.ui.screens.*
import com.pr0m3th3usex.sayoutloud.ui.screens.auth.Introduction
import com.pr0m3th3usex.sayoutloud.ui.screens.auth.Login
import com.pr0m3th3usex.sayoutloud.ui.screens.auth.SignUp
import com.pr0m3th3usex.sayoutloud.ui.screens.main.Profile
import com.pr0m3th3usex.sayoutloud.ui.screens.main.Record

object NavigationGraph {
    @Composable
    fun AuthNavigationGraph(navController: NavHostController, startDestination: String = "splash") {
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

    @Composable
    fun MainNavigationGraph(navController: NavHostController, startDestination: String =  "home") {
        NavHost(navController, startDestination) {
            composable(route = Screen.Home.route) {
                Home(navController)
            }

            composable(route = Screen.Record.route) {
                Record(navController)
            }

            composable(route = Screen.Profile.route) {
                Profile(navController)
            }
        }
    }
}
