package com.example.register_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class film4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_film4)

        val backbtn = findViewById<TextView>(R.id.backbtn)
        backbtn.setOnClickListener {
            val back = Intent(this, ProfileActivity::class.java)
            startActivity(back)
            finish()
        }
    }
}