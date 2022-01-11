package com.vinsol.templateapp3.di

import android.app.Application
import com.vinsol.data.remote.COIN_PAPRIKA_BASE_URL
import com.vinsol.data.remote.CoinPaprikaApi
import com.vinsol.data.service.CoinServiceImp
import com.vinsol.data.service.DataStoreService
import com.vinsol.domain.service.CoinService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Provides
    fun provideDataStoreService(app: Application) = DataStoreService(app)

    @Provides
    @Singleton
    fun providePaprikaApi(): CoinPaprikaApi {
        return Retrofit.Builder().baseUrl(COIN_PAPRIKA_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(CoinPaprikaApi::class.java)
    }

    @Provides
    @Singleton
    fun provideCoinService(api: CoinPaprikaApi): CoinService {
        return CoinServiceImp(api)
    }
}