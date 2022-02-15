package com.example.calculator


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class InputScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_screen)
        val input1 = findViewById<EditText>(R.id.edit_Text1)
        val input2 = findViewById<EditText>(R.id.edit_Text2)
        val print = findViewById<Button>(R.id.btn_start)
        var x = findViewById<TextView>(R.id.txt)
        var y = findViewById<TextView>(R.id.result)


       print.setOnClickListener{
           val num1 = Integer.parseInt(input1.text.toString())
           val num2 = Integer.parseInt(input2.text.toString())
           val result = num1+num2
           x.setText(result.toString())
          // y.setText(result.toString())

            val intent = Intent(this , output::class.java)
           val bundle=Bundle()
           intent.putExtra("key", result.toString())
           startActivity(intent)
       }


    }

}


