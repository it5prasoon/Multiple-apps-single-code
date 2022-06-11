package com.matrix.multiple

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.click_me).apply {
            setOnClickListener {
                val intent = Intent(this@MainActivity, HabitActivity::class.java).apply {
                    putExtra("DATA", Feature.getDat())
                }
                startActivity(intent)
            }
        }

    }
}