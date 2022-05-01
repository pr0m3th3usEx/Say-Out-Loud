package com.pr0m3th3usex.sayoutloud.ui.screens

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

object SignUp {

    @Composable
    fun Email(navController: NavHostController) {
        Text(text = "Register - Step 1")
    }

    @Composable
    fun Username(navController: NavHostController) {
        Text(text = "Register - Step 2")
    }

    @Composable
    fun Password(navController: NavHostController) {
        Text(text = "Register - Step 3")
    }
}