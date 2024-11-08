package com.example.mycity.Screens

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mycity.R

class VaticanCoffeeBar : AppCompatActivity() {
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
        title.text = "Vatican Coffee Bar"
        description.text = "Location: Inside Vatican Museums\n" +
                "Description: A small coffee bar within the museums where visitors can grab espresso, cappuccinos, and pastries during their visit."
        pic.setImageResource(R.drawable.bar)
    }
}