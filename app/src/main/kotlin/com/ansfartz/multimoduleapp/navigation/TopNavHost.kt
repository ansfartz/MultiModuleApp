package com.ansfartz.multimoduleapp.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ansfartz.bluefeature.blueScreen
import com.ansfartz.bluefeature.navigateToBlueScreen
import com.ansfartz.greenfeature.greenScreen
import com.ansfartz.greenfeature.navigateToGreenScreen
import com.ansfartz.multimoduleapp.ui.theme.MultiModuleAppTheme
import com.ansfartz.redfeature.navigateToRedScreen
import com.ansfartz.redfeature.redScreen
import com.ansfartz.redfeature.redScreenRoute


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