package com.ansfartz.multimoduleapp.features.redfeature

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val redScreenRoute = "red_route"

fun NavController.navigateToRedScreen() {
    navigate(route = redScreenRoute)
}

fun NavGraphBuilder.redScreen(onBlueButtonClick: () -> Unit, onGreenButtonClick: () -> Unit) {
    composable(route = redScreenRoute) {
        RedScreen(
            onBlueButtonClick = onBlueButtonClick,
            onGreenButtonClick = onGreenButtonClick
        )
    }
}