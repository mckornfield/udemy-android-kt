package com.mckornfield.tipcalculator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        infoTextView.visibility = View.INVISIBLE

        calculateButton.setOnClickListener {
            val bill = billEditText.text.toString().toDouble()
            val percentage = percentageEditText.text.toString().toDouble()

            val tip = bill * (percentage/100)
            val total = tip + bill

            infoTextView.text = "Tip: ${toDollar(tip)}, Total: ${toDollar(total)}"
            infoTextView.visibility = View.VISIBLE
        }
    }

    fun toDollar(doubleVal: Double) : String {
        return String.format("$%.2f",doubleVal)
    }
}
