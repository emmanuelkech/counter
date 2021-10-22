package com.example.counter

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    var mCount = 0
    fun addNumber(){
        mCount++
    }
    fun subtractNumber() {
        mCount--
    }
}