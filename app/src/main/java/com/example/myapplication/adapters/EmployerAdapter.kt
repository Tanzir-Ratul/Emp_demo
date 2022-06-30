package com.example.myapplication.adapters

import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.EmployerItemRowBinding
import com.example.myapplication.models.Employer

class EmployerAdapter(val callback: (Employer.Data, View) -> Unit):
    ListAdapter<Employer.Data, EmployerAdapter.EmployerViewHolder>(EmployerDiffUtil()) {


    class EmployerViewHolder(val binding: EmployerItemRowBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Employer.Data) {
           if(item.isFeatured) {
               itemView.setBackgroundColor(Color.parseColor("#FFFDE7"))
               binding.item = item
               binding.flagIV.visibility = View.VISIBLE
           }
            else
                binding.item=item
        }
    }

    class EmployerDiffUtil : DiffUtil.ItemCallback<Employer.Data>() {

        override fun areItemsTheSame(oldItem: Employer.Data, newItem: Employer.Data): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Employer.Data, newItem: Employer.Data): Boolean {
            return oldItem == newItem
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployerViewHolder {
        val binding = EmployerItemRowBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return EmployerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: EmployerViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
       holder.itemView.setOnClickListener {
           callback(item,it)
       }
       // callback(item)
        //Log.d("bind","${item}")
    }


}

