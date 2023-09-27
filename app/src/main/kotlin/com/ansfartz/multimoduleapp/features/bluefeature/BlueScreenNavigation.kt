package com.ansfartz.multimoduleapp.features.bluefeature

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val blueScreenRoute = "blue_route"

fun NavController.navigateToBlueScreen() {
    navigate(route = blueScreenRoute)
}

fun NavGraphBuilder.blueScreen(onRedButtonClick: () -> Unit, onGreenButtonClick: () -> Unit) {
    composable(route = blueScreenRoute) {
        BlueScreen(
            onRedButtonClick = onRedButtonClick,
            onGreenButtonClick = onGreenButtonClick
        )
    }
}