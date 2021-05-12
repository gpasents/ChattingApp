package com.example.chattingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val registerButton = findViewById<Button>(R.id.registerButton)
        registerButton.setOnClickListener {
            val name = findViewById<TextView>(R.id.editTextTextPersonName2)
            val email = findViewById<TextView>(R.id.registerEmail)
            val password = findViewById<TextView>(R.id.registerPassword)

            Log.d("mainactivity", name.text.toString() + email.text.toString() + password.text.toString())

        }

        val already = findViewById<TextView>(R.id.already)
        already.setOnClickListener {

            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }


    }
}