package com.pr0m3th3usex.sayoutloud.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.pr0m3th3usex.sayoutloud.R

val RedHatDisplay = FontFamily(
    Font(R.font.red_hat_display_regular),
    Font(R.font.red_hat_display_bold, FontWeight.Bold),
    Font(R.font.red_hat_display_italic, FontWeight.Normal, FontStyle.Italic),
    Font(R.font.red_hat_display_bold_italic, FontWeight.Bold, FontStyle.Italic),
    Font(R.font.red_hat_display_light, FontWeight.Light),
    Font(R.font.red_hat_display_light_italic, FontWeight.Light, FontStyle.Italic)
)

val Oxygen = FontFamily(
    Font(R.font.oxygen_regular),
    Font(R.font.oxygen_bold, FontWeight.Bold),
    Font(R.font.oxygen_light, FontWeight.Light)
)

val Pacifico = FontFamily(
    Font(R.font.pacifico_regular)
)

// Set of Material typography styles to start with
val Typography = Typography(
    h1 = TextStyle(
        fontFamily = Pacifico,
        fontSize = 32.sp
    ),
    h2 = TextStyle(
        fontFamily = RedHatDisplay,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp
    ),
    body1 = TextStyle(
        fontFamily = RedHatDisplay,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    body2 = TextStyle(
        fontFamily = Oxygen,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    // Other default text styles to override
    button = TextStyle(
        fontFamily = Oxygen,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    /* caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)