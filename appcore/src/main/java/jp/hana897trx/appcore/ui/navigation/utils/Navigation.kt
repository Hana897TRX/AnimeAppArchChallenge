package jp.hana897trx.appcore.ui.navigation.utils

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import jp.hana897trx.appcore.ui.screens.HomeScreen

@Composable
fun navigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Paths.Home.path) {
        composable(Paths.Home.path) {
            HomeScreen()
        }
    }
}