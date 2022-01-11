package com.vinsol.data.mapper

import com.vinsol.data.remote.dto.CoinDetailDto
import com.vinsol.domain.entity.CoinDetail

fun CoinDetailDto.toCoinDetail() : CoinDetail = CoinDetail(
    coinId = id,
    name = name,
    description = description,
    symbol = symbol,
    rank = rank,
    isActive = is_active,
    tags = tags.map { it.name },
    team = team
)