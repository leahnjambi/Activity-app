package com.leahnjambi.activityapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity2 : AppCompatActivity() {
    lateinit var mTvResult:TextView
    lateinit var mTvEdtNum1:EditText
    lateinit var mTvEdtNum2:EditText
    lateinit var btnMul:Button
    lateinit var btnSub:Button
    lateinit var btnDiv:Button
    lateinit var btnAdd:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator2)
        mTvResult = findViewById(R.id.mTvResults)
        mTvEdtNum1 = findViewById(R.id.mTvEdtNum1)
        mTvEdtNum2 = findViewById(R.id.mTvEdtNum2)
        btnAdd = findViewById(R.id.btnAdd)
        btnDiv = findViewById(R.id.btnDiv)
        btnMul = findViewById(R.id.btnMul)
        btnSub = findViewById(R.id.btnSub)

        // Set ClickLister to all the button

        btnAdd.setOnClickListener {
            //Receive the first and second number to compute
            var firstNumber = mTvEdtNum1.text.toString().trim()
            var secondNumber = mTvEdtNum2.text.toString().trim()
            if (firstNumber.isEmpty()||secondNumber.isEmpty()){
                mTvResult.text="Please Enter Valid numbers!!"
            }else{
                //Proceed to compute the value
                var jibu = firstNumber.toDouble() + secondNumber.toDouble()
                mTvResult.text = jibu.toString()
            }

        }
        btnSub.setOnClickListener {
            //Receive the first and second number to compute
            var firstNumber = mTvEdtNum1.text.toString().trim()
            var secondNumber = mTvEdtNum2.text.toString().trim()
            if (firstNumber.isEmpty()||secondNumber.isEmpty()){
                mTvResult.text="Please Enter Valid numbers!!"
            }else{
                //Proceed to compute the value
                var jibu = firstNumber.toDouble() - secondNumber.toDouble()
                mTvResult.text = jibu.toString()

        }
        btnDiv.setOnClickListener {
            //Receive the first and second number to compute
            var firstNumber = mTvEdtNum1.text.toString().trim()
            var secondNumber = mTvEdtNum2.text.toString().trim()
            if (firstNumber.isEmpty()||secondNumber.isEmpty()){
                mTvResult.text="Please Enter Valid numbers!!"
            }else{
                //Proceed to compute the value
                var jibu = firstNumber.toDouble() / secondNumber.toDouble()
                mTvResult.text = jibu.toString()

        }

        }
        btnMul.setOnClickListener {
            //Receive the first and second number to compute
            var firstNumber = mTvEdtNum1.text.toString().trim()
            var secondNumber = mTvEdtNum2.text.toString().trim()
            if (firstNumber.isEmpty()||secondNumber.isEmpty()){
                mTvResult.text="Please Enter Valid numbers!!"
            }else{
                //Proceed to compute the value
                var jibu = firstNumber.toDouble() * secondNumber.toDouble()
                mTvResult.text = jibu.toString()

                }

           }
       }
    }
}
