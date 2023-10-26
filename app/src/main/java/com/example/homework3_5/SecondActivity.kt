package com.example.homework3_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    private lateinit var textView2 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        textView2 = findViewById(R.id.result)
        val result = intent.getStringExtra("key")

        textView2.text = result.toString()

    }
}