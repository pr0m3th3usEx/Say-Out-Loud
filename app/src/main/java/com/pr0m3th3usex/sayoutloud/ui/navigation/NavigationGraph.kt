package com.pr0m3th3usex.sayoutloud.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pr0m3th3usex.sayoutloud.ui.screens.*
import com.pr0m3th3usex.sayoutloud.ui.screens.auth.Introduction
import com.pr0m3th3usex.sayoutloud.ui.screens.auth.Login
import com.pr0m3th3usex.sayoutloud.ui.screens.auth.SignUp
import com.pr0m3th3usex.sayoutloud.ui.screens.main.Profile
import com.pr0m3th3usex.sayoutloud.ui.screens.main.Publish
import com.pr0m3th3usex.sayoutloud.ui.screens.main.Record
import com.pr0m3th3usex.sayoutloud.ui.screens.main.settings.Settings

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

            signUpGraph(navController)
        }
    }

    @Composable
    fun MainNavigationGraph(navController: NavHostController, startDestination: String = "home", setIsBottomBarVisible: (v: Boolean) -> Unit = {}) {
        NavHost(navController, startDestination) {
            composable(route = Screen.Home.route) {
                Home(navController)
            }

            composable(route = Screen.Record.route) {
                Record(navController, setIsBottomBarVisible)
            }

            composable(route = Screen.Profile.route) {
                Profile(navController)
            }

            composable(route = Screen.Publish.route) {
                Publish(navController)
            }

            settingsGraph(navController)
        }
    }

    private fun NavGraphBuilder.settingsGraph(navController: NavHostController) {
        navigation(startDestination = Screen.SettingsHome.route, route = Screen.Settings.route) {
            composable(route =  Screen.SettingsHome.route) {
                Settings.Home(navController)
            }
        }
    }

    private fun NavGraphBuilder.signUpGraph(navController: NavHostController) {
        navigation(startDestination = Screen.Email.route, route = Screen.SignUp.route) {
            composable(route = Screen.Email.route) {
                SignUp.Email(navController)
            }

            composable(route = Screen.Username.route) {
                SignUp.Username(navController)
            }

            composable(route = Screen.Password.route) {
                SignUp.Password(navController)
            }
        }
    }
}
