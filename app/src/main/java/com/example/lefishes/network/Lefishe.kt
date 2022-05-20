package com.example.lefishes.network

import com.squareup.moshi.Json

//data class Lefishe (
//    val name: String,
//    val type: String,
//    val description: String
//)

data class Lefishe (
    @Json(name = "Fishery Management")
    val fisheryManagement: String? = "No Data",

    @Json(name = "Habitat")
    val habitat: String? = "No Data",

    @Json(name = "Habitat Impacts")
    val habitatImpacts: String? = "No Data",

//    @Json(name = "Image Gallery")
//    val imageGallery: List<ImageGallery?> = listOf(),

    @Json(name = "Location")
    val location: String? = "No Data",

    @Json(name = "Management")
    val management: String? = "No Data",

    @Json(name = "NOAA Fisheries Region")
    val noaaFisheriesRegion: String? = "No Data",

    @Json(name = "Population")
    val population: String? = "No Data",

    @Json(name = "Population Status")
    val populationStatus: String? = "No Data",

    @Json(name = "Scientific Name")
    val scientificName: String? = "No Data",

    @Json(name = "Species Aliases")
    val speciesAliases: String? = "No Data",

    @Json(name = "Species Illustration Photo")
    val photo: SpeciesIllustrationPhoto?,

    @Json(name = "Species Name")
    val name: String? = "No Data",

    @Json(name = "Animal Health")
    val animalHealth: String? = "No Data",

    @Json(name = "Availability")
    val availability: String? = "No Data",

    @Json(name = "Biology")
    val biology: String? = "No Data",

    @Json(name = "Bycatch")
    val bycatch: String? = "No Data",

    @Json(name = "Calories")
    val calories: String? = "No Data",

    @Json(name = "Carbohydrate")
    val carbohydrate: String? = "No Data",

    @Json(name = "Cholesterol")
    val cholesterol: String? = "No Data",

    @Json(name = "Color")
    val color: String? = "No Data",

    @Json(name = "Disease Treatment and Prevention")
    val diseaseTreatmentandPrevention: String? = "No Data",

    @Json(name = "Diseases in Salmon")
    val diseasesinSalmon: String? = "No Data",

    @Json(name = "Displayed Seafood Profile Illustration")
    val displayedSeafoodProfileIllustration: String? = "No Data",

    @Json(name = "Ecosystem Services")
    val ecosystemServices: String? = "No Data",

    @Json(name = "Environmental Considerations")
    val environmentalConsiderations: String? = "No Data",

    @Json(name = "Environmental Effects")
    val environmentalEffects: String? = "No Data",

    @Json(name = "Farming Methods")
    val farmingMethods: String? = "No Data",

    @Json(name = "Fat, Total")
    val fatTotal: String? = "No Data",

    @Json(name = "Feeds")
    val feeds: String? = "No Data",

    @Json(name = "Fiber, Total Dietary")
    val fiberTotalDietary: String? = "No Data",

    @Json(name = "Fishing Rate")
    val fishingRate: String? = "No Data",

    @Json(name = "Harvest")
    val harvest: String? = "No Data",

    @Json(name = "Harvest Type")
    val harvestType: String? = "No Data",

    @Json(name = "Health Benefits")
    val healthBenefits: String? = "No Data",

    @Json(name = "Human Health")
    val HumanHealth: String? = "No Data",

    @Json(name = "Physical Description")
    val description: String? = "No Data",

    @Json(name = "Production")
    val production: String? = "No Data",

    @Json(name = "Protein")
    val protein: String? = "No Data",

    @Json(name = "Quote")
    val quote: String? = "No Data",

    @Json(name = "Quote Background Color")
    val quoteBackgroundColor: String? = "No Data",

    @Json(name = "Research")
    val research: String? = "No Data",

    @Json(name = "Saturated Fatty Acids, Total")
    val saturatedFattyAcidsTotal: String? = "No Data",

    @Json(name = "Selenium")
    val selenium: String? = "No Data",

    @Json(name = "Serving Weight")
    val servingWeight: String? = "No Data",

    @Json(name = "Servings")
    val servings: String? = "No Data",

    @Json(name = "Sodium")
    val sodium: String? = "No Data",

    @Json(name = "Source")
    val source: String? = "No Data",

    @Json(name = "Sugars, Total")
    val sugarsTotal: String? = "No Data",

    @Json(name = "Taste")
    val taste: String? = "No Data",

    @Json(name = "Texture")
    val texture: String? = "No Data",

    @Json(name = "Path")
    val path: String? = "No Data"
)

//data class ImageGallery (
//    val src: String? = "https://www.fishwatch.gov/sites/default/files/Hake_White_NB_W_0.png",
//    val alt: String? = "No Data"
//)

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