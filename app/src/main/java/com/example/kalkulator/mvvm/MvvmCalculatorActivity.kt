package com.example.kalkulator.mvvm

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.kalkulator.R

class MvvmCalculatorActivity : AppCompatActivity() {

    private lateinit var resultEditText: EditText
    private lateinit var buttonAdd: Button
    private lateinit var buttonSubtract: Button
    private val calculatorViewModel: CalculatorViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.xml.activity_mvvm_calculator)

        resultEditText = findViewById(R.id.resultEditText)
        buttonAdd = findViewById(R.id.buttonAdd)
        buttonSubtract = findViewById(R.id.buttonSubtract)

        buttonAdd.setOnClickListener {
            val num1 = resultEditText.text.toString().toInt()
            val num2 = 5
            calculatorViewModel.add(num1, num2)
        }

        buttonSubtract.setOnClickListener {
            val num1 = resultEditText.text.toString().toInt()
            val num2 = 3
            calculatorViewModel.subtract(num1, num2)
        }

        // Observe changes from ViewModel
        calculatorViewModel.result.observe(this, { result ->
            resultEditText.setText(result.toString())
        })
    }
}