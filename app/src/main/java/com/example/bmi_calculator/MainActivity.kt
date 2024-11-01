package com.example.bmi_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.bmi_calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.ShowBtn.setOnClickListener {


            val height = binding.Edt1.text.toString().toDouble()/100
            val weight =binding.Edt2.text.toString().toDouble()
            val bmi=weight/(height*height)


            binding.BMITv.text =String.format("BMI is : %2f",bmi)
            binding.BMItypeTv.text=when(bmi){
                in 1.00..18.4->"Under_weight"
                in 18.5..25.5->"Perfect"
                in 25.6..30.50->"Over Weight"


                else -> "You are no more in the world"
            }

        }







    }
}