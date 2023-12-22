package com.mainer.homework

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity5 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("pe", 0)

        val e1: Button = findViewById(R.id.e1)
        val e2: Button = findViewById(R.id.e2)
        val e3: Button = findViewById(R.id.e3)
        val e4: Button = findViewById(R.id.e4)

        e1.setOnClickListener {
            val intent = Intent(this, MainActivity6::class.java)
            intent.putExtra("pe", numrand)
            startActivity(intent)
        }
        e2.setOnClickListener {
            val intent = Intent(this, MainActivity6::class.java)
            intent.putExtra("pe", numrand)
            startActivity(intent)
        }
        e3.setOnClickListener {
            val intent = Intent(this, MainActivity6::class.java)
            intent.putExtra("pe", numrand+1)
            startActivity(intent)
        }
        e4.setOnClickListener {
            val intent = Intent(this, MainActivity6::class.java)
            intent.putExtra("pe", numrand)
            startActivity(intent)
        }
    }
}