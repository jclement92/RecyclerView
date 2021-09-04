package com.example.recyclerviewdemo

import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import com.example.recyclerviewdemo.model.Contact

class ContactAdapter(private val contacts: List<Contact>) :
    RecyclerView.Adapter<ContactAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contact = contacts[position]

        with(holder) {
            tvContact.text = contact.text
        }
    }

    override fun getItemCount() = contacts.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvContact: TextView = view.findViewById(R.id.tvContact)
    }
}