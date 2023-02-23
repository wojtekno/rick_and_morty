package com.wojteknowak.presentation.characterdetails

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import com.wojteknowak.presentation.navigation.Screen
import com.wojteknowak.ui_component.R
import com.wojteknowak.uicomponent.common.GoToButton
import com.wojteknowak.uicomponent.common.ScreenTitle

@Composable
fun CharacterDetailsScreen(navController: NavHostController) {
    ScreenTitle(title = stringResource(id = R.string.character_details_title))
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        GoToButton(title = "go to location details") {
            navController.navigate(Screen.LocationDetails.route)
        }
    }
}
