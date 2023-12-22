package com.mainer.homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main11)


        val count: TextView = findViewById(R.id.count)
        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("pe", 0)
        count.setText(numrand.toString())


    }
}