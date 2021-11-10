package com.project.recyclerview_example.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.project.recyclerview_example.R
import com.project.recyclerview_example.model.RestauranteVO

class RestaurantAdapter(restaurants: ArrayList<RestauranteVO>) :
    RecyclerView.Adapter<RestaurantAdapter.ViewHolder>() {

    val restaurantsList = restaurants

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvName = view.findViewById<TextView>(R.id.tv_name_restaurant)
        val tvCategory = view.findViewById<TextView>(R.id.tv_category_restaurant)

        fun bind(restaurant: RestauranteVO){
            tvName.text = restaurant.nome
            tvCategory.text = restaurant.categoria
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_restaurante, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(restaurantsList[position])
    }

    override fun getItemCount(): Int {
        return restaurantsList.size
    }
}