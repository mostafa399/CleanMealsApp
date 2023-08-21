package com.mostafahelal.domain.repo

import com.mostafahelal.domain.entity.CategoryResponse

interface MealsRepo {
    suspend fun getMealsFromRemote():CategoryResponse
}