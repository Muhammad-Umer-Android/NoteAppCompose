package com.application.composenoteapp.note_list.domain.use_case

import com.application.composenoteapp.core.domain.model.NoteItem
import com.application.composenoteapp.core.domain.repository.NoteRepository

/**
 * @Author: Umer Dev
 * @Created: 08/07/2025
 * @File: DeleteNote.kt
 */
class DeleteNote(
    private val noteRepository: NoteRepository
) {

    suspend operator fun invoke(note: NoteItem) {
        noteRepository.deleteNote(note)
    }

}