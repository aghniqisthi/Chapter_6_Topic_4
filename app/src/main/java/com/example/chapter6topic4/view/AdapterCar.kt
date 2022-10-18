package com.example.chapter6topic4.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.chapter6topic4.databinding.ItemCarBinding
import com.example.chapter6topic4.model.ResponseDataCar
import com.example.chapter6topic4.model.ResponseDataCarItem

class AdapterCar(var listCar : List<ResponseDataCarItem>) : RecyclerView.Adapter<AdapterCar.ViewHolder>() {
    class ViewHolder (var binding: ItemCarBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterCar.ViewHolder {
        var view = ItemCarBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterCar.ViewHolder, position: Int) {
        holder.binding.txtJudulFilm.text = listCar[position].name
        holder.binding.txtYearFilm.text = listCar[position].category
    }

    override fun getItemCount(): Int = listCar.size
}