package com.wojteknowak.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.wojteknowak.presentation.characterdetails.CharacterDetailsScreen
import com.wojteknowak.presentation.episodedetails.EpisodeDetailsScreen
import com.wojteknowak.presentation.episodelist.EpisodeListScreen
import com.wojteknowak.presentation.episodelist.EpisodeListViewModel
import com.wojteknowak.presentation.locationdetails.LocationDetailsScreen

@Composable
fun NavGraph(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.EpisodeList.route
    ) {
        composable(route = Screen.EpisodeList.route) {
            val viewModel = hiltViewModel<EpisodeListViewModel>()
            EpisodeListScreen(
                onNavigateToEpisodeDetails = { navHostController.navigate(Screen.EpisodeDetails.route) },
                episodes = viewModel.episodes
            )
        }
        composable(route = Screen.EpisodeDetails.route) {
            EpisodeDetailsScreen(navHostController)
        }
        composable(route = Screen.CharacterDetails.route) {
            CharacterDetailsScreen(navHostController)
        }
        composable(route = Screen.LocationDetails.route) {
            LocationDetailsScreen(navHostController)
        }
    }
}
