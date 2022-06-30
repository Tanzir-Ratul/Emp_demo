package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.adapters.EmployerAdapter
import com.example.myapplication.databinding.FragmentHomeBinding
import com.example.myapplication.viewmodel.EmployerViewModel

class HomeFragment : Fragment() {

    lateinit var communicatorInterface: CommunicatorInterface
    lateinit var binding: FragmentHomeBinding
    val viewModel: EmployerViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        communicatorInterface = activity as CommunicatorInterface
        val employerAdapter = EmployerAdapter { it, view ->
//            if (it.isFeatured == true)
//            view.setBackgroundColor(Color.parseColor("#D1C4E9"))
            communicatorInterface.dataPass(it)


        }
        binding.empRV.layoutManager =
            LinearLayoutManager(requireActivity())
        binding.empRV.adapter = employerAdapter

        viewModel.employerLiveData.observe(viewLifecycleOwner) {
            Log.d("data", "${it.data.size}")
            employerAdapter.submitList(it.data)
        }

        Log.d("test", "${viewModel.fetchData()}")

        return binding.root
    }


}