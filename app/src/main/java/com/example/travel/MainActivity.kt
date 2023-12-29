package com.example.travel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.travel.databinding.ActivityMainBinding
import kotlin.math.round
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calcular.setOnClickListener(){
            calculate()
        }
    }

    private fun calculate(){
        val distance = binding.distancia.text.toString().toDouble()
        val price = binding.combustivel.text.toString().toDouble()
        val consumption = binding.consumo.text.toString().toDouble()
        val result = (distance / consumption ) * price
        val resultFormated = String.format("%.2f", result).replace(".",",")
        binding.resultado.text = "R$ ${resultFormated}"
    }
}