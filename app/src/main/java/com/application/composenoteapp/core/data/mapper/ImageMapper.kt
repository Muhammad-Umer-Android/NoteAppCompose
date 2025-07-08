package com.application.composenoteapp.core.data.mapper

import com.application.composenoteapp.core.data.remote.dto.ImageListDto
import com.application.composenoteapp.core.domain.model.Images

/**
 * @Author: Umer Dev
 * @Created: 08/07/2025
 * @File: ImageMapper.kt
 */

fun ImageListDto.toImages(): Images {
    return Images(
        images = hits?.map { imageDto ->
            imageDto.previewURL ?: ""
        } ?: emptyList()
    )
}