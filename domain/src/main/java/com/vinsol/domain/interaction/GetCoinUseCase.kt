package com.vinsol.domain.interaction

import com.vinsol.domain.Resource
import com.vinsol.domain.entity.CoinDetail
import com.vinsol.domain.service.CoinService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException
import java.lang.Exception

class GetCoinUseCase (private val service: CoinService) {
    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow<Resource<CoinDetail>>  {
        try {
            emit(Resource.Loading())
            val coin = service.getCoinById(coinId)
            emit(Resource.Success(coin))
        } catch (e: IOException) {
            emit(Resource.Error("Connection to server error"))
        } catch (e: Exception) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occured"))
        }
    }
}