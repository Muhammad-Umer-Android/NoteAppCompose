package com.application.composenoteapp.core.data.mapper

import com.application.composenoteapp.core.data.local.NoteEntity
import com.application.composenoteapp.core.domain.model.NoteItem

/**
 * @Author: Umer Dev
 * @Created: 07/07/2025
 * @File: NoteMapper.kt
 */

fun NoteItem.toNoteEntityForInsert(
): NoteEntity {
    return NoteEntity(
        title = title,
        description = description,
        imageUrl = imageUrl,
        dateAdded = dateAdded
    )
}

fun NoteItem.toNoteEntityForDelete(
): NoteEntity {
    return NoteEntity(
        title = title,
        description = description,
        imageUrl = imageUrl,
        dateAdded = dateAdded,
        id = id
    )
}

fun NoteEntity.toNoteItem(): NoteItem {
    return NoteItem(
        title = title,
        description = description,
        imageUrl = imageUrl,
        dateAdded = dateAdded,
        id = id ?: 0
    )
}