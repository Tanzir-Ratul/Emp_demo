package com.example.myapplication.files

import com.example.myapplication.models.Employer
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Url

//const val jobSeeker_api_key = ""
const val logoUrl = "https://corporate.bdjobs.com/logos/15131.jpg"

const val base_url = "https://corporate3.bdjobs.com/"
val retrofit = Retrofit.Builder()
    .baseUrl(base_url)
    .addConverterFactory(GsonConverterFactory.create())
    .build()


interface JobSeekerCandidateApi {
    @GET
    suspend fun getEmployerGivenData(@Url url:String): Employer
}

object NetworkService {
    val jobSeekerCandidateApi : JobSeekerCandidateApi by lazy {
        retrofit.create(JobSeekerCandidateApi::class.java)
    }

}
