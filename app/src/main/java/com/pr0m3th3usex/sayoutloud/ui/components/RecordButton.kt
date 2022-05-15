package com.pr0m3th3usex.sayoutloud.ui.components

import android.util.Log
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.indication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.pr0m3th3usex.sayoutloud.R

@Composable
fun RecordButton(modifier: Modifier = Modifier, onPress: () -> Unit = {}, onRelease: () -> Unit = {}) {
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()
    val size: Dp by animateDpAsState(
        targetValue = if (isPressed) 84.dp else 68.dp,
        finishedListener = { size ->
            when (size.value) {
                84.dp.value -> onPress()
                68.dp.value -> onRelease()
            }
        }
    )



    IconButton(
        modifier = modifier
            .size(size)
            .clip(shape = CircleShape)
            .background(Color.Transparent)
            .border(color = if (isPressed) Color.Red else Color.White, width = 4.dp, shape = CircleShape),
        interactionSource = interactionSource,
        onClick = {}
    ) {
        Icon(
            modifier = Modifier.size(45.dp),
            painter = painterResource(id = R.drawable.ic_mike),
            tint = if (isPressed) Color.Red else Color.White,
            contentDescription = "Record"
        )
    }
}