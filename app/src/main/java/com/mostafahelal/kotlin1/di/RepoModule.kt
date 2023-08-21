package com.mostafahelal.kotlin1.di

import com.mostafahelal.data.dataSource.remote.ApiService
import com.mostafahelal.data.repo.MealsRepoImpl
import com.mostafahelal.domain.repo.MealsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {
    @Provides
    fun provideRepo(apiService: ApiService):MealsRepo{
        return MealsRepoImpl(apiService)
    }
}