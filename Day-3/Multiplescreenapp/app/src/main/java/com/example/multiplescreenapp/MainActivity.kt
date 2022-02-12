package com.example.multiplescreenapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun screen_1(view: View) {
        val intent = Intent(this , screen_1::class.java)
        startActivity(intent)
    }

    fun screen_2(view: View) {
        val intent = Intent(this , screen_2::class.java)
        startActivity(intent)
    }

    fun screen_3(view: View) {
        val intent = Intent(this , screen_3::class.java)
        startActivity(intent)
    }
}