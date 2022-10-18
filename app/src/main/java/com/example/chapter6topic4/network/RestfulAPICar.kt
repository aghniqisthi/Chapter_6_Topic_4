package com.example.chapter6topic4.network

import com.example.chapter6topic4.model.ResponseDataCarItem
import retrofit2.Call
import retrofit2.http.GET

interface RestfulAPICar {
    @GET("admin/car")
    fun getAllFilm() : Call<List<ResponseDataCarItem>>
}