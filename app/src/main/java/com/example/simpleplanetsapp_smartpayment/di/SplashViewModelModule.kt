package com.example.simpleplanetsapp_smartpayment.di

import com.example.simpleplanetsapp_smartpayment.domain.repository.ConfigurationRepository
import com.example.simpleplanetsapp_smartpayment.domain.usecase.GetSessionStarted
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object SplashViewModelModule {

    @Provides
    fun provideGetSessionStarted(repository: ConfigurationRepository) = GetSessionStarted(repository)

}