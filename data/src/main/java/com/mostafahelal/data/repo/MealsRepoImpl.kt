package com.mostafahelal.data.repo

import com.mostafahelal.data.dataSource.remote.ApiService
import com.mostafahelal.domain.entity.CategoryResponse
import com.mostafahelal.domain.repo.MealsRepo

class MealsRepoImpl(private val apiService:ApiService) : MealsRepo {
     override suspend fun getMealsFromRemote(): CategoryResponse = apiService.getMeals()
}