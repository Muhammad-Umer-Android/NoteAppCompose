package com.application.composenoteapp.core.data.repository

import com.application.composenoteapp.core.data.local.NoteDb
import com.application.composenoteapp.core.data.mapper.toNoteEntityForDelete
import com.application.composenoteapp.core.data.mapper.toNoteEntityForInsert
import com.application.composenoteapp.core.data.mapper.toNoteItem
import com.application.composenoteapp.core.domain.model.NoteItem
import com.application.composenoteapp.core.domain.repository.NoteRepository

/**
 * @Author: Umer Dev
 * @Created: 08/07/2025
 * @File: NoteRepositoryImpl.kt
 */
class NoteRepositoryImpl(
    noteDb: NoteDb
) : NoteRepository {

    private val noteDao = noteDb.noteDao

    override suspend fun upsertNote(noteItem: NoteItem) {
        noteDao.upsertNoteEntity(noteItem.toNoteEntityForInsert())
    }

    override suspend fun deleteNote(noteItem: NoteItem) {
        noteDao.deleteNoteEntity(noteItem.toNoteEntityForDelete())
    }

    override suspend fun getAllNotes(): List<NoteItem> {
        return noteDao.getAllNoteEntities().map { it.toNoteItem() }
    }
}