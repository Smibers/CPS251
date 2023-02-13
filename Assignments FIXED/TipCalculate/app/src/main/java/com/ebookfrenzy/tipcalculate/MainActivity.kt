package com.ebookfrenzy.tipcalculate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.ebookfrenzy.tipcalculate.databinding.ActivityMainBinding

//import com.example.androidsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun tipConvert(view: View){

        if (binding.billAmount.text.isNotEmpty()) {
            val dollarValue = binding.billAmount.text.toString().toFloat()
            val ten = dollarValue * 0.10f
            val fif = dollarValue * 0.15f
            val two = dollarValue * 0.20f
            binding.output.text = buildString {
        append(ten.toString())
        append(" = 10%\n")
        append(fif.toString())
        append(" = 15%\n")
        append(two.toString())
        append(" = 20%")
    }

        } else {
            binding.output.text = "no dollar amount"

        }
    }
}
