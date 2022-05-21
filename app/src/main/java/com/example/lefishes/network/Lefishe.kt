package com.example.lefishes.network

import com.squareup.moshi.Json

//data class Lefishe (
//    val name: String,
//    val type: String,
//    val description: String
//)

data class Lefishe (
    @Json(name = "Species Illustration Photo")
    val photo: SpeciesIllustrationPhoto?,

    @Json(name = "Species Name")
    val name: String? = "No Data",

    @Json(name = "Physical Description")
    val description: String? = "No Data",
)

data class SpeciesIllustrationPhoto (
    val src: String,
    val alt: String? = "No Data",
    val title: String? = "No Data"
)


//"Fishery Management": "",
//"Habitat": "",
//"Habitat Impacts": "",
//"Image Gallery": [
//{
//    "src": "",
//    "alt": ""
//},
//...
//],
//"Location": "",
//"Management": "",
//"NOAA Fisheries Region": "",
//"Population": "",
//"Population Status": "",
//"Scientific Name": "",
//"Species Aliases": "",
//"Species Illustration Photo": {
//    "src": "",
//    "alt": ""
//},
//"Species Name": "",
//"Animal Health": "",
//"Availability": "",
//"Biology": "",
//"Bycatch": "",
//"Calories": "",
//"Carbohydrate": "",
//"Cholesterol": "",
//"Color": "",
//"Disease Treatment and Prevention": "",
//"Diseases in Salmon": "",
//"Displayed Seafood Profile Illustration": "",
//"Ecosystem Services": "",
//"Environmental Considerations": "",
//"Environmental Effects": "",
//"Farming Methods": "",
//"Fat, Total": "",
//"Feeds": "",
//"Fiber, Total Dietary": "",
//"Fishing Rate": "",
//"Harvest": "",
//"Harvest Type": "",
//"Health Benefits": "",
//"Human Health": "",
//"Physical Description": "",
//"Production": "",
//"Protein": "",
//"Quote": "",
//"Quote Background Color": "",
//"Research": "",
//"Saturated Fatty Acids, Total": "",
//"Selenium": "",
//"Serving Weight": "",
//"Servings": "",
//"Sodium": "",
//"Source": "",
//"Sugars, Total": "",
//"Taste": "",
//"Texture": "",
//"Path": ""