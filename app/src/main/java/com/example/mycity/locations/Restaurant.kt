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
import com.example.mycity.Screens.CaffeVaticano
import com.example.mycity.Screens.RistoranteArlu
import com.example.mycity.Screens.RistoranteLaVeranda
import com.example.mycity.Screens.SistineChapel
import com.example.mycity.Screens.StPetersSquare
import com.example.mycity.Screens.TrattoriaVaticanoGiggi
import com.example.mycity.Screens.VaticanGardens
import com.example.mycity.Screens.VaticanMuseums

class Restaurant : AppCompatActivity() {
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
        title.text = "Restaurants nearby"

        val rvRestaurant: RecyclerView = findViewById(R.id.lister)
        rvRestaurant.layoutManager = LinearLayoutManager(this)

        val arrList = listOf(
            Items(R.drawable.verandapic, "Ristorante La Veranda") {
                val intent = Intent(this, RistoranteLaVeranda::class.java)
                startActivity(intent)
            },
            Items(R.drawable.vaticanopic, "Caffè Vaticano") {
                val intent = Intent(this, CaffeVaticano::class.java)
                startActivity(intent)
            },
            Items(R.drawable.arlupic, "Ristorante Arlu") {
                val intent = Intent(this, RistoranteArlu::class.java)
                startActivity(intent)
            },
            Items(R.drawable.giggipic, "Trattoria Vaticano Giggi") {
                val intent = Intent(this, TrattoriaVaticanoGiggi::class.java)
                startActivity(intent)
            }
        )

        rvRestaurant.adapter = ItemView(arrList)
    }
}
