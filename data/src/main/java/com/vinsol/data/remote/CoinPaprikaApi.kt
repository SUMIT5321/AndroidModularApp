package com.vinsol.data.remote


import com.vinsol.data.remote.dto.CoinDetailDto
import com.vinsol.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

const val COIN_PAPRIKA_BASE_URL = "https://api.coinpaprika.com/"

interface CoinPaprikaApi {
    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoin(@Path("coinId") coinId: String): CoinDetailDto
}