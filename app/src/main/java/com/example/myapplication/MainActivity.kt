package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.models.Employer

class MainActivity : AppCompatActivity(), CommunicatorInterface {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val homeFragment = HomeFragment()
        // supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView2,homeFragment).commit()
    }

    override fun dataPass(item: Employer.Data) {

        val bundle = Bundle().apply {
            putString("deadlineDate", item.deadline)
            putString("minsalary", item.minSalary)
            putString("maxsalary", item.maxSalary)
            putBoolean("isFeature", item.isFeatured)
            putString("logo", item.logo)
            putString("profile", item.recruitingCompanysProfile)
        }
        val transection = this.supportFragmentManager.beginTransaction()
        val itemShowFragment = ItemShowFragment()
        itemShowFragment.arguments = bundle
        transection.replace(R.id.fragmentContainerView2, itemShowFragment).commit()
    }

}
