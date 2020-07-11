package com.shihlinchen90.bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun bmi(view: View) {
        val weight = ed_weight.text.toString().toFloat()
        val height = ed_height.text.toString().toFloat()
        val bmi = weight / (height * height)
        Log.d("MainActivity", "BMI : $bmi")

        Toast.makeText(this, "Your BMI : $bmi", Toast.LENGTH_LONG).show()

        AlertDialog.Builder(this)
            .setTitle("BMI")
            .setMessage("Your BMI : $bmi")
            .setPositiveButton("OK", null)
            .show()
    }
}