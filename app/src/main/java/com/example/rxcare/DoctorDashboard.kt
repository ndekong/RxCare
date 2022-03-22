package com.example.rxcare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.rxcare.databinding.ActivityDoctorDashboardBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class DoctorDashboard : AppCompatActivity() {
    private lateinit var binding:ActivityDoctorDashboardBinding
    private lateinit var bottomNavigationView: BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDoctorDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)





        val dashboardFragment=HomeFragment()
        val appointmentFragment=AppoinmentFragment()
        val trackerFragment=TrackerFragment()
        val chatFragment=ChatFragment()
        val profileFragment=ProfileFragment()

        setCurrentFragment(dashboardFragment)

        bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.dashboardFragment->setCurrentFragment(dashboardFragment)
                R.id.appoinmentFragment->setCurrentFragment(appointmentFragment)
                R.id.trackerFragment->setCurrentFragment(trackerFragment)
                R.id.chatFragment->setCurrentFragment(chatFragment)
                R.id.profileFragment->setCurrentFragment(profileFragment)




            }
            true
        }

    }

    private fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.nav_fragment,fragment)
            commit()
        }






}

