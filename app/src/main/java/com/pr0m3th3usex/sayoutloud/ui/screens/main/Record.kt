package com.pr0m3th3usex.sayoutloud.ui.screens.main

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.pr0m3th3usex.sayoutloud.R
import com.pr0m3th3usex.sayoutloud.ui.components.LargeTextButton
import com.pr0m3th3usex.sayoutloud.ui.components.RecordActionBar
import com.pr0m3th3usex.sayoutloud.ui.components.RecordButton
import com.pr0m3th3usex.sayoutloud.ui.navigation.Screen
import com.pr0m3th3usex.sayoutloud.ui.theme.SolGradient

enum class RecordingStatus(val title: String) {
    IDLE("Speak Out Loud !!!") ,
    RECORDING("Recording ..."),
    RECORDED("Recorded !")
}

@Composable
fun Record(navController: NavHostController, setIsBottomBarVisible: (v: Boolean) -> Unit = {}) {
    var recordingStatus by remember { mutableStateOf(RecordingStatus.IDLE) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = SolGradient)
            .padding(bottom = if (recordingStatus != RecordingStatus.RECORDED) { 96.dp } else  { 32.dp })
    ) {

        if (recordingStatus == RecordingStatus.RECORDING || recordingStatus == RecordingStatus.RECORDED) {
            RecordActionBar(
                modifier = Modifier.align(Alignment.TopCenter),
                recordingStatus = recordingStatus,
                time = 35999999L,
                onCancel = {
                    recordingStatus = RecordingStatus.IDLE
                    setIsBottomBarVisible(true)
                }
            )
        }

        Text(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 100.dp),
            text = recordingStatus.title, style = MaterialTheme.typography.h2, color = Color.White, textAlign = TextAlign.Center
        )

        if (recordingStatus != RecordingStatus.RECORDED) {
            RecordButton(
                modifier = Modifier.align(Alignment.BottomCenter),
                onPress = {
                    recordingStatus = RecordingStatus.RECORDING
                    setIsBottomBarVisible(false)
                },
                onRelease = {
                    recordingStatus = RecordingStatus.RECORDED
                    setIsBottomBarVisible(false)
                }
            )
        } else {
            Column(modifier = Modifier.padding(horizontal = 12.dp).align(Alignment.BottomEnd)) {
                LargeTextButton(
                    text = stringResource(R.string.publish_btn),
                    onClick = {
                        setIsBottomBarVisible(true)
                        navController.navigate(Screen.Publish.route)
                    }
                )
            }
        }
    }
}