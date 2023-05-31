package com.example.intent_calc_web

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btn_calc:Button
    lateinit var btn_intent:Button
    lateinit var btn_web:Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_calc=findViewById(R.id.btn_calc)
        btn_intent=findViewById(R.id.btn_intent)
        btn_web=findViewById(R.id.btn_web)



        btn_calc.setOnClickListener {
            val calc = Intent (this,calculator_activity::class.java)
            startActivity(calc)


        btn_intent.setOnClickListener {
            val intent = Intent (this,intent_activity::class.java)
            startActivity(intent)


        btn_web.setOnClickListener {
            val web = Intent (this,web_activity::class.java)
            startActivity(web)
        }
        }
        }
    }
}