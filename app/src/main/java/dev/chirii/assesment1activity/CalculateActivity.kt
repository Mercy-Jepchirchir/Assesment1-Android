package dev.chirii.assesment1activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class CalculateActivity : AppCompatActivity() {

    lateinit var tilNumber1 : TextInputLayout
    lateinit var etNumber1 : TextInputEditText
    lateinit var tilNumber2 : TextInputLayout
    lateinit var etNumber2 : TextInputEditText
    lateinit var btnAdd: Button
    lateinit var  btnSubtract: Button
    lateinit var  btnDivision: Button
    lateinit var  btnModulus: Button
    lateinit var  tvOutput: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate)

        tilNumber1 = findViewById(R.id.tilNumber1)
        etNumber1 = findViewById(R.id.etNumber1)
        tilNumber2 = findViewById(R.id.tilNumber2)
        etNumber2 = findViewById(R.id.etNumber2)
        btnAdd = findViewById(R.id.btnAdd)
        btnDivision = findViewById(R.id.btnDivision)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnModulus = findViewById(R.id.btnModulus)
        tvOutput = findViewById(R.id.tvOutput)




        btnAdd.setOnClickListener {
            val number1 = etNumber1.text.toString()
            val number2 = etNumber2.text.toString()
            if (number1.isBlank()){
                tilNumber1.setError("Enter the first Number")
                return@setOnClickListener
            }
            if (number2.isBlank()){
                tilNumber2.setError("Enter the second Number")
                return@setOnClickListener
            }
            addition(number1.toString().toDouble(),number2.toString().toDouble())
        }

        btnSubtract.setOnClickListener {
            val number1 = etNumber1.text.toString()
            val number2 = etNumber2.text.toString()
            if (number1.isBlank()){
                tilNumber1.setError(" Enter First Number")
                return@setOnClickListener
            }
            if (number2.isBlank()){
                tilNumber2.setError("Enter Second Number")
                return@setOnClickListener
            }
            Subtraction(number1.toString().toDouble(),number2.toString().toDouble())
        }
        btnDivision.setOnClickListener {
            val number1 = etNumber1.text.toString()
            val number2 = etNumber2.text.toString()
            if (number1.isBlank()){
                tilNumber1.setError("Enter the first Number")
                return@setOnClickListener
            }
            if (number2.isBlank()){
                tilNumber2.setError("Enter the second number")
                return@setOnClickListener
            }
            Divide(number1.toString().toDouble(),number2.toString().toDouble())
        }
        btnModulus.setOnClickListener {
            val number1 = etNumber1.text.toString()
            val number2 = etNumber2.text.toString()
            if (number1.isBlank()){
                tilNumber1.setError("Enter the first number")
                return@setOnClickListener
            }
            if (number2.isBlank()){
                tilNumber2.setError("Enter the second number")
                return@setOnClickListener
            }
            Reminder(number1.toString().toDouble(),number2.toString().toDouble())
        }

    }
    fun addition(number1:Double,number2:Double){
        var add = number1 + number2
        tvOutput.text = add.toString()
    }
    fun Subtraction(number1:Double,number2:Double){
        var subtract = number1 - number2
        tvOutput.text = subtract.toString()
    }
    fun Divide(number1:Double,number2:Double){
        var divi = number1 / number2
        tvOutput.text = divi.toString()
    }
    fun Reminder(number1:Double,number2:Double){
        var rem = number1 % number2
        tvOutput.text = rem.toString()
    }
}