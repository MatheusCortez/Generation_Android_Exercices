import Empregado.DepartamentoDeVendas.GerenteVendas
import Empregado.DepartamentoDeVendas.RepresentanteVendas
import Login.Login
import javax.swing.JOptionPane

fun main(args: Array<String>) {


    val caio=RepresentanteVendas(
        primeiroNome = "Caio",
        sobrenome="Cortez",
        registro = 123,
        idade = 24,
        diasTrabalhados = 500,
        diasDeFerias = 10,
        salario = 100.00,anosTrabalhados = 3,
        vendasRealizadas = 200.00,
    )


    val matheus=RepresentanteVendas(
        primeiroNome = "Matheus",
        sobrenome="Cortez",
        registro = 123,
        idade = 24,
        diasTrabalhados = 500,
        diasDeFerias = 10,
        salario = 100.00,anosTrabalhados = 3,
        vendasRealizadas = 100.00,
        )

    val allan= GerenteVendas(
        primeiroNome = "Allan",
        sobrenome="Cortez",
        registro = 123,
        idade = 34,
        diasTrabalhados = 500,
        diasDeFerias = 10,
        salario = 100.00,
        anosTrabalhados = 3,
        vendasRealizadas = 600.00,
    )
   caio.calcularComissao()
    caio.calcularBonus()
    caio.tempoParaAposentar()
    caio.tempoRestantedeFerias()







}