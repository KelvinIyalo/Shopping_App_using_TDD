package com.example.shoppingapp.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ShoppingItemDao {

        @Insert(onConflict = OnConflictStrategy.REPLACE)
        suspend fun insertImage(shoppingItems: ShoppingItems)

        @Delete
        suspend fun Delete(shoppingItems: ShoppingItems)

        @Query("SELECT * FROM shoppingItem_table")
        fun getAllShoppingItems(): LiveData<List<ShoppingItems>>

        @Query("Select SUM(price * amount) From shoppingItem_table")
        fun sumOfAllItems(): LiveData<Float>

    }
