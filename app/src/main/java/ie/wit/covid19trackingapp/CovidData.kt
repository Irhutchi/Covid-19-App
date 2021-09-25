package ie.wit.covid19trackingapp

import java.util.*

// This file represents the data from the json object in the api.

data class CovidData(
    val dateChecked: Date,
    val positiveIncrease: Int,
    val negativeIncrease: Int,
    val deathIncrease: Int,
    val state: String
)