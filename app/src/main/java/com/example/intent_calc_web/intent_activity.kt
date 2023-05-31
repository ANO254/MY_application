package com.example.intent_calc_web

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import android.Manifest

class intent_activity : AppCompatActivity() {
    lateinit var btnsms:Button
    lateinit var btncall:Button
    lateinit var btncamera:Button
    lateinit var btnshare:Button
    lateinit var btnmpesa:Button
    lateinit var btndail:Button
    lateinit var btnemail:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

    btncall=findViewById(R.id.btn_call)
    btncamera=findViewById(R.id.btn_camera)
    btnshare=findViewById(R.id.btn_share)
    btnmpesa=findViewById(R.id.btn_mpesa)
    btndail=findViewById(R.id.btn_dail)
    btnemail=findViewById(R.id.btn_email)
    btnsms=findViewById(R.id.btn_sms)


    btnsms.setOnClickListener {
        val uri= Uri.parse("smsto:0112891632")
        val intent=Intent(Intent.ACTION_SENDTO,uri)
        intent.putExtra("Good Afternoon","How are you doing?")
        startActivity(intent)
    }

    btncall.setOnClickListener {
        val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+254112891632"))

        if (ContextCompat.checkSelfPermission(
                this@intent_activity,
                android.Manifest.permission.CALL_PHONE
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this@intent_activity,
                arrayOf(Manifest.permission.CALL_PHONE),
                1
            )
        } else {
            startActivity(intent)
        }
    }

    btndail.setOnClickListener {
        val phone = "+254"

        val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null))

        startActivity(intent)
    }

    btnmpesa.setOnClickListener {

    }

    btnemail.setOnClickListener {
        val emailIntent =
            Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "abc@gmail.com", null))

        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject")

        emailIntent.putExtra(Intent.EXTRA_TEXT, "Body")

        startActivity(Intent.createChooser(emailIntent, "Send email..."))
    }

    btnshare.setOnClickListener {
        val shareIntent = Intent(Intent.ACTION_SEND)

        shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK

        shareIntent.type = "text/plain"

        shareIntent.putExtra(Intent.EXTRA_TEXT, "Hey, download this app!")

        startActivity(shareIntent)

    }

    btncamera.setOnClickListener {
        val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

        startActivityForResult(takePictureIntent, 1)





    }
    }
}