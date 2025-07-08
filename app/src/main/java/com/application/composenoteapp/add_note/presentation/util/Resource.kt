package com.application.composenoteapp.add_note.presentation.util

/**
 * @Author: Umer Dev
 * @Created: 08/07/2025
 * @File: Resource.kt
 */
sealed class Resource<T>(
    val data: T? = null,
) {
    class Success<T>(data: T?) : Resource<T>(data)
    class Error<T>(data: T? = null) : Resource<T>(data)
    class Loading<T>(val isLoading: Boolean = true) : Resource<T>(null)
}