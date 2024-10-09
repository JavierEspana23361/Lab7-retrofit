package com.example.lab7_retrofit.ui.categories.Repository

import com.example.lab7_retrofit.networking.MealsWebService
import com.example.lab7_retrofit.networking.response.categories.Categories


class MealsCategoryRepository(private val webService: MealsWebService = MealsWebService()) {

    suspend fun getMealsCategories(): List<Categories> {
        return webService.getMealsCategories().categories
    }
}