package com.example.myapplication.adapters

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.example.myapplication.models.Employer
import com.example.myapplication.utils.getFormattedDate

@BindingAdapter("app:setDate")
fun setDateTime(textView: TextView, dt: String) {
    textView.text =
        getFormattedDate(dt, "dd MMM, yyyy")

}

@BindingAdapter("app:setSalary")
fun setSalary(textView: TextView, item: Employer.Data) {
    var temp: String
    if (!item.minSalary.isEmpty() && item.maxSalary.isEmpty())
        temp = "Min.Salary: ${item.minSalary}tk."
    else if(item.minSalary.isEmpty() && !item.maxSalary.isEmpty())
        temp = "Max.Salary: ${item.maxSalary}tk."
    else if(!item.minSalary.isEmpty() && !item.maxSalary.isEmpty())
        temp = "Salary : ${item.minSalary}tk to ${item.maxSalary}tk"
    else temp="Salary: Negotiable"
    textView.text = temp
}

@BindingAdapter("app:setLogo")
fun setIcon(imageView: ImageView, icon: String?) {
    icon?.let {
        val url = icon
        Glide
            .with(imageView.context)
            .load(url)
            .into(imageView)
    }
}
