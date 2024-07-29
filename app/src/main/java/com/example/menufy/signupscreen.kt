package com.example.menufy

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.menufy.databinding.ActivityLoginScreenBinding
import com.example.menufy.databinding.ActivitySignupscreenBinding

class signupscreen : AppCompatActivity() {
    private lateinit var binding: ActivitySignupscreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupscreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.accountbutton.setOnClickListener {
            val intent = Intent(
                this,
                LoginScreen::class.java
            ) // Ensure the class name starts with a capital letter
            startActivity(intent)
        }
        binding.button6.setOnClickListener {
            val intent = Intent(
                this,
                LoginScreen::class.java
            ) // Ensure the class name starts with a capital letter
            startActivity(intent)
        }
    }
}
