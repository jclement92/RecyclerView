package com.example.recyclerviewdemo.ui.person

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.recyclerviewdemo.data.repository.PersonRepository

class PersonViewModel : ViewModel() {
    private val _personList = MutableLiveData(PersonRepository.getPeople())
    val personList get() = _personList
}