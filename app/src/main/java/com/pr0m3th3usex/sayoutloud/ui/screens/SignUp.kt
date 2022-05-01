package com.pr0m3th3usex.sayoutloud.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.pr0m3th3usex.sayoutloud.R
import com.pr0m3th3usex.sayoutloud.ui.components.OnBoardingHeader
import com.pr0m3th3usex.sayoutloud.ui.theme.SayOutLoudTheme

object SignUp {

    @Composable
    fun Email(navController: NavHostController) {
        SayOutLoudTheme() {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colors.background)
                    .padding(vertical = 12.dp, horizontal = 24.dp)
            ) {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    OnBoardingHeader(text = stringResource(id = R.string.onboarding_title_email_form))
                }
            }
        }
    }

    @Composable
    fun Username(navController: NavHostController) {
        SayOutLoudTheme() {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colors.background)
                    .padding(vertical = 12.dp, horizontal = 24.dp)
            ) {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    OnBoardingHeader(text = stringResource(id = R.string.onboarding_title_username_form))
                }
            }
        }
    }

    @Composable
    fun Password(navController: NavHostController) {
        SayOutLoudTheme() {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colors.background)
                    .padding(vertical = 12.dp, horizontal = 24.dp)
            ) {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    OnBoardingHeader(text = stringResource(id = R.string.onboarding_title_password_form))
                }
            }
        }
    }
}