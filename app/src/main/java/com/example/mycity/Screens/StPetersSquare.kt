package com.example.mycity.Screens

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mycity.R

class StPetersSquare : AppCompatActivity() {
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
        title.text = "St. Peter’s Square"
        description.text = "Location: Piazza San Pietro, Vatican City\n" +
                "Description: This large plaza in front of St. Peter's Basilica is where the Pope addresses the public. It features two grand fountains and the Obelisk of Caligula, with seating for large gatherings and papal audiences."
        pic.setImageResource(R.drawable.squarepic)
    }
}