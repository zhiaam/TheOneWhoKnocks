package com.example.whites.network

import com.squareup.moshi.Json

data class White (
    @Json(name = "occupation")
    val occupation: List<String>,

    @Json(name = "name")
    val name: String? = "No Data",

    @Json(name = "img")
    val photo: String? = "No Data",

    val separator: String  = ", ",

    val occupations: String = occupation.joinToString(separator)
)
