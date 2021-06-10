package com.example.shoppingapp.data

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [ShoppingItems::class],version = 1)
abstract class ShoppingItemDatabase:RoomDatabase() {

abstract fun shoppingItemDao(): ShoppingItemDao

}