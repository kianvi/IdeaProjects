package com.example.lab1task3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(){

            var r: Double;
            var pi : Double;
            var s: Double;
            var l: Double;
            r = radiusInput.text.toString().toDouble();
            pi = 3.1415;
            s = pi * r * r;
            l = 2 * pi * r;

            textView.text = "circle's circumference is:" + l.toString() + "\n circle's are is: " + s.toString();

        }
    }
}