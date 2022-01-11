package com.vinsol.data.mapper

import com.vinsol.data.remote.dto.CoinDto
import com.vinsol.domain.entity.Coin

fun CoinDto.toCoin() : Coin = Coin(
    id = id,
    isActive = is_active,
    name = name,
    rank = rank,
    symbol = symbol
)