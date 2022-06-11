package com.matrix.common

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

abstract class HabitActivityAbs: AppCompatActivity() {
    final override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_habit)

        val flavorTv = findViewById<TextView>(R.id.flavorName)
        flavorTv.apply {
            text = intent.extras?.get(initDataKey) as String
            setOnClickListener {
                startActivity(Intent(this@HabitActivityAbs, RewardActivity::class.java))
            }
        }

        // Just a fun to show custom extensibility
        onCreate(initDataKey, savedInstanceState)
    }

    // function which can be overridden if needed to implement custom logic
    open fun onCreate(initDataKey: String,savedInstanceState: Bundle?) { /* no-op */ }

    // Just for Demonstration Purpose
    abstract val initDataKey: String
}