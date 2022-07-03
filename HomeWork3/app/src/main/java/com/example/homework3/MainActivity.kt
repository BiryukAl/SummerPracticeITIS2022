package com.example.homework3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ColorStateListInflaterCompat.inflate
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.homework3.databinding.ActivityMainBinding.inflate
import com.example.homework3.databinding.MainFragmentBinding
import com.example.homework3.databinding.MainFragmentBinding.inflate

class MainActivity : AppCompatActivity() {

    lateinit var controller: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        controller = (supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment)
            .navController

    }
}