package com.mostafahelal.domain.usecase

import com.mostafahelal.domain.repo.MealsRepo

class GettingMeals(private val mealsRepo: MealsRepo) {
        suspend operator fun invoke()=mealsRepo.getMealsFromRemote()
}