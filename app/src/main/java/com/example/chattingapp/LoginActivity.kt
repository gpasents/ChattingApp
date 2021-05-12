package com.example.chattingapp

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginButton = findViewById<Button>(R.id.loginButton)
        loginButton.setOnClickListener {
            val login_email = findViewById<TextView>(R.id.loginEmail)
            val login_password = findViewById<TextView>(R.id.loginPassword)

            Log.d("loginactivity", login_email.text.toString() + login_password.text.toString())
        }
    }
}