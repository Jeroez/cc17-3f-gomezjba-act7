package com.example.mycity.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mycity.model.Items
import com.example.mycity.R

class ItemView(
    private val data: List<Items>
) : RecyclerView.Adapter<ItemView.ItemViewHolder>() {

    class ItemViewHolder(val row: View) : RecyclerView.ViewHolder(row) {
        val itemViewImg: ImageView = row.findViewById(R.id.ItemViewImg)
        val itemViewName: TextView = row.findViewById(R.id.ItemViewName)
        val itemViewButton: View = row.findViewById(R.id.itemViewButton)
        //val screenTitle: TextView = row.findViewById(R.id.screenTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val layout = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_item_view, parent, false)
        return ItemViewHolder(layout)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = data[position]
        holder.itemViewImg.setImageResource(item.imageResId)
        holder.itemViewName.text = item.name
        holder.itemViewButton.setOnClickListener(item.onClickListener)
        //holder.screenTitle.text = item.name
    }
}
