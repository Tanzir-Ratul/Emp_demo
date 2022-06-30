package com.example.myapplication.repos

import com.example.myapplication.files.NetworkService
import com.example.myapplication.models.Employer

class EmployerRepository {
    suspend fun fetchEmployerGivenData(): Employer {

        val end_url = "interviewtest/interviewJson.json"
        return NetworkService
            .jobSeekerCandidateApi
            .getEmployerGivenData(end_url)
    }
}