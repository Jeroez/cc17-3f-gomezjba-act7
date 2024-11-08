package com.example.mycity.Screens

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mycity.R

class SistineChapel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.redes)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val title: TextView = findViewById(R.id.tit)
        val description: TextView = findViewById(R.id.desc)
        val pic: ImageView = findViewById(R.id.imge)
        title.text = "Sistine Chapel"
        description.text = "Location: Vatican Museums, Vatican City\n" +
                "Description: Famous for Michelangelo’s frescoes on the ceiling and the Last Judgment on the altar wall. The chapel is a must-see and serves as the papal conclave’s meeting place when electing a new pope."
        pic.setImageResource(R.drawable.sistine)
    }
}