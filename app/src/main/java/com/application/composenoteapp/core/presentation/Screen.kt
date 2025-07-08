package com.application.composenoteapp.core.presentation

/**
 * @Author: Umer Dev
 * @Created: 08/07/2025
 * @File: Screen.kt
 */
sealed interface Screen {
    @kotlinx.serialization.Serializable
    data object NoteList : Screen

    @kotlinx.serialization.Serializable
    data object AddNote : Screen
}