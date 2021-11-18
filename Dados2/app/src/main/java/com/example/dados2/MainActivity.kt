package com.example.dados2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btndados:Button=findViewById(R.id.btn_gerarNumero)


        btndados.setOnClickListener {
            rolarDado()
        }
    }

    private fun rolarDado() {
        val dado=Dado(6)
        val jogarDado1=dado.jogar()
        var primeiroDado:ImageView=findViewById(R.id.dado1)
        var segundoDado:ImageView=findViewById(R.id.dado2)
        segundoDado.setImageResource(R.drawable.dice_1)
        val jogarDado2=dado.jogar()
        when(jogarDado1){
            1->primeiroDado.setImageResource(R.drawable.dice_1)
            2->primeiroDado.setImageResource(R.drawable.dice_2)
            3->primeiroDado.setImageResource(R.drawable.dice_3)
            4->primeiroDado.setImageResource(R.drawable.dice_4)
            5->primeiroDado.setImageResource(R.drawable.dice_5)
            6->primeiroDado.setImageResource(R.drawable.dice_6)

        }
        when(jogarDado2){
            1->segundoDado.setImageResource(R.drawable.dice_1)
            2->segundoDado.setImageResource(R.drawable.dice_2)
            3->segundoDado.setImageResource(R.drawable.dice_3)
            4->segundoDado.setImageResource(R.drawable.dice_4)
            5->segundoDado.setImageResource(R.drawable.dice_5)
            6->segundoDado.setImageResource(R.drawable.dice_6)

        }

    }


}

class Dado(val numeroLados:Int){
    fun jogar():Int{
        return (1..numeroLados).random()
    }
}