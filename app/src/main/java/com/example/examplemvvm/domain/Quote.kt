package com.example.examplemvvm.domain

import com.example.examplemvvm.data.database.entities.QuoteEntity
import com.example.examplemvvm.domain.data.model.QuoteModel

data class Quote (val quote: String, val author: String )


fun QuoteModel.toDomain() = Quote(quote, author)

fun QuoteEntity.toDomain() = Quote(quote, author)