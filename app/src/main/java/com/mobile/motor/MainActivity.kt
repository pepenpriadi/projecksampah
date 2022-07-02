package com.mobile.motor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnJemput : Button
    private lateinit var btnSave   : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnJemput = findViewById(R.id.btnjemput)
        btnSave = findViewById(R.id.btnsave)

        btnJemput.setOnClickListener {
            val intent = Intent( this, InputData::class.java)
            startActivity(intent)
        }
    }
}