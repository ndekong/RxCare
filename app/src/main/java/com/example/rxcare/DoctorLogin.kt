package com.example.rxcare

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.rxcare.databinding.ActivityDoctorLoginBinding

class DoctorLogin : AppCompatActivity() {
    private lateinit var binding: ActivityDoctorLoginBinding
    private lateinit var sharedPreferences: SharedPreferences


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDoctorLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.rememberme.setOnClickListener {
            if (binding.rememberme.isChecked) {
                Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "", Toast.LENGTH_SHORT).show()

            }
        }



        binding.Login.setOnClickListener{
        if (binding.EnterEmail.text.isEmpty() &&
            binding.EnterPassword.text.isEmpty()
        ) {
            Toast.makeText(this, "Input Required Fields", Toast.LENGTH_SHORT).show()
        } else {
            if (binding.EnterEmail.text.contentEquals("aniekong007@gmail.com") &&
                binding.EnterPassword.text.contentEquals("ghost")
            ) {
                val intent = Intent(this, DoctorDashboard::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Invalid Email or Password", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
}
}