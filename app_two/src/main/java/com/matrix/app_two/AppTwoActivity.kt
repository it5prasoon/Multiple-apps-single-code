package com.matrix.app_two

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.navigation.fragment.NavHostFragment

class AppTwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_two)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragment_container_view) as NavHostFragment
        val navController = navHostFragment.navController

        Handler(Looper.getMainLooper()).postDelayed({
            navController.navigate(R.id.action_splashFragment2_to_homeFragment)
        }, 3000)
    }
}