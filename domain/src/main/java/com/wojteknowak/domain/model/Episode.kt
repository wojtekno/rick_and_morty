package com.wojteknowak.domain.model

data class Episode(
    val id: Int,
    val serverId: Int,
    val title: String,
    val episodeCode: String,
    val airDate: String,
    val characters: List<Int>
)
