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
import com.example.mycity.Screens.BarLeonina
import com.example.mycity.Screens.Basilica
import com.example.mycity.Screens.CaffeSanPietro
import com.example.mycity.Screens.SistineChapel
import com.example.mycity.Screens.StPetersSquare
import com.example.mycity.Screens.VaticanCoffeeBar
import com.example.mycity.Screens.VaticanGardens
import com.example.mycity.Screens.VaticanMuseums

class CoffeeShop : AppCompatActivity() {
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
        title.text = "Coffee Shops nearby"

        val rvCoffee: RecyclerView = findViewById(R.id.lister)
        rvCoffee.layoutManager = LinearLayoutManager(this)

        val arrList = listOf(
            Items(R.drawable.bar, "Vatican Coffee Bar") {
                val intent = Intent(this, VaticanCoffeeBar::class.java)
                startActivity(intent)
            },
            Items(R.drawable.pietropic, "Caffè San Pietro") {
                val intent = Intent(this, CaffeSanPietro::class.java)
                startActivity(intent)
            },
            Items(R.drawable.barleonina, "Bar Leonina") {
                val intent = Intent(this, BarLeonina::class.java)
                startActivity(intent)
            }
        )

        rvCoffee.adapter = ItemView(arrList)
    }
}
