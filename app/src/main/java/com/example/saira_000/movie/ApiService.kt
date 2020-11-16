package com.example.saira_000.movie

import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("movie/popular")
    suspend fun getPopularMovies(@Query("api_key") api_key:String ="edb2d2b3af9b48538f6d223aa8a9579d"): Response<MovieResult>

    companion object {
        private val retrofit by lazy {
            Retrofit.Builder()
                .baseUrl("https://api.themoviedb.org/3/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        val apiService by lazy {
            retrofit.create(ApiService::class.java)
        }

    }

}