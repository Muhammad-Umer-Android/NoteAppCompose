package com.application.composenoteapp.core.domain.model

/**
 * @Author: Umer Dev
 * @Created: 07/07/2025
 * @File: NoteItem.kt
 */
data class NoteItem(
    var title: String,
    var description: String,
    var imageUrl: String,

    val dateAdded: Long,

    val id: Int = 0,
)