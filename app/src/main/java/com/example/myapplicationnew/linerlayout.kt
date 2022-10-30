package com.example.myapplicationnew

import android.content.Intent
import android.icu.text.CaseMap.Title
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class linerlayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle("LinerLayout");
        setContentView(R.layout.activity_linerlayout)

    }

    var isCheked = false
    fun onClick1(view: View){
        val textView2: TextView = findViewById(R.id.textView2)//Ориентация
        val textView4: TextView = findViewById(R.id.textView4)//Выравнивание
        /*var button1=findViewById<Button>(R.id.button1)//Ориентация
        var button2=findViewById<Button>(R.id.button2)
        var button3=findViewById<Button>(R.id.button3)//Ориентация
        var button4=findViewById<Button>(R.id.button4)
        var button5=findViewById<Button>(R.id.button5)//Ориентация
        var button6=findViewById<Button>(R.id.button6)*/

        when (view.id) {
            R.id.button1 -> {
                textView2.setText("Ориентация")
            }

            R.id.button3 -> {
                textView2.setText("Ориентация")
            }

            R.id.button5 -> {
                textView2.setText("Ориентация")
            }


            R.id.button2 -> {
                textView4.setText("Выравнивание")
            }

            R.id.button4 -> {
                textView4.setText("Выравнивание")
            }

            R.id.button6 -> {
                textView4.setText("Выравнивание")
            }
        }

        val textOrientation = findViewById<TextView>(R.id.textView2)
        val textGravity = findViewById<TextView>(R.id.textView4)
    }

    fun onClick(view: View) {
        val intent : Intent = Intent (this@linerlayout,tableLayoutActivity::class.java)
        startActivity(intent)
    }

    }

