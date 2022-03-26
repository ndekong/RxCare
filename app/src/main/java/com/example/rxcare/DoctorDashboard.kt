package com.example.rxcare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.rxcare.databinding.ActivityDoctorDashboardBinding
import com.example.rxcare.fragments.*

class DoctorDashboard : AppCompatActivity() {
    private lateinit var binding: ActivityDoctorDashboardBinding
//    private lateinit var bottomNavigationView: BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDoctorDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val homeFragment = HomeFragment()
        val appointmentFragment = AppoinmentFragment()
        val trackerFragment = TrackerFragment()
        val chatFragment = ChatFragment()
        val profileFragment = ProfileFragment()

        setCurrentFragment(homeFragment)

        //TODO: you can use binding to access the bottomNavigationView directly without declaring it
        binding.bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> setCurrentFragment(homeFragment)
                R.id.appointment -> setCurrentFragment(appointmentFragment)
                R.id.tracker -> setCurrentFragment(trackerFragment)
                R.id.chat -> setCurrentFragment(chatFragment)
                R.id.profile -> setCurrentFragment(profileFragment)


            }
            true
        }

    }

    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frame, fragment)
            commit()
        }


}

