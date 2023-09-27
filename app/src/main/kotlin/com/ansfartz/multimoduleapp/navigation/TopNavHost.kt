package com.ansfartz.multimoduleapp.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ansfartz.multimoduleapp.features.bluefeature.BlueScreen
import com.ansfartz.multimoduleapp.features.bluefeature.blueScreen
import com.ansfartz.multimoduleapp.features.bluefeature.navigateToBlueScreen
import com.ansfartz.multimoduleapp.features.greenfeature.GreenScreen
import com.ansfartz.multimoduleapp.features.greenfeature.greenScreen
import com.ansfartz.multimoduleapp.features.greenfeature.navigateToGreenScreen
import com.ansfartz.multimoduleapp.features.redfeature.RedScreen
import com.ansfartz.multimoduleapp.features.redfeature.navigateToRedScreen
import com.ansfartz.multimoduleapp.features.redfeature.redScreen
import com.ansfartz.multimoduleapp.features.redfeature.redScreenRoute
import com.ansfartz.multimoduleapp.ui.theme.MultiModuleAppTheme


@Composable
fun TopNavHost(
    modifier: Modifier = Modifier,
    startDestination: String = redScreenRoute
) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
    ) {

        redScreen(
            onBlueButtonClick = navController::navigateToBlueScreen,
            onGreenButtonClick = navController::navigateToGreenScreen
        )

        greenScreen(
            onRedButtonClick = navController::navigateToRedScreen,
            onBlueButtonClick = navController::navigateToBlueScreen
        )

        blueScreen(
            onRedButtonClick = navController::navigateToRedScreen,
            onGreenButtonClick = navController::navigateToGreenScreen
        )

        // composable(route = "red_route") {
        //     RedScreen(
        //         onGreenButtonClick = { navController.navigate(route = "green_route") },
        //         onBlueButtonClick = { navController.navigate(route = "blue_route") },
        //     )
        // }
        //
        // composable(route = "green_route") {
        //     GreenScreen(
        //         onBlueButtonClick = { navController.navigate(route = "blue_route") },
        //         onRedButtonClick = { navController.navigate(route = "red_route") }
        //     )
        // }
        //
        // composable(route = "blue_route") {
        //     BlueScreen(
        //         onGreenButtonClick = { navController.navigate(route = "green_route") },
        //         onRedButtonClick = { navController.navigate(route = "red_route") }
        //     )
        // }

    }
}

@Preview(showBackground = true)
@Composable
fun TopNavHostPreview() {
    MultiModuleAppTheme {
        TopNavHost()
    }
}