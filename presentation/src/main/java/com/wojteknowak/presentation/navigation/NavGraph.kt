package com.wojteknowak.rickandmorty

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.wojteknowak.presentation.characterdetails.CharacterDetailsScreen
import com.wojteknowak.presentation.episodedetails.EpisodeDetailsScreen
import com.wojteknowak.presentation.episodelist.EpisodeListScreen
import com.wojteknowak.presentation.navigation.Screen

@Composable
fun NavGraph(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.EpisodeList.route
    ) {
        composable(route = Screen.EpisodeList.route) {
            EpisodeListScreen(navHostController)
        }
        composable(route = Screen.EpisodeDetails.route) {
            EpisodeDetailsScreen(navHostController)
        }
        composable(route = Screen.CharacterDetails.route) {
            CharacterDetailsScreen()
        }
    }
}
