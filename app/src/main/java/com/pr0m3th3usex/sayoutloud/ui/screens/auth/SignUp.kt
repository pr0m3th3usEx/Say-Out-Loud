package com.pr0m3th3usex.sayoutloud.ui.screens.auth

import android.app.Activity
import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.google.accompanist.insets.ProvideWindowInsets
import com.pr0m3th3usex.sayoutloud.MainActivity
import com.pr0m3th3usex.sayoutloud.R
import com.pr0m3th3usex.sayoutloud.ui.components.CustomTextField
import com.pr0m3th3usex.sayoutloud.ui.components.LabelWrapper
import com.pr0m3th3usex.sayoutloud.ui.components.LargeTextButton
import com.pr0m3th3usex.sayoutloud.ui.components.OnBoardingHeader
import com.pr0m3th3usex.sayoutloud.ui.navigation.Screen
import com.pr0m3th3usex.sayoutloud.ui.theme.SayOutLoudTheme

enum class RegistrationSteps {
    EMAIL,
    USERNAME,
    PASSWORD,
}

object SignUp {

    @Composable
    fun SignUpStepper(navController: NavHostController) {
        val context = LocalContext.current;
        var registrationStep by remember { mutableStateOf(RegistrationSteps.EMAIL) }

        val onEmailNext = {
            registrationStep = RegistrationSteps.USERNAME
        }

        val onUsernameNext = {
            registrationStep = RegistrationSteps.PASSWORD
        }

        val onPasswordNext: () -> Unit = {
            context.startActivity(Intent(context, MainActivity::class.java))
            (context as? Activity)?.finish()
        }

        SayOutLoudTheme {
            when (registrationStep) {
                RegistrationSteps.EMAIL -> Email(onNext = onEmailNext)
                RegistrationSteps.USERNAME -> Username(onNext = onUsernameNext)
                RegistrationSteps.PASSWORD -> Password(onSubmit = onPasswordNext)
            }
        }
    }

    @Composable
    fun Email(onNext: () -> Unit = {}) {
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
                            LabelWrapper(label = "Enter an email address :") {
                                CustomTextField(
                                    isInvalid = it,
                                    text = "",
                                    placeholder = "Email",
                                )
                            }
                        }

                        LargeTextButton(
                            text = stringResource(id = R.string.next_btn),
                            onClick = onNext
                        )
                    }
                }
            }
        }
    }

    @Composable
    fun Username(onNext: () -> Unit = {}) {
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
                            LabelWrapper(label = "Enter your username :") {
                                CustomTextField(
                                    isInvalid = it,
                                    text = "",
                                    placeholder = "Username",
                                )
                            }
                        }

                        LargeTextButton(
                            text = stringResource(id = R.string.next_btn),
                            onClick = onNext
                        )
                    }
                }
            }
        }
    }

    @Composable
    fun Password(onSubmit: () -> Unit = {}) {
        val context = LocalContext.current

        ProvideWindowInsets(windowInsetsAnimationsEnabled = true) {
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
                            text = stringResource(id = R.string.onboarding_title_password_form)
                        )
                        Column(
                            modifier = Modifier.weight(2f),
                            verticalArrangement = Arrangement.spacedBy(16.dp)
                        ) {
                            LabelWrapper(label = "Enter your password :") {
                                CustomTextField(
                                    isInvalid = it,
                                    text = "",
                                    placeholder = stringResource(id = R.string.onboarding_password_form_placeholder),
                                )
                            }
                            LabelWrapper(label = "Confirm your password :") {
                                CustomTextField(
                                    isInvalid = it,
                                    text = "",
                                    placeholder = stringResource(id = R.string.onboarding_password_form_placeholder),
                                )
                            }
                        }
                        LargeTextButton(
                            text = stringResource(id = R.string.onboarding_end_btn),
                            onClick = onSubmit,
                        )
                    }
                }
            }
        }
    }
}
