package com.vinsol.domain.commonService

import kotlinx.coroutines.flow.Flow

interface LocalPreferencesService {

    suspend fun saveAuthToken(authToken: String)
    val authToken: Flow<String?>
}