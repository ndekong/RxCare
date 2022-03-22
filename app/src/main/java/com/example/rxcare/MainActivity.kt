package com.example.rxcare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.rxcare.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    val homeFragment=HomeFragment()
    val appointmentFragment=AppoinmentFragment()
    val trackerFragment=TrackerFragment()
    val chatFragment=ChatFragment()
    val profileFragment=ProfileFragment()

    setCurrentFragment(homeFragment)

    bottomNavigationView.setOnItemSelectedListener {
        when(it.itemId){
            R.id.dashboardFragment->setCurrentFragment(homeFragment)
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