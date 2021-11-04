fun main(args: Array<String>) {
    var count:Int =1
    var countPar:Int=0
    var countImpar:Int=0

    while(count<=10){
        println("Informe um numero")
        var numero = readLine()!!.toInt()
        if(numero%2==0){
            countPar++
        }else {
            countImpar++
        }
        count++
    }
    println("A quantidade de numeros digitados pares foram $countPar")
    println("A quantidade de numeros digitados impares foram $countImpar")
}
