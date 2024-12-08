package com.example.counterapp

class CountPresenter {

    private val model = CounterModel()
    private var view: CounterView? = null

    fun attachView(view: CounterView) {
        this.view = view
        view.showCount(model.getCount())
    }

    fun onIncrement() {
        model.increment()
        updateView()
    }

    fun onDecrement() {
        model.decrement()
        updateView()
    }

    fun detachView() {
        view = null
    }

    private fun updateView() {
        view?.showCount(model.getCount())
        if (model.isEqualTen()) {
            view?.showToast()
        }
        if (model.isEqualFifteen()) {
            view?.turnIntoGreen()
        } else view?.turnIntoBlack()
    }
}