package com.example.entrega

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Thread.sleep(2000)
        setTheme(R.style.Theme_Entrega)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_resultados)
    }
/*
    fun sendMessage(view: View) {
        val titulo = findViewById<EditText>(R.id.id_titulo)
        val descripcion = findViewById<EditText>(R.id.id_descripcion)
        val fecha = findViewById<EditText>(R.id.id_fecha)
        val intent = Intent(this, resultados::class.java).apply {
            putExtra("titulo", titulo.text.toString());
            putExtra("descripcion", descripcion.text.toString());
            putExtra("fecha", fecha.text.toString());
        }
        startActivity(intent)*/
/*

        override fun onSaveInstanceState(outState: Bundle) {
            super.onSaveInstanceState(outState)
            outState.putString("titulo", titulo.text.toString())
            outState.putString("descripcion", descripcion.text.toString())
            outState.putString("fecha", fecha.text.toString())
        }
    }*/
}