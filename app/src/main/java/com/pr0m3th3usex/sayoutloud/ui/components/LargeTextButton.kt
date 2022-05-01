package com.pr0m3th3usex.sayoutloud.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pr0m3th3usex.sayoutloud.R
import com.pr0m3th3usex.sayoutloud.ui.theme.ButtonColor

@Composable
fun LargeTextButton(modifier: Modifier = Modifier, text: String, whiteVersion: Boolean = false, onClick: () -> Unit = {}) {
    Button(
        onClick,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = if (whiteVersion) Color.White else ButtonColor,
        ),
        modifier = modifier
            .fillMaxWidth()
            .clip(
                RoundedCornerShape(corner = CornerSize(18.dp))
            )
    ) {
        Text(
            text.uppercase(),
            color = if (whiteVersion) Color.Black else Color.White,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(vertical = 12.dp)
        )
    }
}

@Composable
@Preview
fun LargeTextButtonPreview() {
    LargeTextButton(text = "EXAMPLE")
}

@Composable
@Preview
fun WhiteLargeTextButtonPreview() {
    LargeTextButton(text = "EXAMPLE", whiteVersion = true)
}