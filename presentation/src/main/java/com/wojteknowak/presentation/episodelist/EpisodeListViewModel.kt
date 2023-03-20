package com.wojteknowak.presentation.episodelist

import android.util.Log
import androidx.lifecycle.ViewModel
import com.wojteknowak.domain.model.Episode
import com.wojteknowak.uicomponent.episodelist.EpisodeItemUiModel

class EpisodeListViewModel : ViewModel() {

    init {
        Log.d(TAG, "init()")
    }

    private val mapper = EpisodeMapper()
    val episodes: List<EpisodeItemUiModel> = getDummyEpisodes().map { mapper.from(it) }

    private fun getDummyEpisodes(): List<Episode> = buildList {
        (1..25).toList().forEach {
            val season = when {
                it <= 10 -> "S01"
                it <= 20 -> "S02"
                else -> "S03"
            }
            val episode = "E${(it % 10)}"
            val characters = listOf(it, it + 1, it + 2)
            add(
                Episode(
                    id = it,
                    serverId = 1000 + it,
                    title = "Name $it",
                    episodeCode = "$season$episode",
                    airDate = "airDate$it",
                    characters = characters
                )
            )
        }
    }

    private companion object {
        const val TAG = "EpisodeListViewModel"
    }
}
