package com.pr0m3th3usex.sayoutloud.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.pr0m3th3usex.sayoutloud.R
import com.pr0m3th3usex.sayoutloud.ui.screens.main.RecordingStatus
import com.pr0m3th3usex.sayoutloud.utils.String

@Composable
fun RecordActionBar(
    modifier: Modifier = Modifier,
    recordingStatus: RecordingStatus,
    time: Long = 0,
    onCancel: () -> Unit = {},
    onReplay: () -> Unit = {}
) {
    Row(modifier = modifier
        .fillMaxWidth()
        .padding(12.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        if (recordingStatus == RecordingStatus.RECORDED) {
            IconButton(onClick = onCancel) {
                Icon(
                    modifier = Modifier.size(size = 32.dp),
                    painter = painterResource(id = R.drawable.ic_cross), contentDescription = "Retry"
                )
            }
        }

        Text(
            modifier = if (recordingStatus == RecordingStatus.RECORDED) Modifier else Modifier.fillMaxWidth(),
            text = String.formatTime(time, "mm:ss") ?: "00:00",
            style = MaterialTheme.typography.body2,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            textAlign = TextAlign.Center
        )

        if (recordingStatus == RecordingStatus.RECORDED) {
            IconButton(onClick = onReplay) {
                Icon(
                    modifier = Modifier.size(size = 32.dp),
                    painter = painterResource(id = R.drawable.ic_replay), tint = Color.White, contentDescription = "Replay"
                )
            }
        }
    }
}