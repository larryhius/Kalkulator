package com.example.kalkulator.mvc
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.kalkulatormvcmvvm.R

class MvcCalculatorActivity : AppCompatActivity() {

    private lateinit var resultEditText: EditText
    private lateinit var buttonAdd: Button
    private lateinit var buttonSubtract: Button
    private lateinit var calculatorModel: CalculatorModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvc_calculator)

        resultEditText = findViewById(R.id.resultEditText)
        buttonAdd = findViewById(R.id.buttonAdd)
        buttonSubtract = findViewById(R.id.buttonSubtract)

        calculatorModel = CalculatorModel()

        buttonAdd.setOnClickListener {
            val num1 = resultEditText.text.toString().toInt()
            val num2 = 5  // Contoh angka tetap untuk kalkulasi
            resultEditText.setText(calculatorModel.add(num1, num2).toString())
        }

        buttonSubtract.setOnClickListener {
            val num1 = resultEditText.text.toString().toInt()
            val num2 = 3
            resultEditText.setText(calculatorModel.subtract(num1, num2).toString())
        }
    }
}