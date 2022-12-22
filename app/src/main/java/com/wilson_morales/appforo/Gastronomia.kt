package com.wilson_morales.appforo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Gastronomia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gastronomia)

        val btnhome = findViewById<Button>(R.id.btn_home)
        btnhome.setOnClickListener{
            val intent4 = Intent(this, MainActivity::class.java)
            startActivity(intent4)
        }


    }
}