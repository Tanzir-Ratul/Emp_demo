package com.example.myapplication

import com.example.myapplication.models.Employer

interface CommunicatorInterface {

    fun dataPass(item: Employer.Data)
}

interface IOnBackPressed {
    fun onBackPressed(): Boolean
}