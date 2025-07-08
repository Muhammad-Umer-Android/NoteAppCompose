package com.application.composenoteapp.core.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert

/**
 * @Author: Umer Dev
 * @Created: 07/07/2025
 * @File: MovieDao.kt
 */
@Dao
interface NoteDao {
    @Upsert
    suspend fun upsertNoteEntity(noteEntity: NoteEntity)

    @Query("SELECT * FROM noteEntity")
    suspend fun getAllNoteEntities(): List<NoteEntity>

    @Delete
    suspend fun deleteNoteEntity(noteEntity: NoteEntity)
}