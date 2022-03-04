package com.example.imcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }
    private fun setListeners() {
        alturaEDT?.doAfterTextChanged { text ->
            Toast.makeText( this, text.toString(), Toast.LENGTH_SHORT).show()
        }
        pesoEDT?.doOnTextChanged { text, _, _, _ ->
            titleTXT?.text = text
        }
        calcularBTN?.setOnClickListener{
            calcularIMC(pesoEDT.text.toString(), alturaEDT.text.toString)
        }
    }
    private fun calcularIMCC(peso: String, altura:String) {
        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull(
        if (peso != null && altura != null) {
                val imc = peso / (altura * altura)
                titleTXT.text =
            }
        )
    }
}