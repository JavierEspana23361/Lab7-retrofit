package com.example.lab7_retrofit.navigation

sealed class NavigationState(val route: String) {
    data object categories: NavigationState("categories")
    data object mealdetail: NavigationState("mealdetail")
    data object meals: NavigationState("meals")

}