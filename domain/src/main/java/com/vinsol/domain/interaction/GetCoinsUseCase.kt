package com.vinsol.domain.interaction

import com.vinsol.domain.Resource
import com.vinsol.domain.entity.Coin
import com.vinsol.domain.service.CoinService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException

class GetCoinsUseCase (private val service: CoinService) {
    operator fun invoke(): Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Resource.Loading())
            val coins = service.getCoins()
            emit(Resource.Success(coins))
        } catch (e: IOException) {
            emit(Resource.Error("Connection to server error"))
        } catch (e: Exception) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occured"))
        }
    }
}