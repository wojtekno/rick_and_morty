package com.wojteknowak.presentation.navigation

sealed class Screen(val route: String) {
    object EpisodeList : Screen(route = "episode_list")
    object EpisodeDetails : Screen(route = "episode_details")
    object CharacterDetails : Screen(route = "character_details")
    object LocationDetails : Screen(route = "location_details")
}
