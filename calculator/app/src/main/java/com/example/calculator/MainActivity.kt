package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        val add = findViewById<Button>(R.id.add_btn)
       val substract = findViewById<Button>(R.id.substract_btn)
        val multply = findViewById<Button>(R.id.multply_btn)
        val divide = findViewById<Button>(R.id.div_btn)


        val output_btn = findViewById<Button>(R.id.btn_start)

        //addition
        add.setOnClickListener {

                val myintent = Intent(this, InputScreen::class.java)
                startActivity(myintent)
        }

        //substraction
        substract.setOnClickListener {

            val myintent = Intent(this, InputScreen::class.java)
            startActivity(myintent)
        }

        //multiplication
        multply.setOnClickListener {

            val myintent = Intent(this, InputScreen::class.java)
            startActivity(myintent)
        }


        //dividation
        divide.setOnClickListener {

            val myintent = Intent(this, InputScreen::class.java)
            startActivity(myintent)
        }

        /*fun calculateTip() {
            val tipPercentage = when (selectedId) {
                R.id.option_twenty_percent -> 0.20
                R.id.option_eighteen_percent -> 0.18
                R.id.option_zero_percent -> 0.00
                else -> 0.15
            }*/
    }
}