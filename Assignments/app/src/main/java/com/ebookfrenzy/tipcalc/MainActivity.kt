package com.ebookfrenzy.tipcalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ebookfrenzy.tipcalc.databinding.ActivityMainBinding
import com.example.androidsample.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun tipConvert(view: View, textView: Any){
        if (binding.billAmount.text.isNotEmpty()) {
            val dollarValue = binding.billAmount.text.toString().toFloat()
            val ten = dollarValue * 0.10f
            val fif = dollarValue * 0.15f
            val two = dollarValue * 0.20f
            binding.output.text = ten.toString()+ " = 10%\n" + fif.toString()+ " = 15%\n" +two.toString()+ " = 20%"

        } else {
            binding.output.text = "no dollar amount"

        }
    }
}