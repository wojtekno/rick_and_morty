package com.wojteknowak.presentation.episodelist

import com.wojteknowak.domain.model.Episode
import com.wojteknowak.uicomponent.episodelist.EpisodeItemUiModel

class EpisodeMapper {

    fun from(episode: Episode): EpisodeItemUiModel = with(episode) {
        EpisodeItemUiModel(
            id = id,
            title = title,
            episodeCode = episodeCode,
            airDate = airDate
        )
    }
}
