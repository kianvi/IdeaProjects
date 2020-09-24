package com.example.lab2task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonplus.setOnClickListener(){
            textView3.text = (textView3.text.toString().toInt()+1).toString();
        }
        buttonminus.setOnClickListener(){
            textView3.text = (textView3.text.toString().toInt()-1).toString();
        }
        buttonorder.setOnClickListener(){
            var iscream = "no";
            var ischoco = "no";
            val price = 4.5 * textView3.text.toString().toInt();
            if (checkBox.isChecked){
                 iscream = "yes";
            }

            if (checkBox3.isChecked){
                 ischoco = "yes";
            }

            textOrder.text = "Add whipped cream? " + iscream + "\n Add chocolate? " + ischoco + "\n Quantity: "+ textView3.text +"\n Price " + price+ "\n THANK YOU!";
        }
    }
}