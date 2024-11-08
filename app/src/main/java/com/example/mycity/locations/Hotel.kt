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
import com.example.mycity.Screens.HotelAtlanteStar
import com.example.mycity.Screens.HotelColumbus
import com.example.mycity.Screens.HoteldellaConciliazione
import com.example.mycity.Screens.SistineChapel
import com.example.mycity.Screens.StPetersSquare
import com.example.mycity.Screens.VaticanGardens
import com.example.mycity.Screens.VaticanMuseums

class Hotel : AppCompatActivity() {
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
        title.text = "Hotels nearby"

        val rvHotels: RecyclerView = findViewById(R.id.lister)
        rvHotels.layoutManager = LinearLayoutManager(this)

        val arrList = listOf(
            Items(R.drawable.starpic, "Hotel Atlante Star") {
                val intent = Intent(this, HotelAtlanteStar::class.java)
                startActivity(intent)
            },
            Items(R.drawable.conciliazionepic, "Hotel della Conciliazione") {
                val intent = Intent(this, HoteldellaConciliazione::class.java)
                startActivity(intent)
            },
            Items(R.drawable.columbuspic, "Hotel Columbus") {
                val intent = Intent(this, HotelColumbus::class.java)
                startActivity(intent)
            }
        )

        rvHotels.adapter = ItemView(arrList)
    }
}
