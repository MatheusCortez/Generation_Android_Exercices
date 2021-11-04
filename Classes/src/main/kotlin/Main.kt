fun main(args: Array<String>) {
    val contaCorrente = Conta()

    contaCorrente.proprietario="Matheus"
    contaCorrente.saldo=2500.00
    contaCorrente.tipo=1
    println( contaCorrente.proprietario)

    contaCorrente.saldo()
    val contaPoupanca = Conta()

    contaPoupanca.proprietario="Caio"
    contaPoupanca.saldo=1500.00
    contaPoupanca.tipo=2






}