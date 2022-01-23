package com.example.examplemvvm.domain

import com.example.examplemvvm.data.QuoteRepository
import com.example.examplemvvm.domain.data.model.QuoteModel
import javax.inject.Inject

class GetRandomQuoteUseCase @Inject constructor(private val repository : QuoteRepository){

    suspend operator fun invoke():Quote?{
        var quotes= repository.getAllQuotesFromDatabase()
        if(!quotes.isNullOrEmpty()){
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }
}