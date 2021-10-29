package com.example.recyclerviewdemo.data.repository

import com.example.recyclerviewdemo.data.model.Person

object PersonRepository {

    fun getPeople() = listOf(
        Person("Bob"),
        Person("John"),
        Person("Sarah")
    )

}