package com.example.shoppingapp.Data


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "shoppingItem_table")
data class ShoppingItems(
    var name: String,
    var amount: Int,
    var price: Float,
    var largeImageURL: String?,
    @PrimaryKey(autoGenerate = true)
    var id:Int? = null


)