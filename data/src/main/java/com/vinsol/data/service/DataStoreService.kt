package com.vinsol.data.service

import android.app.Application
import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.vinsol.domain.service.LocalPreferencesService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

private const val MY_PREFERENCES = "my_preferences"
private val Context.dataStore by preferencesDataStore(
    name = MY_PREFERENCES
)

class DataStoreService(private val app: Application): LocalPreferencesService {
    private val dataStore by lazy { app.dataStore }

    override suspend fun saveAuthToken(authToken: String) {
        dataStore.edit { preferences ->
            preferences[KEY_AUTH] = authToken
        }
    }

    override val authToken: Flow<String?>
        get() = dataStore.data.map { preferences ->
            preferences[KEY_AUTH]
        }

    companion object {
        private val KEY_AUTH = stringPreferencesKey("key_auth")
    }
}