package com.example.lefishes.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

private const val BASE_URL = "https://www.fishwatch.gov/api/"

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

interface LefisheApiService {
    @GET("species")
    suspend fun getLefishes(): List<Lefishe>
}

object LefisheApi {
    val retrofitService: LefisheApiService by lazy {
        retrofit.create(LefisheApiService::class.java)
    }
}

