package com.pr0m3th3usex.sayoutloud.ui.components

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pr0m3th3usex.sayoutloud.R

@Composable
fun OnBoardingHeader(text: String, modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(24.dp),
        modifier = modifier
            .fillMaxWidth()
            .background(MaterialTheme.colors.background)
            .padding(horizontal = 24.dp, vertical = 16.dp)
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_logo),
            contentDescription = "Logo",
            tint = if (isSystemInDarkTheme()) Color.White else Color.Black,
            modifier = Modifier.size(48.dp)
        )

        Text(
            text,
            style = MaterialTheme.typography.h2,
            textAlign = TextAlign.Center,
        )
    }
}

@Composable
@Preview
fun OnBoardingHeaderPreview() {
    OnBoardingHeader(text = "Welcome back !")
}

@Composable
@Preview(uiMode = UI_MODE_NIGHT_YES)
fun OnBoardingHeaderDarkPreview() {
    OnBoardingHeader(text = "Welcome back !")
}