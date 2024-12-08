package com.example.counterapp

interface CounterView {

    fun showCount(count: Int)
    fun showToast()
    fun turnIntoGreen()
    fun turnIntoBlack()
}