package com.example.retrofitsample.network.response

import com.google.gson.annotations.SerializedName

data class AiringTodayResponse(
    @SerializedName("page")
    val page:Int ?=null,
    @SerializedName("total_pages")
    val totalPages: Int?=null,
    @SerializedName("total_results")
    val totalResults: Int?=null,
    @SerializedName("results")
    val results: ArrayList<Tv>?=null


)

