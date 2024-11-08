package com.example.mycity.model

import android.view.View

data class Items(
    val imageResId: Int,
    val name: String,
    val onClickListener: (View) -> Unit
)
