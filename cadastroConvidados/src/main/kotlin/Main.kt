fun main(args: Array<String>) {

    print("Você quer acessar o menu? ")
    var simNao = readLine()!!

    val lista = mutableListOf<String>("Madalena", "Giovanna")

    while (simNao == "sim") {
        print("Digite 1 para add uma convidada: ")
        print("Digite 2 para remover uma convidada: ")
        print("Digite 3 para ver a lista de convidadas: ")

        var menu = readLine()!!

        when (menu) {

            "1" -> add(lista)
            "2" -> remove(lista)
            "3" -> convidadas(lista)

        }
    }
}
fun add (lista : MutableList<String>) : Any{
    print("Informe um nome para add: ")
    var addName =  readLine()!!
    lista +=(addName)
    println(lista)
    return lista
}

fun remove (lista : MutableList<String>) : Any{
    print("Informe o nome que deseja remover: ")
    var removeName = readLine()!!
    if (lista.contains(removeName)){
        lista.remove(removeName)
        println("$removeName foi removida da lista.")
        return lista

    }
    else return print("O nome não foi encontrado")
}

fun convidadas (lista : MutableList<String>){
    for (item in lista)
        println(item)

}