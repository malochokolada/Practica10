package com.example.myapplicationnew

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var isChecked = false



    fun onClick2(view: View) {
        var btn1 = findViewById<Button>(R.id.button1)
        var btn2 = findViewById<Button>(R.id.button2)
        var btn3 = findViewById<Button>(R.id.button3)


        if (isChecked){
            btn1.visibility = View.INVISIBLE
            btn2.visibility = View.VISIBLE
            isChecked = !isChecked

        }
        else
        {
            btn2.visibility = View.INVISIBLE
            btn1.visibility = View.VISIBLE
            isChecked = !isChecked
        }
    }

    fun onClick(view: View) {
        val intent : Intent = Intent (this@MainActivity,linerlayout::class.java)
           startActivity(intent)
    }
}