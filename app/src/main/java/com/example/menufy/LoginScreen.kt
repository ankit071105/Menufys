package com.example.menufy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.menufy.databinding.ActivityLoginScreenBinding


class LoginScreen : AppCompatActivity() {
    private lateinit var binding: ActivityLoginScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginbutton.setOnClickListener {
            val intent = Intent(this, locationscreen::class.java) // Ensure the class name starts with a capital letter
            startActivity(intent)
        }

        binding.textsbutton.setOnClickListener {
            val intent = Intent(this, signupscreen::class.java) // Ensure the class name starts with a capital letter
            startActivity(intent)
        }
    }
}
