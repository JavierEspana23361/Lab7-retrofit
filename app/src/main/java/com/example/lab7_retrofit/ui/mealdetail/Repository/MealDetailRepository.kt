package com.example.lab7_retrofit.ui.mealdetail.Repository

import com.example.lab7_retrofit.networking.MealsWebService
import com.example.lab7_retrofit.networking.response.mealdetail.MealDetailResponse
import retrofit2.Call


class MealDetailRepository(private val webService: MealsWebService = MealsWebService()) {

    suspend fun getMealDetail(mealId: String): Call<MealDetailResponse> {
        return webService.getMealDetail(mealId)
    }
}
