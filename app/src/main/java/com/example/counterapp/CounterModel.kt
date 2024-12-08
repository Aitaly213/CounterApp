package com.example.counterapp

class CounterModel {
    private var count: Int = 0

    fun increment() {
        count++
    }

    fun decrement() {
        count--
    }

    fun isEqualTen() = count == 10

    fun isEqualFifteen() = count == 15

    fun getCount() = count
}