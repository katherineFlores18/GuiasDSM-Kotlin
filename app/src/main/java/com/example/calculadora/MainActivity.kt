package com.example.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var N1: EditText
    private lateinit var N2: EditText
    private lateinit var Resultado: TextView
    private lateinit var Calcular: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        N1 = findViewById(R.id.n1)
        N2 = findViewById(R.id.n2)
        Resultado = findViewById(R.id.resultado)
        Calcular = findViewById(R.id.btn_calcular)
    }

    fun suma(view: android.view.View) {
        val number1 = N1.text.toString().toFloatOrNull() ?: 0f
        val number2 = N2.text.toString().toFloatOrNull() ?: 0f
        val respuesta = number1 + number2
        Resultado.text = "respuesta: $respuesta"
    }
}
