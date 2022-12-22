package com.wilson_morales.appforo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnpaisajes = findViewById<Button>(R.id.btnpaisajes)
        btnpaisajes.setOnClickListener{
            val intent1 = Intent(this, Lugares::class.java)
            startActivity(intent1)
        }

        val btngastronomia = findViewById<Button>(R.id.btngastronomia)
        btngastronomia. setOnClickListener{
            val intent2 = Intent(this, Gastronomia::class.java)
            startActivity(intent2)
        }
    }
}
