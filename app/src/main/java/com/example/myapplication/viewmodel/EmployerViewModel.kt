package com.example.myapplication.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.models.Employer
import com.example.myapplication.repos.EmployerRepository
import kotlinx.coroutines.launch

class EmployerViewModel : ViewModel() {

    val repository = EmployerRepository()

    val employerLiveData : MutableLiveData<Employer>  = MutableLiveData()
    fun fetchData() {
       // Log.d("logd","IN")
        viewModelScope.launch {
            try {
                employerLiveData.value =
                repository.fetchEmployerGivenData()
                Log.d("viewModel", repository.fetchEmployerGivenData().toString())
            } catch (e: Exception) {

                Log.d("viewModel", e.localizedMessage)
            }

        }
    }
}