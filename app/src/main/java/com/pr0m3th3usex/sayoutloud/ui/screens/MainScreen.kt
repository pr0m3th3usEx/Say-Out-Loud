package com.pr0m3th3usex.sayoutloud.ui.screens

import android.app.Activity
import android.util.Log
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.pr0m3th3usex.sayoutloud.ui.components.CustomBottomBar
import com.pr0m3th3usex.sayoutloud.ui.components.CustomTopBar
import com.pr0m3th3usex.sayoutloud.ui.navigation.NavigationGraph.MainNavigationGraph
import com.pr0m3th3usex.sayoutloud.ui.theme.Gold400

@Composable
fun MainScreen(navController: NavHostController) {
    val context = LocalContext.current;
    val systemUiController = rememberSystemUiController()
    systemUiController.setNavigationBarColor(Gold400)

    Scaffold(
        topBar = {
             CustomTopBar(title = "Say Out Loud", modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp), titleTextStyle = MaterialTheme.typography.h6)
        },
        bottomBar = {
            CustomBottomBar(navController)
        }
    ) {
        MainNavigationGraph(navController = navController)
    }
}