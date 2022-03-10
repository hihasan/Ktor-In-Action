package com.example.models

//@kotlinx.serialization.Serializable
data class ToDoDraft(
    val title: String ?= null,
    val body: String ?= null
)
