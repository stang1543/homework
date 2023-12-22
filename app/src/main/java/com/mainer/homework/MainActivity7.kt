package com.mainer.homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("pe", 0)

        val w1: Button = findViewById(R.id.w1)
        val w2: Button = findViewById(R.id.w2)
        val w3: Button = findViewById(R.id.w3)
        val w4: Button = findViewById(R.id.w4)

        w1.setOnClickListener {
            val intent = Intent(this, MainActivity8::class.java)
            intent.putExtra("pe", numrand)
            startActivity(intent)
        }
        w2.setOnClickListener {
            val intent = Intent(this, MainActivity8::class.java)
            intent.putExtra("pe", numrand )
            startActivity(intent)
        }
        w3.setOnClickListener {
            val intent = Intent(this, MainActivity8::class.java)
            intent.putExtra("pe", numrand)
            startActivity(intent)
        }
        w4.setOnClickListener {
            val intent = Intent(this, MainActivity8::class.java)
            intent.putExtra("pe", numrand+1)
            startActivity(intent)
        }
    }
}