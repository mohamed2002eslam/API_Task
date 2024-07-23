package com.example.retrofitsample.network

import com.example.retrofitsample.network.response.AiringTodayResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

//https://api.themoviedb.org/3/tv/latest
//'https://api.themoviedb.org/3/tv/airing_today?language=en-US&page=1
interface Api {
    @GET(NetworkConstants.AIRING_TODAY)
//    @Headers("Authorization:Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI3ZDg0YWQ4ODc1YTMzMTQzYmU0ZDM4YzUxZWViYmY4MiIsIm5iZiI6MTcyMTQ5MzkwNS4yNTE4OTgsInN1YiI6IjY2OWJlMTgwYTQ4ZGY3OWYwMjc3NzQ2ZiIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.qjWPmaqjDn00DLU1vNeaeokROvKlQjcCuVV_d53Mc6Y")
    suspend fun getAiringToday(
        @Query("language") language:String="en-US",//default value
        @Query("page") page:Int = 1,
        @Header("Authorization") token: String="Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI3ZDg0YWQ4ODc1YTMzMTQzYmU0ZDM4YzUxZWViYmY4MiIsIm5iZiI6MTcyMTQ5MzkwNS4yNTE4OTgsInN1YiI6IjY2OWJlMTgwYTQ4ZGY3OWYwMjc3NzQ2ZiIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.qjWPmaqjDn00DLU1vNeaeokROvKlQjcCuVV_d53Mc6Y"
    ):Response<AiringTodayResponse>//haga bt3rf el retrofit eny b3ml IO exp.

}