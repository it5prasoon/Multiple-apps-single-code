package com.matrix.multiple

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.matrix.emotions.Feature
import com.matrix.emotions.HabitActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.click_me).apply {
            setOnClickListener {
                val intent = Intent(this@MainActivity, HabitActivity::class.java).apply {
                    putExtra(Feature.getDat(), "Hello there")
                }
                startActivity(intent)
            }
        }

    }
}