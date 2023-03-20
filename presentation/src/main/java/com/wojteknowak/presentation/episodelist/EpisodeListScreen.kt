package com.wojteknowak.presentation.episodelist

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.wojteknowak.presentation.navigation.Screen
import com.wojteknowak.ui_component.R
import com.wojteknowak.uicomponent.common.GoToButton
import com.wojteknowak.uicomponent.common.ScreenTitle
import com.wojteknowak.uicomponent.episodelist.EpisodeItem

@Composable
fun EpisodeListScreen(navController: NavHostController, episodeListViewModel: EpisodeListViewModel = EpisodeListViewModel()) {
    Log.d("EpisodeListScreen", "composition")
    val episodes = episodeListViewModel.episodes
    Column {
        ScreenTitle(stringResource(id = R.string.episodes_title))
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
            GoToButton(title = "go to details") {
                navController.navigate(Screen.EpisodeDetails.route)
            }
        }
        LazyColumn(
            contentPadding = PaddingValues(top = 8.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            items(episodes) {
                EpisodeItem(uiModel = it)
            }
        }
    }
}
