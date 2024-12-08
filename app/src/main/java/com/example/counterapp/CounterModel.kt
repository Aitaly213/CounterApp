package com.example.counterapp

class CounterModel {
    private var count: Int = 0

    fun increment() {
        count++
    }

    fun decrement() {
        count--
    }

    fun isEqualTen(): Boolean {
        return count == 10
    }

    fun isEqualFifteen(): Boolean {
        return count == 15
    }

    fun getCount() = count
}