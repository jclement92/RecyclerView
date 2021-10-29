package com.example.recyclerviewdemo.ui.person

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewdemo.databinding.PersonFragmentBinding

class PersonFragment : Fragment() {
    private lateinit var binding: PersonFragmentBinding
    private val viewModel: PersonViewModel by viewModels()
    private lateinit var personAdapter: PersonAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = PersonFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        with(binding.rvPeople) {
            setHasFixedSize(true)

            val dividerItemDecoration = DividerItemDecoration(
                context,
                DividerItemDecoration.VERTICAL
            )
            addItemDecoration(dividerItemDecoration)
        }

        viewModel.personList.observe(viewLifecycleOwner, {
            personAdapter = PersonAdapter(it)

            binding.rvPeople.layoutManager = LinearLayoutManager(context)
            binding.rvPeople.adapter = personAdapter
        })

    }

}