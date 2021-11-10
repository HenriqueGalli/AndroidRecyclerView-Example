package com.project.recyclerview_example.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.project.recyclerview_example.R
import com.project.recyclerview_example.model.RestauranteVO
import com.project.recyclerview_example.viewmodel.RestaurantListViewModel

class RestaurantListActivity : AppCompatActivity() {

    private var restaurantList = ArrayList<RestauranteVO>()
    private lateinit var restaurantAdapter: RestaurantAdapter

    private val rvRestaurant by lazy { findViewById<RecyclerView>(R.id.rv_restaurant) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupViewModel()
        setupAdapter()

    }

    private fun setupViewModel() {
        val restaurantViewModel: RestaurantListViewModel by viewModels()
        restaurantList = restaurantViewModel.getRestaurants()
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