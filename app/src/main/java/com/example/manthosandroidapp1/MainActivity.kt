package com.example.manthosandroidapp1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener {
            println(button1.text)
            colorSample.setBackgroundColor(Color.CYAN)
        }
        button2.setOnClickListener {
            println(button2.text)
            colorSample.setBackgroundColor(Color.GREEN)
        }
        button3.setOnClickListener {
            println(button3.text)
            colorSample.setBackgroundColor(Color.BLUE)
        }
        button4.setOnClickListener {
            println(button4.text)
            colorSample.setBackgroundColor(Color.RED)
        }
        button5.setOnClickListener {
            println(button5.text)
            colorSample.setBackgroundColor(Color.YELLOW)
        }
        button6.setOnClickListener {
            println(button6.text)
            colorSample.setBackgroundColor(Color.GRAY)
        }
    }
}
