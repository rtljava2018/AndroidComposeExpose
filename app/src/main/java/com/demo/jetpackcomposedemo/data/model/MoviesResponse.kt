package com.demo.jetpackcomposedemo.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MoviesResponse(
    @SerialName("page") val page: Int,
    @SerialName("results") val results: List<MovieResponse>,
    @SerialName("total_pages") val totalPages: Int)