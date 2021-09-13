package com.example.erwingalvarezcal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonSuma: Button = findViewById(R.id.botonSuma)
        val botonResta: Button = findViewById(R.id.botonResta)
        val botonMulti: Button = findViewById(R.id.botonMulti)
        val botonDividir: Button = findViewById(R.id.botonDividir)
        val numero1: EditText = findViewById(R.id.numero1)
        val numero2: EditText = findViewById(R.id.numero2)
        val resultado: TextView = findViewById(R.id.resultado)

        botonSuma.setOnClickListener{
            val num1: Double = numero1.text.toString().toDouble()
            val num2: Double = numero2.text.toString().toDouble()

            val suma = num1 + num2
            resultado.text = "$suma"
        }

        botonResta.setOnClickListener{
            val num1: Double = numero1.text.toString().toDouble()
            val num2: Double = numero2.text.toString().toDouble()

            val resta = num1 - num2
            resultado.text = "$resta"
        }

        botonMulti.setOnClickListener{
            val num1: Double = numero1.text.toString().toDouble()
            val num2: Double = numero2.text.toString().toDouble()

            val multi = num1 * num2
            resultado.text = "$multi"
        }

        botonDividir.setOnClickListener{
            val num1: Double = numero1.text.toString().toDouble()
            val num2: Double = numero2.text.toString().toDouble()

            if(num1 != 0.0 ){
                val divicion = num1 / num2
                resultado.text = "$divicion"
            } else{

                numero1.setError("No se puede devidir por 0")
            }
            if(num2 != 0.0 ){
                val divicion = num1 / num2
                resultado.text = "$divicion"
            } else{

                numero2.setError("No se puede devidir por 0")
            }



        }

    }
}