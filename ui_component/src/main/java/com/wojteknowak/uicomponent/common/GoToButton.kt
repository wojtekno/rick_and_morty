package com.wojteknowak.uicomponent.common

import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun GoToButton(title: String, onClick: () -> Unit) {
    Button(modifier = Modifier.wrapContentWidth(), onClick = onClick) {
        Text(text = title)
    }
}
