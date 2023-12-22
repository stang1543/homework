package com.mainer.homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("pe", 0)

        val d1: Button = findViewById(R.id.d1)
        val d2: Button = findViewById(R.id.d2)
        val d3: Button = findViewById(R.id.d3)
        val d4: Button = findViewById(R.id.d4)

        d1.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            intent.putExtra("pe", numrand)
            startActivity(intent)
        }
        d2.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            intent.putExtra("pe", numrand+1)
            startActivity(intent)
        }
        d3.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            intent.putExtra("pe", numrand)
            startActivity(intent)
        }
        d4.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            intent.putExtra("pe", numrand)
            startActivity(intent)
        }
    }
}