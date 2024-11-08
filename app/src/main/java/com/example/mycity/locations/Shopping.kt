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
import com.example.mycity.Screens.StPetersBasilicaGiftShops
import com.example.mycity.Screens.StPetersSquare
import com.example.mycity.Screens.VaticanGardens
import com.example.mycity.Screens.VaticanMuseums
import com.example.mycity.Screens.VaticanMuseumsGiftShops
import com.example.mycity.Screens.ViadellaConciliazioneShops

class Shopping : AppCompatActivity() {
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
        title.text = "Shops nearby"

        val rvShopping: RecyclerView = findViewById(R.id.lister)
        rvShopping.layoutManager = LinearLayoutManager(this)

        val arrList = listOf(
            Items(R.drawable.museumsgiftshop, "Vatican Museums Gift Shops") {
                val intent = Intent(this, VaticanMuseumsGiftShops::class.java)
                startActivity(intent)
            },
            Items(R.drawable.basilicagiftshops, "St. Peter’s Basilica Gift Shops") {
                val intent = Intent(this, StPetersBasilicaGiftShops::class.java)
                startActivity(intent)
            },
            Items(R.drawable.conciliazioneshop, "Via della Conciliazione Shops") {
                val intent = Intent(this, ViadellaConciliazioneShops::class.java)
                startActivity(intent)
            }
        )

        rvShopping.adapter = ItemView(arrList)
    }
}
