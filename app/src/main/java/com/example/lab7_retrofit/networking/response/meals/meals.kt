package com.example.lab7_retrofit.networking.response.meals

import com.google.gson.annotations.SerializedName

data class meals(
    @SerializedName("idMeal") val id: String,
    @SerializedName("strMeal") val name: String,
    @SerializedName("strMealThumb") val urlImage: String
)
