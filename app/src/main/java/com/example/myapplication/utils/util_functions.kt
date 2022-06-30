package com.example.myapplication.utils

import android.content.Context
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.myapplication.models.Employer
import java.text.SimpleDateFormat
import java.util.*


fun getFormattedDate(dt: String, pattern: String): String {
    return SimpleDateFormat(pattern).format(Date())
}

fun setSalary(minSalary:String,maxsalary:String):String {
    var temp: String
    if (!minSalary.isEmpty() && maxsalary.isEmpty())
        temp = " Minimum : ${minSalary}tk"
    else if(minSalary.isEmpty() && !maxsalary.isEmpty())
        temp = " Maximum: ${maxsalary}tk"
    else if(!minSalary.isEmpty() && !maxsalary.isEmpty())
        temp = "${minSalary}tk to ${maxsalary}tk"
    else temp="Negotiable"
    return temp
}

fun setIcon(context: Context, icon: String?,imageView:ImageView) {

    icon?.let {
        val url = icon
        Glide
            .with(context)
            .load(url)
            .into(imageView)
    }
}