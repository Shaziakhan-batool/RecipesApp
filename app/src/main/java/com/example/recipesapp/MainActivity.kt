package com.example.recipesapp

import android.content.Intent
import android.os.Bundle
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import kotlin.jvm.java

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        android.os.Handler(Looper.getMainLooper())
            .postDelayed({
                startActivity(Intent(this, HomeActivity::class.java))
                finish()
            }, 2000)
    }
}