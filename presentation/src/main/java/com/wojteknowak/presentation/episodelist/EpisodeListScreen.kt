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
import com.wojteknowak.ui_component.R
import com.wojteknowak.uicomponent.common.GoToButton
import com.wojteknowak.uicomponent.common.ScreenTitle
import com.wojteknowak.uicomponent.episodelist.EpisodeItem
import com.wojteknowak.uicomponent.episodelist.EpisodeItemUiModel

@Composable
fun EpisodeListScreen(onNavigateToEpisodeDetails: () -> Unit, episodes: List<EpisodeItemUiModel>) {
    Log.d("EpisodeListScreen", "composition")
    Column {
        ScreenTitle(stringResource(id = R.string.episodes_title))
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
            GoToButton(title = "go to details") {
                onNavigateToEpisodeDetails()
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
