package com.application.composenoteapp.note_list.domain.use_case

import com.application.composenoteapp.core.domain.model.NoteItem
import com.application.composenoteapp.core.domain.repository.NoteRepository

/**
 * @Author: Umer Dev
 * @Created: 08/07/2025
 * @File: GetAllNotes.kt
 */
class GetAllNotes(
    private val noteRepository: NoteRepository
) {

    suspend operator fun invoke(
        isOrderByTitle: Boolean
    ): List<NoteItem> {
        return if (isOrderByTitle) {
            noteRepository.getAllNotes().sortedBy { it.title.lowercase() }
        } else {
            noteRepository.getAllNotes().sortedBy { it.dateAdded }
        }
    }

}