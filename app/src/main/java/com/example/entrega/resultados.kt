package com.example.entrega

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class resultados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultados)
    // Get the Intent that started this activity and extract the string
    val titulo = intent.getStringExtra("titulo")
    val descripcion = intent.getStringExtra("descripcion")
    val fecha = intent.getStringExtra("fecha")
    // Capture the layout's TextView and set the string as its text
    val textView = findViewById<TextView>(R.id.textView).apply {
        text = titulo
    }
    val textView2 = findViewById<TextView>(R.id.textView2).apply {
        text = descripcion
    }
    val textView3 = findViewById<TextView>(R.id.textView3).apply {
        text = fecha
        }
    }
}