package com.pr0m3th3usex.sayoutloud.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.pr0m3th3usex.sayoutloud.R

@Composable
fun CustomTopBar(
    modifier: Modifier = Modifier,
    title: String,
    onPrevious: (() -> Unit)? = null,
    titleTextStyle: TextStyle? = null,
) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(vertical = 5.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            if (onPrevious != null) {
                IconButton(onClick = onPrevious) {
                    Icon(painter = painterResource(id = R.drawable.ic_back_arrow), "Back")
                }
            }
            Text(text = title, style = titleTextStyle ?: MaterialTheme.typography.h3)
        }
        Divider(thickness = 1.0.dp)
    }

}