package com.example.chapter6topic4.presenter

import android.widget.Toast
import com.example.chapter6topic4.MainActivity
import com.example.chapter6topic4.model.ResponseDataCarItem
import com.example.chapter6topic4.network.RetrofitClientCar
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CarPresenter(val viewCar: CarView) {
    fun getDataCar(){
        RetrofitClientCar.instance.getAllFilm().enqueue(object : Callback<List<ResponseDataCarItem>>{
            override fun onResponse(
                call: Call<List<ResponseDataCarItem>>,
                response: Response<List<ResponseDataCarItem>>
            ) {
                if(response.isSuccessful) viewCar.onSuccess(response.message(), response.body()!!)
                else viewCar.onError(response.message())
            }

            override fun onFailure(call: Call<List<ResponseDataCarItem>>, t: Throwable) {
                viewCar.onError(t.message!!)
            }
        })
    }
}