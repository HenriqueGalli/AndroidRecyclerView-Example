package com.project.recyclerview_example.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.project.recyclerview_example.R
import com.project.recyclerview_example.model.RestauranteVO

class RestaurantListActivity : AppCompatActivity() {

    private var restaurantList = ArrayList<RestauranteVO>()
    private lateinit var restaurantAdapter: RestaurantAdapter

    private val rvRestaurant by lazy { findViewById<RecyclerView>(R.id.rv_restaurant) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mockRestaurant()
        setupAdapter()
    }

    private fun mockRestaurant() {
        restaurantList.add(RestauranteVO("Yamato", "Japonesa"))
        restaurantList.add(RestauranteVO("Vila Mex", "Mexicana"))
        restaurantList.add(RestauranteVO("Zensei", "Japonesa"))
        restaurantList.add(RestauranteVO("Hanover", "Fondue"))
        restaurantList.add(RestauranteVO("Portal da Coreia", "Coreia"))
    }

    private fun setupAdapter() {
        restaurantAdapter = RestaurantAdapter(restaurantList)
        rvRestaurant.adapter = restaurantAdapter
        rvRestaurant.layoutManager = LinearLayoutManager(
            this, LinearLayoutManager.VERTICAL,
            false
        )
    }
}