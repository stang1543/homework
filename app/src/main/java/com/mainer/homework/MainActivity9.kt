package com.mainer.homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main9)
        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("pe", 0)

        val y1: Button = findViewById(R.id.y1)
        val y2: Button = findViewById(R.id.y2)
        val y3: Button = findViewById(R.id.y3)
        val y4: Button = findViewById(R.id.y4)

        y1.setOnClickListener {
            val intent = Intent(this, MainActivity10::class.java)
            intent.putExtra("pe", numrand)
            startActivity(intent)
        }
        y2.setOnClickListener {
            val intent = Intent(this, MainActivity10::class.java)
            intent.putExtra("pe", numrand+1)
            startActivity(intent)
        }
        y3.setOnClickListener {
            val intent = Intent(this, MainActivity10::class.java)
            intent.putExtra("pe", numrand)
            startActivity(intent)
        }
        y4.setOnClickListener {
            val intent = Intent(this, MainActivity10::class.java)
            intent.putExtra("pe", numrand)
            startActivity(intent)
        }
    }
}