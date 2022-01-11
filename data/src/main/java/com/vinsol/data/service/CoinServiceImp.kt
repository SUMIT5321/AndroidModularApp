package com.vinsol.data.service

import com.vinsol.data.mapper.toCoin
import com.vinsol.data.mapper.toCoinDetail
import com.vinsol.data.remote.CoinPaprikaApi
import com.vinsol.domain.entity.Coin
import com.vinsol.domain.entity.CoinDetail
import com.vinsol.domain.service.CoinService


class CoinServiceImp constructor(
    private val api: CoinPaprikaApi
) : CoinService {

    override suspend fun getCoins(): List<Coin> {
        return api.getCoins().map { it.toCoin() }
    }

    override suspend fun getCoinById(coinId: String): CoinDetail {
        return api.getCoin(coinId).toCoinDetail()
    }
}