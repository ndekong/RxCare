package com.example.rxcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rxcare.databinding.ActivityAccountBinding

class Account : AppCompatActivity() {
    private lateinit var binding: ActivityAccountBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAccountBinding.inflate(layoutInflater)
        setContentView(binding.root)




        binding.Doctor.setOnClickListener {
            intent = Intent(this, DoctorRegister::class.java)
            startActivity(intent)
            return@setOnClickListener
        }


        binding.Patient.setOnClickListener {
            intent = Intent(this, PatientRegister::class.java)
            startActivity(intent)
            return@setOnClickListener

        }

    }
}