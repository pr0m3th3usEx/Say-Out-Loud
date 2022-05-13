package com.pr0m3th3usex.sayoutloud.ui.screens

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.pr0m3th3usex.sayoutloud.ui.components.CustomBottomBar
import com.pr0m3th3usex.sayoutloud.ui.navigation.NavigationGraph.MainNavigationGraph

@Composable
fun MainScreen(navController: NavHostController) {
    Scaffold(
        bottomBar = {
            CustomBottomBar(navController)
        }
    ) {
        MainNavigationGraph(navController = navController)
    }
}