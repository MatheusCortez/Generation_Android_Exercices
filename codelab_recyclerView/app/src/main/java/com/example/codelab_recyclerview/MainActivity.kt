package com.example.codelab_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adapter.ItemAdapter
import com.example.codelab_recyclerview.model.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView = findViewById<RecyclerView>(R.id.rv)

        val myDataset= Datasource().loadAffirmations()

        recyclerView.adapter= ItemAdapter(this,myDataset)

        recyclerView.setHasFixedSize(true)
    }
}