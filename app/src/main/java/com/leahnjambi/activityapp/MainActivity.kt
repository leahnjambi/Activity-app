package com.leahnjambi.activityapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Website
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnWebsite: Button
    lateinit var btnCalculator :Button
    lateinit var btnContactList :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCalculator = findViewById(R.id.btnCalculator)
        btnWebsite = findViewById(R.id.btnWebsite)
        btnContactList = findViewById(R.id.btnContactList)

        // Set on ClickListener to all Buttons
        btnCalculator.setOnClickListener {
            var calculate =Intent(this@MainActivity,CalculatorActivity2::class.java)
            startActivity(calculate)

        }
        btnWebsite.setOnClickListener {
            var tembea = Intent(this@MainActivity,WebActivity::class.java)
            startActivity(tembea)

        }
        btnContactList.setOnClickListener {
            var watu =Intent(this@MainActivity,ContactListActivity::class.java)
            startActivity(watu)

        }
    }
}