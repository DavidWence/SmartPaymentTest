package com.example.simpleplanetsapp_smartpayment.presentation.util

sealed class UiState(val uiEnabled: Boolean) {
    object Idle: UiState(true)
    object EvaluatingPreconditions: UiState(false)
    data class PreconditionsError(val message: String? = null): UiState(true)
    object Loading: UiState(false)
    data class Error(val message: String): UiState(true)
    object Finished: UiState(true)
}