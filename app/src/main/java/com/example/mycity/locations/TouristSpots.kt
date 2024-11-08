package com.example.mycity.locations

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mycity.model.Items
import com.example.mycity.adapter.ItemView
import com.example.mycity.R
import com.example.mycity.Screens.Basilica
import com.example.mycity.Screens.SistineChapel
import com.example.mycity.Screens.StPetersSquare
import com.example.mycity.Screens.VaticanGardens
import com.example.mycity.Screens.VaticanMuseums

class TouristSpots : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val title: TextView = findViewById(R.id.screenTitle)
        title.text = "Tourist Spots"

        val rvTour: RecyclerView = findViewById(R.id.lister)
        rvTour.layoutManager = LinearLayoutManager(this)

        val arrList = listOf(
            Items(R.drawable.basilicapic, "St. Peter's Basilica") {
                val intent = Intent(this, Basilica::class.java)
                startActivity(intent)
            },
            Items(R.drawable.sistine, "Sistine Chapel") {
                val intent = Intent(this, SistineChapel::class.java)
                startActivity(intent)
            },
            Items(R.drawable.vatmuseums, "Vatican Museums") {
                val intent = Intent(this, VaticanMuseums::class.java)
                startActivity(intent)
            },
            Items(R.drawable.squarepic, "St. Peter's Square") {
                val intent = Intent(this, StPetersSquare::class.java)
                startActivity(intent)
            },
            Items(R.drawable.gardenspic, "Vatican Gardens") {
                val intent = Intent(this, VaticanGardens::class.java)
                startActivity(intent)
            }
        )

        rvTour.adapter = ItemView(arrList)
    }
}
