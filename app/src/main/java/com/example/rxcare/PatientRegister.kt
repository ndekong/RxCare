package com.example.rxcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.rxcare.databinding.ActivityPatientRegisterBinding

class PatientRegister : AppCompatActivity() {
    private lateinit var binding: ActivityPatientRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPatientRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.male.setOnClickListener {
            if (binding.male.isChecked) {
                Toast.makeText(this, "Male selected", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Select your Gender", Toast.LENGTH_SHORT).show()

            }
        }

        binding.Female.setOnClickListener {
            if (binding.Female.isChecked) {
                Toast.makeText(this, "Female selected", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Select your Gender", Toast.LENGTH_SHORT).show()

            }
        }


        binding.SignUp.setOnClickListener {
            if (binding.EnterEmail.text.isEmpty() &&
                binding.EnterPassword.text.isEmpty()
            ) {
                Toast.makeText(this, "Input Required Fields", Toast.LENGTH_SHORT).show()
            } else {
                if (binding.EnterEmail.text.contentEquals("aniekong007@gmail.com") &&
                    binding.EnterPassword.text.contentEquals("ghost")
                ) {
                    val intent = Intent(this, PatientLogin::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Invalid Email or Password", Toast.LENGTH_SHORT)
                        .show()
                }
            }


        }























    }
}