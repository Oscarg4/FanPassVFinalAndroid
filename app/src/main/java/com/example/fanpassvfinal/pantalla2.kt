package com.example.fanpassvfinal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class pantalla2 : AppCompatActivity() {
    var firstFragment = FirstFragment()
    var secondFragment = SecondFragment()
    var thirdFragment = ThirdFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla2)
        val navigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        loadFragment(firstFragment)
    }

    private val mOnNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.firstFragment -> {
                    loadFragment(firstFragment)
                    return@OnNavigationItemSelectedListener true
                }

                R.id.secondFragment -> {
                    loadFragment(secondFragment)
                    return@OnNavigationItemSelectedListener true
                }

                R.id.thirdFragment -> {
                    loadFragment(thirdFragment)
                    return@OnNavigationItemSelectedListener true
                }


            }
            false
        }

    fun loadFragment(fragment: Fragment?) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame_container, fragment!!)
        transaction.commit()
    }
}