package com.vinsol.templateapp3.di

import com.vinsol.data.remote.CoinPaprikaApi
import com.vinsol.data.service.CoinServiceImp
import com.vinsol.domain.interaction.GetCoinUseCase
import com.vinsol.domain.interaction.GetCoinsUseCase
import com.vinsol.domain.service.CoinService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCasesModule {

    @Provides
    @Singleton
    fun provideCoinsUseCase(service: CoinService): GetCoinsUseCase {
        return GetCoinsUseCase(service)
    }

    @Provides
    @Singleton
    fun provideCoinUseCase(service: CoinService): GetCoinUseCase {
        return GetCoinUseCase(service)
    }
}