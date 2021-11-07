package Empregado


open class Empregado(var primeiroNome:String,
                     var sobrenome:String,
                     var registro:Int,
                     var idade:Int,
                     var diasTrabalhados:Int=0,

                     var diasDeFerias:Int,
                    var salario:Double,
                     var anosTrabalhados:Int,
                     ) {

        fun tempoParaAposentar(){
           var aposentadoria=   minOf(60 - idade, 40 - anosTrabalhados)
                println("Para aposentar faltam $aposentadoria anos")
        }
        fun tempoRestantedeFerias(){
            val temporestanteFerias= (diasTrabalhados/360)*(30 - diasDeFerias)
            println("O tempo restante de ferias é de $temporestanteFerias dias")
        }
        fun calcularBonus(){
            var bonus = 2.2*salario
        }
    }

/*

diasTrabalhados:Int
diasDeFerias:Int
salario:double
anosTrabalhados:Int*/