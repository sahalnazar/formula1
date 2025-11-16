package com.sahalnazar.formula1.di

import com.sahalnazar.formula1.data.api.F1ApiService
import com.sahalnazar.formula1.data.repository.F1Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideF1Repository(apiService: F1ApiService): F1Repository {
        return F1Repository(apiService)
    }
}
