package com.example.todoexample.util

sealed class UiEvent{
    object PopBackStacked: UiEvent()
    data class Navigate(val route: String): UiEvent()
    data class ShowSnackbar(
        val message: String,
        val action: String? = null
    ):UiEvent()
}
