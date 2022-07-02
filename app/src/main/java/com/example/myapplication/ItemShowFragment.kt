package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentItemShowBinding
import com.example.myapplication.utils.setIcon
import com.example.myapplication.utils.setSalary


class ItemShowFragment : Fragment(){

    val homeFragment = HomeFragment()
    lateinit var binding:FragmentItemShowBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentItemShowBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //binding.salaryRangeTV.text
        val minSalary = arguments?.getString("minsalary")
        val maxsalary = arguments?.getString("maxsalary")
        val logo = arguments?.getString("logo")
         val imageView = binding.imageView
        setIcon(requireContext(),logo,imageView)
        binding.isFeaturedTV.text = arguments?.getBoolean("isFeature").toString()
        binding.lastDateTV.text = arguments?.getString("deadlineDate")
        binding.salaryRangeTV.text= setSalary(minSalary.toString(),maxsalary.toString())
        binding.profileTV.text= arguments?.getString("profile")


         object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {

                val transection = requireActivity().supportFragmentManager.beginTransaction()
                transection.replace(R.id.fragmentContainerView2,homeFragment).addToBackStack(null).commit()
            }

        }

    }

}

