package com.example.mycity.Screens

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mycity.R

class RistoranteArlu : AppCompatActivity() {
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
        title.text = "Ristorante Arlu"
        description.text = "Location: Borgo Pio 135, Rome (near St. Peter’s Square)\n" +
                "Description: A cozy restaurant with traditional Italian dishes, Arlu is popular for its pasta and risottos, offering an authentic Italian dining experience near Vatican City."
        pic.setImageResource(R.drawable.arlupic)
    }
}