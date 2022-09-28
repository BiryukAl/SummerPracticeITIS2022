package com.example.summpractice22

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //Input data
    private var textPersonName: EditText? = null
    private var textPersonHeight: EditText? = null
    private var textPersonWeight: EditText? = null
    private var textPersonAge: EditText? = null

    //Buttons
    private var buttonCalculate: Button? = null

    //Output Text
    private var textPoint: TextView? = null
    // yest token git


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inout data
        textPersonName = findViewById(R.id.editTextPersonName)
        textPersonHeight = findViewById(R.id.editTextPersonHeight)
        textPersonWeight = findViewById(R.id.editTextPersonWeight)
        textPersonAge = findViewById(R.id.editTextPersonAge)

        //Buttons
        buttonCalculate = findViewById(R.id.buttonCalculate)

        //Output Text
        textPoint = findViewById(R.id.textPoint)

        fun messageErrorIncorect() {
            Toast.makeText(this, R.string.errorInputData, Toast.LENGTH_LONG)
                .show()
        }

        buttonCalculate?.setOnClickListener {
            var nameLength = 0
            var height = 0
            var weight = 0
            var age = 0

            try {
                if (textPersonName!!.length() > 50) {
                    messageErrorIncorect()
                } else {
                    nameLength = textPersonName!!.length()
                }

                if (textPersonHeight!!.text.toString().toInt() <= 0 ||
                    textPersonHeight!!.text.toString().toInt() > 250
                ) {
                    messageErrorIncorect()
                } else {
                    height = textPersonHeight!!.text.toString().toInt()
                }

                if (textPersonWeight!!.text.toString().toFloat() <= 0 ||
                    textPersonWeight!!.text.toString().toFloat() > 250
                ) {
                    messageErrorIncorect()
                } else {
                    weight = (textPersonWeight!!.text.toString().toFloat()).toInt()
                }

                if (textPersonAge!!.text.toString().toInt() <= 0 ||
                    textPersonAge!!.text.toString().toInt() > 150
                ) {
                    messageErrorIncorect()
                } else {
                    age = textPersonAge!!.text.toString().toInt()
                }

                val point = (age + height + weight + nameLength) % 10

                textPoint?.text = "$point /10"

            } catch (e: NumberFormatException) {
                messageErrorIncorect()
            } catch (e: NullPointerException) {
                messageErrorIncorect()
            }


        }

    }
}
