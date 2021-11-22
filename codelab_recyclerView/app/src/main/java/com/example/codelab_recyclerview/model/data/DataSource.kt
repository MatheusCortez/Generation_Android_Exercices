package com.example.codelab_recyclerview.model.data

import com.example.codelab_recyclerview.R
import com.example.codelab_recyclerview.model.Afirmacao

class Datasource {

     fun loadAffirmations():List<Afirmacao>{
        return listOf<Afirmacao>(
            Afirmacao(R.string.affirmation1),
            Afirmacao(R.string.affirmation2),
            Afirmacao(R.string.affirmation3),
            Afirmacao(R.string.affirmation4),
            Afirmacao(R.string.affirmation5),
            Afirmacao(R.string.affirmation6),
            Afirmacao(R.string.affirmation7),
            Afirmacao(R.string.affirmation8),
            Afirmacao(R.string.affirmation9),



        )
    }
}