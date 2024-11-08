package com.example.mycity

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mycity.adapter.ItemView
import com.example.mycity.locations.CoffeeShop
import com.example.mycity.locations.Hotel
import com.example.mycity.locations.Restaurant
import com.example.mycity.locations.Shopping
import com.example.mycity.locations.TouristSpots
import com.example.mycity.model.Items

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val title: TextView = findViewById(R.id.screenTitle)
        title.text = "Vatican City Guide"

        val rvAboutMe: RecyclerView = findViewById(R.id.lister)
        rvAboutMe.layoutManager = LinearLayoutManager(this)

        val hot = listOf(
            Items(R.drawable.columbuspic, "Hotels Nearby") {
                val intent = Intent(this, Hotel::class.java)
                startActivity(intent)
            },
        )
        val cof = listOf(
            Items(R.drawable.barleonina, "Coffee Shops Nearby") {
                val intent = Intent(this, CoffeeShop::class.java)
                startActivity(intent)
            },
        )
        val res = listOf(
            Items(R.drawable.arlupic, "Restaurants Nearby") {
                val intent = Intent(this, Restaurant::class.java)
                startActivity(intent)
            },
        )
        val sho = listOf(
            Items(R.drawable.conciliazioneshop, "Shopping Areas Nearby") {
                val intent = Intent(this, Shopping::class.java)
                startActivity(intent)
            },
        )
        val tou = listOf(
            Items(R.drawable.squarepic, "Tourist Spots Nearby") {
                val intent = Intent(this, TouristSpots::class.java)
                startActivity(intent)
            },
        )

        val arrList = hot + cof + res + sho + tou

        rvAboutMe.adapter = ItemView(arrList)
    }
}
