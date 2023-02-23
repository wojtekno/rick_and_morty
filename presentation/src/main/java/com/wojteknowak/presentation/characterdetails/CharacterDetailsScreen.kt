package com.wojteknowak.presentation.characterdetails

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.wojteknowak.ui_component.R
import com.wojteknowak.uicomponent.common.ScreenTitle

@Composable
fun CharacterDetailsScreen() {
    ScreenTitle(title = stringResource(id = R.string.character_details_title))
}
