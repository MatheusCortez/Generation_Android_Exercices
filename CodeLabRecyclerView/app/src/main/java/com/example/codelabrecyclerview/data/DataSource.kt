package com.example.codelabrecyclerview.data

import com.example.codelabrecyclerview.R
import com.example.codelabrecyclerview.model.Afirmmation

class Datasource {


    fun loadAffirmation(): List<Afirmmation> {
    return listOf<Afirmmation>(
        Afirmmation(R.string.affirmation1),
        Afirmmation(R.string.affirmation2),
        Afirmmation(R.string.affirmation3),
        Afirmmation(R.string.affirmation4),
        Afirmmation(R.string.affirmation5),
        Afirmmation(R.string.affirmation6),
        Afirmmation(R.string.affirmation7)
    )
    }
}