package com.example.testapp.network

import com.example.shoppingapp.Data.ShoppingItems
import com.example.testapp.other.constant.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface PixabayApi {
    @GET("api/")
    suspend fun getAllImages(
        @Query("q")QueryImage:String,
        @Query("key")ApiKey:String = API_KEY
    ):Response<ShoppingItems>
}