package com.example.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        fun sum(textView: TextView,numero1: Double, numero2: Double) {
            textView.text = "Resultado: ${numero1 + numero2}"
        }

        fun multiply(textView: TextView,numero1: Double, numero2: Double) {
            textView.text = "Resultado: ${numero1 * numero2}"
        }

        fun deduct(textView: TextView,numero1: Double, numero2: Double) {
            textView.text = "Resultado: ${numero1 - numero2}"
        }

        fun divide(textView: TextView,numero1: Double, numero2: Double) {
            textView.text = "Resultado: ${numero1 / numero2}"
        }

        val textView1 = findViewById<TextView>(R.id.textView)
        val editTextText1 = findViewById<EditText>(R.id.editTextText1)
        val editTextText2 = findViewById<EditText>(R.id.editTextText2)
        val button= findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)

        button.setOnClickListener{
            val numero1 = editTextText1.text.toString().toDoubleOrNull() ?: 0.0
            val numero2 = editTextText2.text.toString().toDoubleOrNull() ?: 0.0
            multiply(textView1,numero1,numero2)
        }

        button2.setOnClickListener {
            val numero1 = editTextText1.text.toString().toDoubleOrNull() ?: 0.0
            val numero2 = editTextText2.text.toString().toDoubleOrNull() ?: 0.0
            sum(textView1,numero1,numero2)
        }

        button3.setOnClickListener{
            val numero1 = editTextText1.text.toString().toDoubleOrNull() ?: 0.0
            val numero2 = editTextText2.text.toString().toDoubleOrNull() ?: 0.0
            deduct(textView1,numero1,numero2)
        }

        button4.setOnClickListener{
            val numero1 = editTextText1.text.toString().toDoubleOrNull() ?: 0.0
            val numero2 = editTextText2.text.toString().toDoubleOrNull() ?: 0.0
            divide(textView1,numero1,numero2)
        }

    }
}
