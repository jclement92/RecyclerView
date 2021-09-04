package com.example.recyclerviewdemo.data.repository

import com.example.recyclerviewdemo.data.model.Contact

object ContactRepository {

    fun getContacts() = mutableListOf(
        Contact("Bob"),
        Contact("John"),
        Contact("Sarah")
    )

}