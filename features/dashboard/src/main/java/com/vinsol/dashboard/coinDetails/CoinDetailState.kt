package com.vinsol.dashboard.coinDetails

import com.vinsol.domain.entity.CoinDetail


data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
