package com.bignerdranch.android.buttons

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

  private  lateinit var myText: TextView
  private lateinit var firstButton: Button
  private lateinit var secondButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG,"onCreate() called")

        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }




        //initialize by referencing their id
        myText = findViewById(R.id.first_view)
        firstButton = findViewById(R.id.button_first)
        secondButton = findViewById(R.id.button_second)


        myText.setTextColor(Color.BLUE)
        myText.textSize = 25F

        myText.setOnClickListener {
            myText.setTextColor(Color.BLACK)
        }

        //Now I am going to make use of two buttons to make the myText visible and non visible on clicking them

        firstButton.setOnClickListener {
            myText.isVisible = false
        }

        secondButton.setOnClickListener {
            myText.isVisible = true
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy() called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart() called")
    }
//First

}