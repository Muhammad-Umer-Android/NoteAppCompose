package com.application.composenoteapp.core.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * @Author: Umer Dev
 * @Created: 07/07/2025
 * @File: NoteDb.kt
 */
@Database(
    entities = [NoteEntity::class],
    version = 1,
    exportSchema = false
)
abstract class NoteDb: RoomDatabase() {
    abstract val noteDao: NoteDao
}