package com.example.kalkulator.mvvm

//package com.example.kalkulatormvcmvvm.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculatorViewModel : ViewModel() {

    private val _result = MutableLiveData<Int>()
    val result: LiveData<Int> get() = _result

    fun add(a: Int, b: Int) {
        _result.value = a + b
    }

    fun subtract(a: Int, b: Int) {
        _result.value = a - b
    }
}