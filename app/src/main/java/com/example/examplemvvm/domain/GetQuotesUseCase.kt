package com.example.examplemvvm.domain

import com.example.examplemvvm.data.QuoteRepository
import com.example.examplemvvm.data.database.entities.toDataBase
import com.example.examplemvvm.domain.data.model.QuoteModel
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor( private val repository : QuoteRepository) {

    suspend operator fun invoke():List<Quote> {
        val quotes= repository.getAllQuotesFromApi()
        if(quotes.isNotEmpty()){
            repository.clearQuotes()
            repository.insertQuotes(quotes.map { it.toDataBase() })
            return quotes
        }else {
            return repository.getAllQuotesFromDatabase()
        }
    }

}