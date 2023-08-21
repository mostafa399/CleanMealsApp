package com.mostafahelal.kotlin1.di

import com.mostafahelal.domain.repo.MealsRepo
import com.mostafahelal.domain.usecase.GettingMeals
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    fun provideUseCase(mealsRepo: MealsRepo):GettingMeals{
        return GettingMeals(mealsRepo)
    }
}