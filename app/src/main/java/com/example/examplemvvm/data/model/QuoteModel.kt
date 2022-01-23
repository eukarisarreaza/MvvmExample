package com.example.examplemvvm.domain.data.model

import com.google.gson.annotations.SerializedName

data class QuoteModel (@SerializedName("quote") val quote: String, val author:String)