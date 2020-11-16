package com.example.saira_000.movie


import com.google.gson.annotations.SerializedName

data class MovieResult(
    @SerializedName("results")
    val results: List<Result>
)