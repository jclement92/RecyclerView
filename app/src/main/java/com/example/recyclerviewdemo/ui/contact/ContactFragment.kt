package com.example.recyclerviewdemo.ui.contact

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewdemo.databinding.MainFragmentBinding

class ContactFragment : Fragment() {
    private lateinit var binding: MainFragmentBinding
    private lateinit var viewModel: ContactViewModel
    private lateinit var contactAdapter: ContactAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = MainFragmentBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this).get(ContactViewModel::class.java)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        with(binding.rvContacts) {
            setHasFixedSize(true)

            val dividerItemDecoration = DividerItemDecoration(
                context,
                DividerItemDecoration.VERTICAL
            )
            addItemDecoration(dividerItemDecoration)
        }

        viewModel.contactList.observe(viewLifecycleOwner, {
            contactAdapter = ContactAdapter(it)

            binding.rvContacts.layoutManager = LinearLayoutManager(context)
            binding.rvContacts.adapter = contactAdapter
        })

    }

}