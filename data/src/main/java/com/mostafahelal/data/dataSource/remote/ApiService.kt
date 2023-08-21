package com.mostafahelal.data.dataSource.remote

import com.mostafahelal.domain.entity.CategoryResponse
import retrofit2.http.GET

interface ApiService  {
    @GET("categories.php")
    suspend fun getMeals():CategoryResponse
}