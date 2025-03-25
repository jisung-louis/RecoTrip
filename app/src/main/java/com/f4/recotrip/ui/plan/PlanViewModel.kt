package com.f4.recotrip.ui.plan

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PlanViewModel : ViewModel() {
    val keyword = MutableLiveData<String>()
    val selectedCity = MutableLiveData<String>()
    val travelDates = MutableLiveData<Pair<String, String>>()
    val selectedPlaces = MutableLiveData<List<String>>()
    val selectedHotel = MutableLiveData<String>()
}