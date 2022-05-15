package com.pr0m3th3usex.sayoutloud.ui.screens.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.google.accompanist.insets.ProvideWindowInsets
import com.pr0m3th3usex.sayoutloud.R
import com.pr0m3th3usex.sayoutloud.ui.components.CustomTextField
import com.pr0m3th3usex.sayoutloud.ui.components.LargeTextButton
import com.pr0m3th3usex.sayoutloud.ui.components.OnBoardingHeader
import com.pr0m3th3usex.sayoutloud.ui.navigation.Screen
import com.pr0m3th3usex.sayoutloud.ui.theme.SayOutLoudTheme

object SignUp {

    @Composable
    fun Email(navController: NavHostController) {
        SayOutLoudTheme() {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colors.background)
                    .padding(vertical = 12.dp, horizontal = 12.dp)
            ) {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Column(
                        verticalArrangement = Arrangement.SpaceBetween,
                        modifier  = Modifier
                            .background(MaterialTheme.colors.background)
                            .fillMaxSize()
                    ) {
                        OnBoardingHeader(
                            modifier = Modifier.weight(2f),
                            text = stringResource(id = R.string.onboarding_title_email_form)
                        )

                        ProvideWindowInsets {
                            Column(modifier = Modifier.weight(2f)) {
                                CustomTextField(
                                    text = "",
                                    placeholder = "Email",
                                )
                            }

                            LargeTextButton(
                                text = stringResource(id = R.string.next_btn),
                                onClick = {
                                    navController.navigate(Screen.Username.route)
                                }
                            )
                        }
                    }
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
                    .padding(vertical = 12.dp, horizontal = 12.dp)
            ) {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Column(
                        verticalArrangement = Arrangement.SpaceBetween,
                        modifier  = Modifier
                            .background(MaterialTheme.colors.background)
                            .fillMaxSize()
                    ) {
                        OnBoardingHeader(
                            modifier = Modifier.weight(2f),
                            text = stringResource(id = R.string.onboarding_title_username_form)
                        )

                        ProvideWindowInsets {
                            Column(modifier = Modifier.weight(2f)) {
                                CustomTextField(
                                    text = "",
                                    placeholder = "Username",
                                )
                            }

                            LargeTextButton(
                                text = stringResource(id = R.string.next_btn),
                                onClick = {
                                    navController.navigate(Screen.Password.route)
                                }
                            )
                        }
                    }
                }
            }
        }
    }

    @Composable
    fun Password(navController: NavHostController) {
        val context = LocalContext.current

        SayOutLoudTheme() {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colors.background)
                    .padding(vertical = 12.dp, horizontal = 12.dp)
            ) {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Column(
                        verticalArrangement = Arrangement.SpaceBetween,
                        modifier  = Modifier
                            .background(MaterialTheme.colors.background)
                            .fillMaxSize()
                    ) {
                        OnBoardingHeader(
                            modifier = Modifier.weight(2f),
                            text = stringResource(id = R.string.onboarding_title_username_form)
                        )

                        ProvideWindowInsets {
                            Column(
                                modifier = Modifier.weight(2f),
                                verticalArrangement = Arrangement.spacedBy(16.dp)
                            ) {
                                CustomTextField(
                                    text = "",
                                    placeholder = stringResource(id = R.string.onboarding_password_form_placeholder),
                                )
                                CustomTextField(
                                    text = "",
                                    placeholder = stringResource(id = R.string.onboarding_password_form_placeholder),
                                )
                            }

                            LargeTextButton(
                                text = stringResource(id = R.string.onboarding_end_btn),
                                onClick = {
                                }
                            )
                        }
                    }
                }
            }
        }
    }
}
