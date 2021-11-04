class Conta {
     var proprietario:String=""
       get()= field.uppercase()
    var saldo:Double=0.0
    var tipo =1
    set(valor)= if(valor<=0){
        println("Tipo de conta invalido")
    }


    fun saldo (){
        println("O saldo da conta é $saldo")
    }

    fun saque (valor:Double){
        if(valor<=0){
            println("Valor $valor invalido")
        }else{
            saldo -=valor
            println("Saque de R$$valor realizado com sucesso")
        }

    }

    fun deposito(valor: Double){
        if (valor<=0){
            println("valor invalido ")
        }else{
            println("Você deseja depoistar o valor de $valor")
            println("1 para Prosseguir 2 para cancelar")
            println("Opção: ")

            val opcao= readLine()!!

            when(opcao){
                "1"->{
                    saldo +=valor
                    println("O valor de $valor depositado com sucesso")
                }
                "2"-> {
                    println("Operacao cancelada")
                }
                else -> println("Opcao invalida ")
            }
        }
    }
}