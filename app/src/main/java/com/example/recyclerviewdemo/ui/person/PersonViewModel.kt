package com.example.recyclerviewdemo.ui.person

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.recyclerviewdemo.data.repository.PersonRepository
import com.example.recyclerviewdemo.data.model.Person

class PersonViewModel : ViewModel() {
    private val _personList = MutableLiveData<List<Person>>()
    val personList get() = _personList

    init {
        _personList.value = PersonRepository.getPeople()
    }
}