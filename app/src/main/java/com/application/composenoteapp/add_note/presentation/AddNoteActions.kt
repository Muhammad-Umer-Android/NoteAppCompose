package com.application.composenoteapp.add_note.presentation

/**
 * @Author: Umer Dev
 * @Created: 08/07/2025
 * @File: AddNoteActions.kt
 */
sealed interface AddNoteActions {

    data class UpdateTitle(val newTitle: String) : AddNoteActions
    data class UpdateDescription(val newDescription: String) : AddNoteActions

    data class UpdateSearchImageQuery(val newQuery: String) : AddNoteActions
    data class PickImage(val imageUrl: String) : AddNoteActions

    data object UpdateImagesDialogVisibility : AddNoteActions
    data object SaveNote : AddNoteActions
}