package com.example.chapter6topic4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chapter6topic4.model.Car
import com.example.chapter6topic4.model.ResponseDataCarItem
import com.example.chapter6topic4.presenter.CarPresenter
import com.example.chapter6topic4.presenter.CarView
import com.example.chapter6topic4.view.AdapterCar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), CarView {

    lateinit var presenterCar : CarPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenterCar = CarPresenter(this)
        presenterCar.getDataCar()
    }

    override fun onSuccess(pesan: String, cars: List<ResponseDataCarItem>) {
        rvCar.layoutManager = LinearLayoutManager(this)
        rvCar.adapter = AdapterCar(cars)
    }

    override fun onError(pesan: String) {
        Toast.makeText(this, pesan, Toast.LENGTH_LONG).show()
    }
}

