package com.pr0m3th3usex.sayoutloud.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextGeometricTransform
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.pr0m3th3usex.sayoutloud.R
import com.pr0m3th3usex.sayoutloud.ui.theme.Gold100
import com.pr0m3th3usex.sayoutloud.ui.theme.IntroGradient
import com.pr0m3th3usex.sayoutloud.ui.theme.SayOutLoudTheme

@Composable
fun Introduction(navController: NavHostController) {
    SayOutLoudTheme() {
        var sizeImage by remember { mutableStateOf(IntSize.Zero) }

        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {

            Image(
                painterResource(id = R.drawable.intro_background),
                contentDescription = "Intro Background Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()
                    .onGloballyPositioned {
                        sizeImage = it.size
                    }
            )
            Box(modifier = Modifier
                .matchParentSize()
                .background(IntroGradient))

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 12.dp, vertical = 24.dp)
            ) {
                Text(stringResource(R.string.app_name), color = Color.White, style = MaterialTheme.typography.h1)
                Text(
                    stringResource(R.string.app_slogan),
                    color = Color.White,
                    style = MaterialTheme.typography.h2,
                    textAlign = TextAlign.Center
                )

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(12.dp),
                ) {
                    Button(onClick = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(
                                RoundedCornerShape(corner = CornerSize(18.dp))
                            )
                    ) {
                        Text(
                            stringResource(R.string.onboarding_login_btn).uppercase(),
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(vertical = 12.dp)
                        )
                    }
                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(
                                RoundedCornerShape(corner = CornerSize(18.dp))
                            )
                    ) {
                        Text(
                            stringResource(R.string.onboarding_signup_btn).uppercase(),
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(vertical = 12.dp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
@Preview
fun IntroductionPreview() {
    val navController = rememberNavController()
    Introduction(navController)
}