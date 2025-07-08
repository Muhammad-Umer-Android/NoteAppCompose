package com.application.composenoteapp.core.data.repository

import com.application.composenoteapp.core.data.mapper.toImages
import com.application.composenoteapp.core.data.remote.api.ImagesApi
import com.application.composenoteapp.core.domain.model.Images
import com.application.composenoteapp.core.domain.repository.ImagesRepository
import javax.inject.Inject

/**
 * @Author: Umer Dev
 * @Created: 08/07/2025
 * @File: ImagesRepositoryImpl.kt
 */
class ImagesRepositoryImpl @Inject constructor(
    private val imagesApi: ImagesApi
) : ImagesRepository {

    override suspend fun searchImages(
        query: String
    ): Images? {
        return imagesApi.searchImages(query)?.toImages()
    }

}