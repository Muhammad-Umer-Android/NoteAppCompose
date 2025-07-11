package com.application.composenoteapp.core.data.remote.api

import com.application.composenoteapp.core.data.remote.dto.ImageListDto
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @Author: Umer Dev
 * @Created: 08/07/2025
 * @File: ImagesApi.kt
 */
interface ImagesApi {

    @GET("/api/")
    suspend fun searchImages(
        @Query("q") query: String,
        @Query("key") apiKey: String = API_KEY,
    ): ImageListDto?

    companion object {
        const val BASE_URL = "https://pixabay.com"
        const val API_KEY = "43875405-6c70a3c2a57ec40d3140e2032"
    }

}