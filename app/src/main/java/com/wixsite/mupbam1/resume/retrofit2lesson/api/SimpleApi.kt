package com.wixsite.mupbam1.resume.retrofit2lesson.api

import com.wixsite.mupbam1.resume.retrofit2lesson.model.Post
import retrofit.http.GET
import retrofit2.Response

interface SimpleApi {
    @retrofit2.http.GET("posts/1")

    suspend fun getPost():Response<Post>
}