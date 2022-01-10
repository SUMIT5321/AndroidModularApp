package com.vinsol.templateapp3.di

import android.app.Application
import com.vinsol.data.DataStoreService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class DataStoreModule {

    @Provides
    fun provideDataStoreService(app: Application) = DataStoreService(app)
}