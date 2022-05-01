package com.pr0m3th3usex.sayoutloud.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pr0m3th3usex.sayoutloud.ui.theme.Brown500
import com.pr0m3th3usex.sayoutloud.ui.theme.Placeholder

@Composable
fun CustomTextField(
    modifier: Modifier = Modifier,
    text: String,
    placeholder: String,
    leadingIcon: @Composable (() -> Unit)? = null,
    onChange: (String) -> Unit = {},
    visualTransformation: VisualTransformation = VisualTransformation.None,
    imeAction: ImeAction = ImeAction.Next,
    keyboardType: KeyboardType = KeyboardType.Text,
    keyboardActions: KeyboardActions = KeyboardActions(),
    isEnabled: Boolean = true,
) {
    var hasBorder by  remember { mutableStateOf(false) }

    OutlinedTextField(
        value = text,
        onValueChange = onChange,
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(corner = CornerSize(18.dp)))
            .background(if (hasBorder) Color.White else Color(0xFFFCD999))
            .onFocusChanged {
                hasBorder = it.hasFocus
            },
        leadingIcon = leadingIcon,
        placeholder = {
            Text(text = placeholder, style = Placeholder, color = Brown500)
        },
        textStyle = Placeholder,
        keyboardActions = keyboardActions,
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType, imeAction = imeAction),
        enabled = isEnabled,
        colors = TextFieldDefaults.outlinedTextFieldColors(
                    textColor = Placeholder.color,
                    focusedBorderColor = Placeholder.color,
            unfocusedBorderColor = Color.Unspecified,
            disabledBorderColor = Color.Unspecified,
            disabledTextColor = Color.Black,
            cursorColor = Placeholder.color,
        ),
        visualTransformation = visualTransformation,
        shape = RoundedCornerShape(corner = CornerSize(18.dp)),
        singleLine = true,
    )
}

@Composable
@Preview
fun CustomTextFieldPreview() {
    CustomTextField(text = "", placeholder = "Placeholder")
}
