package com.example.simpleplanetsapp_smartpayment.di

import android.content.Context
import com.example.simpleplanetsapp_smartpayment.data.database.LocalDatabase
import com.example.simpleplanetsapp_smartpayment.data.database.UsersDao
import com.example.simpleplanetsapp_smartpayment.data.repository.ConfigurationRepositoryImpl
import com.example.simpleplanetsapp_smartpayment.domain.repository.ConfigurationRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    fun provideConfigurationRepository(dao: UsersDao): ConfigurationRepository =
        ConfigurationRepositoryImpl(dao)

    @Provides
    fun provideUsersDao(@ApplicationContext context: Context) =
        LocalDatabase.getInstance(context)!!.usersDao()

}