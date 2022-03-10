package com.example.models


@kotlinx.serialization.Serializable
data class PaginatedApiResponse(
    val success : Boolean,
    val message : String ? = null,
    val prevPage : Int? = null,
    val nextPage : Int? = null,
    val heroes : List<Hero> = emptyList()
)