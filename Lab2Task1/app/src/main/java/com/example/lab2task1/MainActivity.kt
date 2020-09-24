package com.example.lab2task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{
            happy.visibility = 1;
            hungry.visibility = 2;
            textView.text = "Im so full now!";
            button.text = "Done";
        }
    }
}