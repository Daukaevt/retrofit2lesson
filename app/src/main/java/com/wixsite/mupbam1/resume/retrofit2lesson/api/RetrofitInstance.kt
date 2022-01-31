package com.wixsite.mupbam1.resume.retrofit2lesson.api

import com.wixsite.mupbam1.resume.retrofit2lesson.util.Constans.Companion.BASE_URL
import retrofit2.Retrofit

import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitInstance {
   private val retrofit by lazy {
       Retrofit.Builder()
           .baseUrl(BASE_URL)
           .addConverterFactory(GsonConverterFactory.create())
           .build()
   }
    val api:SimpleApi by lazy {
        retrofit.create(SimpleApi::class.java)
    }
}