package com.wixsite.mupbam1.resume.retrofit2lesson.repository

import com.wixsite.mupbam1.resume.retrofit2lesson.api.RetrofitInstance
import com.wixsite.mupbam1.resume.retrofit2lesson.model.Post
import retrofit2.Response

class Repository {
    suspend fun getPost():Response<Post>{
        return RetrofitInstance.api.getPost()
    }
}