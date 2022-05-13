package com.pr0m3th3usex.sayoutloud.ui.screens.auth

import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.insets.ProvideWindowInsets
import com.pr0m3th3usex.sayoutloud.IntroActivity
import com.pr0m3th3usex.sayoutloud.MainActivity
import com.pr0m3th3usex.sayoutloud.R
import com.pr0m3th3usex.sayoutloud.ui.components.CustomTextField
import com.pr0m3th3usex.sayoutloud.ui.components.LargeTextButton
import com.pr0m3th3usex.sayoutloud.ui.components.OnBoardingHeader
import com.pr0m3th3usex.sayoutloud.ui.navigation.Screen
import com.pr0m3th3usex.sayoutloud.ui.theme.ButtonColor
import com.pr0m3th3usex.sayoutloud.ui.theme.SayOutLoudTheme

@Composable
fun Login(navController: NavHostController) {
    val context = LocalContext.current;
    var password by remember { mutableStateOf("") }

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
                    modifier  = Modifier.background(MaterialTheme.colors.background)
                ) {
                    OnBoardingHeader(
                        modifier = Modifier.weight(1f),
                        text = stringResource(id = R.string.onboarding_title_login_form)
                    )

                    // Form
                    ProvideWindowInsets {
                        Column(
                            modifier = Modifier.weight(2f).padding(vertical = 24.dp),
                            verticalArrangement = Arrangement.spacedBy(18.dp)
                        ) {
                            CustomTextField(
                                text = "",
                                placeholder = "Email",
                            )
                            CustomTextField(
                                text = password,
                                placeholder = "Password",
                                onChange = {
                                    password = it
                                },
                                visualTransformation = PasswordVisualTransformation(),
                                keyboardType = KeyboardType.Password,
                                imeAction = ImeAction.Done
                            )
                            Spacer(Modifier.size(14.dp))
                            LargeTextButton(text = "Log in", onClick = {
                                context.startActivity(Intent(context, MainActivity::class.java))
                            })
                            Text(
                                text = "I have forgotten my password",
                                color = ButtonColor,
                                modifier = Modifier.clickable { }
                            )
                        }
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center,
                            modifier = Modifier.fillMaxSize().weight(1f)
                        ){
                            Text(
                                text = "Not registered ? Create your account now !",
                                textAlign = TextAlign.Center,
                                modifier = Modifier
                                    .clickable {
                                        navController.popBackStack()
                                        navController.navigate(Screen.SignUpEmail.route)
                                    },
                                color = ButtonColor,
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun LoginPreview() {
    val navController = rememberNavController()
    Login(navController)
}