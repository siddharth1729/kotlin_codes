package com.example.multiplescreenapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class screen_3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen3)
    }

    fun screen_1(view: View) {
        val intent = Intent(this , MainActivity::class.java)
        startActivity(intent)
    }

    fun screen_2(view: View) {
        val intent = Intent(this , screen_2::class.java )
        startActivity(intent)
    }
}