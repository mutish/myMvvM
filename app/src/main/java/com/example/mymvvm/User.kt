package com.example.mymvvm

data class User(
    val name: String,
    val username: String,
    val email: String,
    val address: Address
    )

data class Address(
    val street: String,
    val suite: String,
    val city: String,
    val zipcode: String,
    val geo: Geo
)

data class Geo(
    val lat: String,
    val lng: String
)
