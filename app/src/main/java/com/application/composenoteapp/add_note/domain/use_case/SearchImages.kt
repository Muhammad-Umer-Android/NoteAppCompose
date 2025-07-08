package com.application.composenoteapp.add_note.domain.use_case

import com.application.composenoteapp.add_note.presentation.util.Resource
import com.application.composenoteapp.core.domain.model.Images
import com.application.composenoteapp.core.domain.repository.ImagesRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

/**
 * @Author: Umer Dev
 * @Created: 08/07/2025
 * @File: SearchImages.kt
 */
class SearchImages(
    private val imagesRepository: ImagesRepository
) {

    suspend operator fun invoke(
        query: String
    ): Flow<Resource<Images>> {
        return flow {
            emit(Resource.Loading(true))

            if (query.isEmpty()) {
                emit(Resource.Error())
                emit(Resource.Loading(false))
                return@flow
            }

            val images = try {
                imagesRepository.searchImages(query)
            } catch (e: Exception) {
                e.printStackTrace()
                emit(Resource.Error())
                emit(Resource.Loading(false))
                return@flow
            }

            images?.let {
                emit(Resource.Success(it))
                emit(Resource.Loading(false))
                return@flow
            }

            emit(Resource.Error())
            emit(Resource.Loading(false))
        }
    }

}