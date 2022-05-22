package com.pr0m3th3usex.sayoutloud.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ErrorOutline
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pr0m3th3usex.sayoutloud.ui.theme.Red200

@Composable
fun LabelWrapper(label: String? = null, error: String? = null, content: @Composable (isInvalid: Boolean) -> Unit = {}) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        if (label != null) {
            Text(text = label)
        }
        content(isInvalid = error != null)
        if (error != null) {
            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                Icon(Icons.Outlined.ErrorOutline, tint = Red200, contentDescription = "Error Icon")
                Text(text = error, style = MaterialTheme.typography.body2, color = Red200)
            }
        }
    }
}

@Preview
@Composable
fun LabelWrapperPreview() {
    LabelWrapper(label = "Hey", error = "Error") {
        CustomTextField(text = "", placeholder = "Test")
    }
}