package com.application.composenoteapp.core.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * @Author: Umer Dev
 * @Created: 07/07/2025
 * @File: MovieEntity.kt
 */
@Entity
data class NoteEntity(
    var title: String,
    var description: String,
    var imageUrl: String,

    var dateAdded: Long,

    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
)