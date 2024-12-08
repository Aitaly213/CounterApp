package com.example.counterapp

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.counterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterView {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val presenter = CountPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        presenter.attachView(this)


        with(binding) {
            btnPlus.setOnClickListener {
                presenter.onIncrement()
            }

            btnMinus.setOnClickListener {
                presenter.onDecrement()
            }

        }
    }

    override fun showCount(count: Int) {
        binding.tvResult.text = count.toString()
    }

    override fun showToast() {
        Toast.makeText(this, "Поздравляем!", Toast.LENGTH_SHORT).show()
    }

    override fun turnIntoGreen() {
        binding.tvResult.setTextColor(Color.GREEN)
    }

    override fun turnIntoBlack() {
        binding.tvResult.setTextColor(Color.BLACK)
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detachView()
    }
}