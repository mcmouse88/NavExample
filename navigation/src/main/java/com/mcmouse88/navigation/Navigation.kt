package com.mcmouse88.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.mcmouse88.feature.DetailFeatureScreen
import com.mcmouse88.feature.MainFeatureScreen

@Composable
fun AppNavigation(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        main(navController)
        detail(navController)
    }
}

fun NavGraphBuilder.main(
    navController: NavHostController
) {
    composable("home") {
        MainFeatureScreen {
            navController.navigate("detail")
        }
    }
}

fun NavGraphBuilder.detail(
    navController: NavHostController
) {
    composable("detail") {
        DetailFeatureScreen {
            navController.navigateUp()
        }
    }
}