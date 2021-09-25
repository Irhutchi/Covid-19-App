package ie.wit.covid19trackingapp

import retrofit2.Call
import retrofit2.http.GET

// Interface file - define a fun for each endpoint in the api
interface CovidService {
    @GET("us/daily.json")
    fun getNationalData(): Call<List<CovidData>>

    @GET("states/daily.json")
    fun getStatesData(): Call<List<CovidData>>
}