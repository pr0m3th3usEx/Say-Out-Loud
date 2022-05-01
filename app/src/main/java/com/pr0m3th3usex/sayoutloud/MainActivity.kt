package com.pr0m3th3usex.sayoutloud

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.pr0m3th3usex.sayoutloud.ui.navigation.NavigationGraph.SetupNavigationGraph

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            SetupNavigationGraph(navController)
        }
    }
}
