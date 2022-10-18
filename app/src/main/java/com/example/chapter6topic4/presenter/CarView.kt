package com.example.chapter6topic4.presenter

import com.example.chapter6topic4.model.ResponseDataCarItem

interface CarView {
    fun onSuccess(pesan : String, cars : List<ResponseDataCarItem>)
    fun onError(pesan: String)
}