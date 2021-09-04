package com.example.recyclerviewdemo.ui.person

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.recyclerviewdemo.data.repository.PersonRepository
import com.example.recyclerviewdemo.data.model.Person

class PersonViewModel : ViewModel() {
    val personList = MutableLiveData<List<Person>>()

    init {
        personList.value = PersonRepository.getPeople()
    }
}