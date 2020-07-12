package com.shihlinchen90.bmi

import android.content.DialogInterface
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

        b_help.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Help")
                .setMessage("Body mass index (BMI) is a value derived from the mass (weight) and height of a person.")
                .setPositiveButton("OK", null)
                .show()
        }
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
            .setPositiveButton("OK") { dialog, which ->
                ed_weight.setText("")
                ed_height.setText("")
            }
            .show()
    }
}