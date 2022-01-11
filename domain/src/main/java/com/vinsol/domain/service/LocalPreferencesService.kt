package com.vinsol.domain.service

import kotlinx.coroutines.flow.Flow

interface LocalPreferencesService {

    suspend fun saveAuthToken(authToken: String)
    val authToken: Flow<String?>
}