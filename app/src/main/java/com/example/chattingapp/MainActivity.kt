package com.example.chattingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val registerButton = findViewById<Button>(R.id.registerButton)
        registerButton.setOnClickListener {
            val name = findViewById<TextView>(R.id.editTextTextPersonName2)
            val email = findViewById<TextView>(R.id.registerEmail)
            val password = findViewById<TextView>(R.id.registerPassword)

            FirebaseAuth.getInstance().createUserWithEmailAndPassword(email.text.toString(),password.text.toString())
                .addOnCompleteListener {
                    if (!it.isSuccessful) return@addOnCompleteListener

                    Log.d("main","SUccessfuly created user with id"+ it.result?.user?.uid.toString())
                    Toast.makeText(this, "SUccessfuly created user with id"+ it.result?.user?.uid.toString(),Toast.LENGTH_SHORT).show()
                }
                .addOnFailureListener {
                    Toast.makeText(this, "failed to create usr with error: " + it.message.toString(),Toast.LENGTH_SHORT).show()
                    Log.d("main", "failed to create usr with error: " + it.message.toString())
                }

        }

        val already = findViewById<TextView>(R.id.already)
        already.setOnClickListener {

            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }


    }



}