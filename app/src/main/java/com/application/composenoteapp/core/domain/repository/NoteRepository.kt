package com.application.composenoteapp.core.domain.repository

import com.application.composenoteapp.core.domain.model.NoteItem

/**
 * @Author: Umer Dev
 * @Created: 08/07/2025
 * @File: NoteRepository.kt
 */
interface NoteRepository {

    suspend fun upsertNote(noteItem: NoteItem)

    suspend fun deleteNote(noteItem: NoteItem)

    suspend fun getAllNotes(): List<NoteItem>

}