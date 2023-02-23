package com.wojteknowak.uicomponent.common

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.wojteknowak.ui_component.R

@Composable
fun ScreenTitle(title: String) {
    Box(
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            style = TextStyle.Default,
            text = title,
            fontSize = 24.sp
        )
    }
}

@Composable
@Preview(showBackground = true)
fun ScreenTitlePreview() {
    ScreenTitle(title = stringResource(id = R.string.episodes_title))
}
