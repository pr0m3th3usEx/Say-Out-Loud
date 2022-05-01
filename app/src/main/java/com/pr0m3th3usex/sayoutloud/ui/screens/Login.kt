package com.pr0m3th3usex.sayoutloud.ui.screens

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.pr0m3th3usex.sayoutloud.ui.theme.SayOutLoudTheme

@Composable
fun Login(navController: NavHostController) {
    SayOutLoudTheme() {
        Text("Login")
    }
}