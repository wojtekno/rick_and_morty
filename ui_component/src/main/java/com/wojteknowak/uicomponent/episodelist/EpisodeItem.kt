package com.wojteknowak.uicomponent.episodelist

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp

@Composable
fun EpisodeItem(uiModel: EpisodeItemUiModel) {
    Column(
        Modifier.fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .background(Color.LightGray)
            .padding(start = 16.dp, top = 8.dp, bottom = 8.dp)
    ) {
        Row(Modifier.padding(bottom = 8.dp)) {
            Text(text = uiModel.episodeCode, modifier = Modifier.padding(end = 16.dp))
            Text(text = uiModel.airDate)
        }
        Text(text = uiModel.title)
    }
}

@Preview
@Composable
private fun PreviewEpisodeItem(
    @PreviewParameter(EpisodeItemParamProvider::class) item: EpisodeItemUiModel
) {
    EpisodeItem(uiModel = item)
}
