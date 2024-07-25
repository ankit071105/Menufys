package com.example.menufy

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class Slash_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slash_screen)

        Handler(Looper.getMainLooper()).postDelayed(
            {
                val intent = Intent(this, startscreen::class.java)
                startActivity(intent)
                finish()
            }, 5000
        )
    }
}
