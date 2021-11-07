package Empregado.DepartamentoDeVendas

class GerenteVendas(primeiroNome: String,
                    sobrenome: String,
                    registro: Int,
                    idade:Int,
                    diasTrabalhados:Int=0,
                    diasDeFerias:Int,
                    salario:Double,
                    anosTrabalhados:Int,
                    vendasRealizadas:Double
)
    :RepresentanteVendas    (primeiroNome,
    sobrenome,
    registro,
    idade,
    diasTrabalhados,
    diasDeFerias,
    salario,
    anosTrabalhados,
    vendasRealizadas)


{

    val listaDeFuncionarios = mutableMapOf<String,RepresentanteVendas?>()

    fun cadastrarFuncionario(representante: RepresentanteVendas?) {
        listaDeFuncionarios[representante?.registro.toString()]=representante
        println("Cadastro Realizado, ${representante?.primeiroNome +" "
                + representante?.sobrenome}," +
                "cadastrado com sucesso")
        println(listaDeFuncionarios.size)


    }

    fun listarFuncionarios(){
        for(representante in listaDeFuncionarios){
            println("${representante.value?.primeiroNome}" +
                    " ${representante.value?.sobrenome}" )
        }
    }
    fun comissaoGeral(){
        var comissaoTotal:Double=00.0
        for (representante in listaDeFuncionarios){
            comissaoTotal+= representante.value?.vendasRealizadas!!
            println(representante.value?.vendasRealizadas)
        }
        comissaoTotal=comissaoTotal*0.03
        println("Comissao total referente ao Gerente do departamento será R$ " +
                "$comissaoTotal Reais")
    }




}
