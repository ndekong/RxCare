package com.example.rxcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class onBoarding : AppCompatActivity() {

    private val onBoardingtimeOut: Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, Account::class.java))
            finish()
        },
            onBoardingtimeOut)


    }
}