package com.example.homework3_5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.homework3_5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var button: Button
    private var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)
    }
    fun onButtonClick(view: View) {
        if (counter < 10 && button.text != "-1") {
            counter++
            textView.text = counter.toString()
        }

        else if (counter ==10 || counter<10 && counter>0) {
            button.text = "-1"
            counter--
            textView.text = counter.toString()

        }

        else if (counter == 0) {

                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("key", counter.toString())
                startActivity(intent)
            }

        }
    }

