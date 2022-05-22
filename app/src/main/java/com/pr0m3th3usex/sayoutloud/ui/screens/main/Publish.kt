package com.pr0m3th3usex.sayoutloud.ui.screens.main

import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.pr0m3th3usex.sayoutloud.R
import com.pr0m3th3usex.sayoutloud.ui.components.CustomTextField
import com.pr0m3th3usex.sayoutloud.ui.components.CustomTopBar
import com.pr0m3th3usex.sayoutloud.ui.components.LabelWrapper
import com.pr0m3th3usex.sayoutloud.ui.components.LargeTextButton
import com.pr0m3th3usex.sayoutloud.ui.navigation.Screen

@Composable
fun Publish(navController: NavHostController) {
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(bottom = 96.dp, start = 12.dp, end = 12.dp)) {
        Column(
            modifier = Modifier.fillMaxSize(),
        ) {
            CustomTopBar(title = stringResource(id = R.string.publish_page_title),
                onPrevious = { navController.popBackStack() }
            )

            Column(
                modifier = Modifier
                    .padding(vertical = 59.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(10.dp),
            ) {
                Image(painter = painterResource(id = R.drawable.ic_sound_recorded), contentDescription = "Sound recorded")
                Text(
                    text = "59:59",
                    style = MaterialTheme.typography.body2,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
            }
            LabelWrapper(label = "Title of your record :") {
                CustomTextField(text = "", placeholder = "Ex: My best life pt. 1", isInvalid = it)
            }
        }
        LargeTextButton(
            modifier = Modifier.align(Alignment.BottomEnd),
            text = stringResource(R.string.publish_btn),
            onClick = { navController.navigate(Screen.Profile.route) }
        )
    }
}