package com.example.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val soma = findViewById<Button>(R.id.btnSomar)
        val subtracao = findViewById<Button>(R.id.btnSubtrair)
        val divisao = findViewById<Button>(R.id.btnDividir)
        val multiplicacao = findViewById<Button>(R.id.btnMultiplicar)

        val textValor1 = findViewById<EditText>(R.id.edtFirstNumber)
        val textValor2 = findViewById<EditText>(R.id.edtSecondNumber)
        val textResp = findViewById<TextView>(R.id.textResp)

        var valor1 = 0.0
        var valor2 = 0.0
        var resultado = 0.0

        soma.setOnClickListener(){
            if (textValor1.text.toString().isEmpty() || textValor2.text.isEmpty()) {
                Toast.makeText(this, "Preencha os valores corretamente!", Toast.LENGTH_SHORT).show()
            } else{
                valor1 = textValor1.text.toString().toDouble()
                valor2 = textValor2.text.toString().toDouble()

                resultado = valor1 + valor2
                textResp.text = "O resultado é $resultado"
            }
        }

        subtracao.setOnClickListener(){
            if (textValor1.text.toString().isEmpty() || textValor2.text.isEmpty()) {
                Toast.makeText(this, "Preencha os valores corretamente!", Toast.LENGTH_SHORT).show()
            } else{
                valor1 = textValor1.text.toString().toDouble()
                valor2 = textValor2.text.toString().toDouble()

                resultado = valor1 - valor2
                textResp.text = "O resultado é $resultado"
            }
        }

        divisao.setOnClickListener(){
            if (textValor1.text.toString().isEmpty() || textValor2.text.isEmpty()) {
                Toast.makeText(this, "Preencha os valores corretamente!", Toast.LENGTH_SHORT).show()
            } else {
                valor1 = textValor1.text.toString().toDouble()
                valor2 = textValor2.text.toString().toDouble()

                resultado = valor1 / valor2
                textResp.text = "O resultado é $resultado"
            }
        }

        multiplicacao.setOnClickListener(){
            if (textValor1.text.toString().isEmpty() || textValor2.text.isEmpty()) {
                Toast.makeText(this, "Preencha os valores corretamente!", Toast.LENGTH_SHORT).show()
            } else {
                valor1 = textValor1.text.toString().toDouble()
                valor2 = textValor2.text.toString().toDouble()

                resultado = valor1 * valor2
                textResp.text = "O resultado é $resultado"
            }
        }

        }
    }
