package com.ansfartz.multimoduleapp.features.greenfeature

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val greenScreenRoute = "green_route"

fun NavController.navigateToGreenScreen() {
    navigate(route = greenScreenRoute)
}

fun NavGraphBuilder.greenScreen(onRedButtonClick: () -> Unit, onBlueButtonClick: () -> Unit) {
    composable(route = greenScreenRoute) {
        GreenScreen(
            onRedButtonClick = onRedButtonClick,
            onBlueButtonClick = onBlueButtonClick
        )
    }
}