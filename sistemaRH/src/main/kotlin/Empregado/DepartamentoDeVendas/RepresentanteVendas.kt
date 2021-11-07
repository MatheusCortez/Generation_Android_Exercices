package Empregado.DepartamentoDeVendas

import Empregado.Empregado

open class RepresentanteVendas(primeiroNome: String,
                               sobrenome: String,
                               registro: Int,
                               idade:Int,
                               diasTrabalhados:Int=0,
                               diasDeFerias:Int,
                               salario:Double,
                               anosTrabalhados:Int,
                               val vendasRealizadas:Double,

                          ):
    Empregado   (primeiroNome,
                sobrenome,
                registro,
                idade,
                diasTrabalhados,
                diasDeFerias,
                salario,
                anosTrabalhados
                ) {
        var comissao:Double=00.0
        open fun calcularComissao() {
            var Calculocomissao=0.1*vendasRealizadas
            println("O valor de comissao é R$$Calculocomissao")
            this.comissao=Calculocomissao

        }
}