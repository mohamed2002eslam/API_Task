package com.example.retrofitsample.network.response

import com.google.gson.annotations.SerializedName

data class Tv (
    @SerializedName("id")//give me freedom to name the parameter anything i want
    val id:Int ?=null,
    @SerializedName("adult")
    val isAdult:Boolean ?=null,
    @SerializedName("vote_average")
    val averageVote:Double?=null,
    @SerializedName("original_name")
    val name:String?=null,
    @SerializedName("poster_path")
    val posterPath: String?=null,
    @SerializedName("overview")
    val overview: String?=null

)