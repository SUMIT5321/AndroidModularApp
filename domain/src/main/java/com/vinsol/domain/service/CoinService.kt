package com.vinsol.domain.service

import com.vinsol.domain.entity.Coin
import com.vinsol.domain.entity.CoinDetail


interface CoinService {
    suspend fun getCoins(): List<Coin>
    suspend fun getCoinById(coinId: String): CoinDetail
}