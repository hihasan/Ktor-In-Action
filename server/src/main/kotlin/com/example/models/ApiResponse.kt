package com.example.models

data class ApiResponse<T>(
    val success : Boolean,
    val message : String? = null,
    val data : List<T> = emptyList()
)
