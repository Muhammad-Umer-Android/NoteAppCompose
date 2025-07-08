package com.application.composenoteapp.core.domain.repository

import com.application.composenoteapp.core.domain.model.Images

/**
 * @Author: Umer Dev
 * @Created: 08/07/2025
 * @File: ImagesRepository.kt
 */
interface ImagesRepository {

    suspend fun searchImages(query: String): Images?

}