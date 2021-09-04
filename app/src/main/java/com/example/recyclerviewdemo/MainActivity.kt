package com.example.recyclerviewdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewdemo.model.Contact

class MainActivity : AppCompatActivity() {
    private lateinit var rvContacts: RecyclerView
    private lateinit var contactAdapter: ContactAdapter
    private lateinit var contacts: MutableList<Contact>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvContacts = findViewById(R.id.rvContacts)

        contacts = arrayListOf(
            Contact("Bob"),
            Contact("John"),
            Contact("Sarah")
        )

        contactAdapter = ContactAdapter(contacts)

        with(rvContacts) {
            setHasFixedSize(true)

            val dividerItemDecoration = DividerItemDecoration(
                context,
                DividerItemDecoration.VERTICAL
            )
            addItemDecoration(dividerItemDecoration)

            layoutManager = LinearLayoutManager(context)
            adapter = contactAdapter
        }

    }
}