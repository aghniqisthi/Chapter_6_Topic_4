package com.example.chapter6topic4.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClientCar {
    const val BASE_URL = "https://rent-cars-api.herokuapp.com/"

    val instance : RestfulAPICar by lazy {
        val retrofit = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()
        retrofit.create(RestfulAPICar::class.java)
    }
}