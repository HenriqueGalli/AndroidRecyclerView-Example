package com.project.recyclerview_example.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.project.recyclerview_example.model.RestauranteVO

class RestaurantListViewModel : ViewModel() {

    private var restaurantList = ArrayList<RestauranteVO>()

    private val restaurants: MutableLiveData<List<RestauranteVO>> by lazy {
        MutableLiveData<List<RestauranteVO>>().also {
            loadRestaurants()
        }
    }

    fun getRestaurants(): ArrayList<RestauranteVO> {
        return loadRestaurants()
    }

    private fun loadRestaurants(): ArrayList<RestauranteVO> {
        return mockRestaurant()
    }

    private fun mockRestaurant(): ArrayList<RestauranteVO> {

        restaurantList.add(RestauranteVO("Yamato", "Japonesa"))
        restaurantList.add(RestauranteVO("Vila Mex", "Mexicana"))
        restaurantList.add(RestauranteVO("Zensei", "Japonesa"))
        restaurantList.add(RestauranteVO("Hanover", "Fondue"))
        restaurantList.add(RestauranteVO("Portal da Coreia", "Coreia"))

        return restaurantList
    }
}