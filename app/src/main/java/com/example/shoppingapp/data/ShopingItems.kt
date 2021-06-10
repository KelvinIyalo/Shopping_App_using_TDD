package com.example.shoppingapp.data


import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shoppingItem_table")
data class ShoppingItems(
    var name: String,
    var amount: Int,
    var price: Float,
    var largeImageURL: String?,
    @PrimaryKey(autoGenerate = true)
    var id:Int? = null


)