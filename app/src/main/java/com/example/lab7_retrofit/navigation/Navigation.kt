package com.example.lab7_retrofit.navigation

import androidx.compose.material3.pulltorefresh.rememberPullToRefreshState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.lab7_retrofit.ui.categories.view.categoriesScreen
import com.example.lab7_retrofit.ui.mealdetail.view.mealdetailScreen
import com.example.lab7_retrofit.ui.meals.view.mealsScreen
import com.example.lab7_retrofit.navigation.NavigationState
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument





@Composable
fun Navigation(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(navController = navController,
        startDestination = NavigationState.categories.route,
        modifier = modifier) {

        composable(route = NavigationState.categories.route) {
            categoriesScreen(navController = navController)
        }

        composable(route = NavigationState.mealdetail.route) {
            mealdetailScreen(navController = navController)
        }

        composable(route = NavigationState.meals.route) {
            mealsScreen(navController = navController)
        }


    }
}