package com.example.recyclerviewdemo.ui.person

import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import com.example.recyclerviewdemo.R
import com.example.recyclerviewdemo.databinding.ListItemBinding
import com.example.recyclerviewdemo.data.model.Person

class PersonAdapter(private val people: List<Person>) :
    RecyclerView.Adapter<PersonAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val person = people[position]

        with(holder.binding) {
            tvName.text = person.name
        }
    }

    override fun getItemCount() = people.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val binding = ListItemBinding.bind(itemView)
    }
}