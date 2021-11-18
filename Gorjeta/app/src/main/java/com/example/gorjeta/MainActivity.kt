package com.example.gorjeta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gorjeta.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {
    lateinit  var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnCalcular.setOnClickListener {
            calcularGorjeta()
        }


    }

    private fun calcularGorjeta() {
        val valorDoServicoString=binding.txtValor.text.toString()
        val valorServico=valorDoServicoString.toDouble()
        val porcentagem=binding.rgGroup.checkedRadioButtonId


        val porcentagemGorjeta=when(porcentagem){
            R.id.rb_opcaoIncrivel ->0.20
            R.id.rb_opcaoBoa-> 0.18
            else-> 0.15
        }

        var valorGorjeta=porcentagemGorjeta*valorServico

        val arredondar=binding.swArredondar.isChecked
            if(arredondar){
                valorGorjeta=kotlin.math.ceil(valorGorjeta)
            }

        val gorjetaformatada= NumberFormat.getCurrencyInstance().format(valorGorjeta).toString()

        binding.valorGorjeta.text="Valor da gorjeta é ${gorjetaformatada}"
    }
}