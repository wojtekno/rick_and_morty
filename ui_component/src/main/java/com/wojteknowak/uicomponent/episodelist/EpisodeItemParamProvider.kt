package com.wojteknowak.uicomponent.episodelist

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

internal class EpisodeItemParamProvider : PreviewParameterProvider<EpisodeItemUiModel> {
    override val values: Sequence<EpisodeItemUiModel> =
        sequenceOf(
            EpisodeItemUiModel(
                id = 1,
                title = "Unbelievable adventures",
                episodeCode = "S01E03",
                airDate = "10-10-2020"
            )
        )
}
