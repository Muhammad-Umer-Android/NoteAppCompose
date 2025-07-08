package com.application.composenoteapp.add_note.presentation

/**
 * @Author: Umer Dev
 * @Created: 08/07/2025
 * @File: AddNoteState.kt
 */
data class AddNoteState(
    val imageUrl: String = "",
    val title: String = "",
    val description: String = "",

    val isImagesDialogShowing: Boolean = false,

    val imageList: List<String> = emptyList(),
    val searchImagesQuery: String = "",
    val isLoadingImages: Boolean = false,
)