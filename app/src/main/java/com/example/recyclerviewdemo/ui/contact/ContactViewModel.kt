package com.example.recyclerviewdemo.ui.contact

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.recyclerviewdemo.data.repository.ContactRepository
import com.example.recyclerviewdemo.data.model.Contact

class ContactViewModel : ViewModel() {
    val contactList = MutableLiveData<List<Contact>>()

    init {
        contactList.value = ContactRepository.getContacts()
    }
}