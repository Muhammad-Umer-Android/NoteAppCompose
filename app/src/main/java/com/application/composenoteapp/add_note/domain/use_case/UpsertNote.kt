package com.application.composenoteapp.add_note.domain.use_case

import com.application.composenoteapp.core.domain.model.NoteItem
import com.application.composenoteapp.core.domain.repository.NoteRepository

/**
 * @Author: Umer Dev
 * @Created: 08/07/2025
 * @File: UpsertNote.kt
 */
class UpsertNote(
    private val noteRepository: NoteRepository
) {

    suspend operator fun invoke(
        title: String,
        description: String,
        imageUrl: String
    ): Boolean {

        if (title.isEmpty() || description.isEmpty()) {
            return false
        }

        val note = NoteItem(
            title = title,
            description = description,
            dateAdded = System.currentTimeMillis(),
            imageUrl = imageUrl
        )

        noteRepository.upsertNote(note)
        return true

    }

}