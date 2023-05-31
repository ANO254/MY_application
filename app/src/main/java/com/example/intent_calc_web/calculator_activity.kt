package com.example.intent_calc_web

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class calculator_activity : AppCompatActivity() {
    lateinit var Tvanswer:TextView
    lateinit var Edfirstnum:EditText
    lateinit var Edsecondnum:EditText
    lateinit var btnadd:Button
    lateinit var btnsubtract:Button
    lateinit var btnmultipy:Button
    lateinit var btndivision:Button

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

    Tvanswer=findViewById(R.id.answer)
    Edfirstnum=findViewById(R.id.first_number)
    Edsecondnum=findViewById(R.id.second_number)
    btnadd=findViewById(R.id.btn_add)
    btndivision=findViewById(R.id.btn_division)
    btnmultipy=findViewById(R.id.btn_multiplication)
    btnsubtract=findViewById(R.id.btn_subtract)

        btnadd.setOnClickListener{
        val firstnum=Edfirstnum.text.toString()
        val secondnum=Edsecondnum.text.toString()
        if(firstnum.isEmpty()&& secondnum.isEmpty()) {
            Tvanswer.text="Please fill in all detail"
        }else{
            var answer=firstnum.toDouble()+ secondnum.toDouble()
            Tvanswer.text=answer.toString()
        }
    }

        btnsubtract.setOnClickListener {
            val firstnum=Edfirstnum.text.toString()
            val secondnum=Edsecondnum.text.toString()
            if(firstnum.isEmpty()&& secondnum.isEmpty()) {
                Tvanswer.text="Please fill in all detail"
            }else{
                var answer=firstnum.toDouble()- secondnum.toDouble()
                Tvanswer.text=answer.toString()
            }
        }


        btndivision.setOnClickListener {
            val firstnum=Edfirstnum.text.toString()
            val secondnum=Edsecondnum.text.toString()
            if(firstnum.isEmpty()&& secondnum.isEmpty()) {
                Tvanswer.text="Please fill in all detail"
            }else{
                var answer=firstnum.toDouble()/ secondnum.toDouble()
                Tvanswer.text=answer.toString()
            }
        }


        btnmultipy.setOnClickListener {
            val firstnum=Edfirstnum.text.toString()
            val secondnum=Edsecondnum.text.toString()
            if(firstnum.isEmpty()&& secondnum.isEmpty()) {
                Tvanswer.text="Please fill in all detail"
            }else{
                var answer=firstnum.toDouble()* secondnum.toDouble()
                Tvanswer.text=answer.toString()
            }
        }
    }
}