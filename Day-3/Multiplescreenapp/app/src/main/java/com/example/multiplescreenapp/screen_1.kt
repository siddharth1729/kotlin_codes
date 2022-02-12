package com.example.multiplescreenapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class screen_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen1)
    }

    fun screen_2(view: View) {}
}