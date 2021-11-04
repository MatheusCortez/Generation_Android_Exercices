package Estudante

class Estudante (var nome: String?,
                 var sobrenome: String?,
                 var ra: Int)  {
    var nota:Double = 0.0
    var ano = 0


    constructor(nome: String?,sobrenome: String?,ra: Int,nota:Double):this(nome, sobrenome, ra){
        this.nota=nota
    }
    constructor(nome: String?,sobrenome: String?,ra: Int,nota: Double,ano:Int):this(nome, sobrenome, ra){
        this.ano=ano
    }

    val foiAprovado: Boolean
        get(){
            return nota >=60
        }

    fun escrevaNomeCompleto(){
        println("$nome $sobrenome")
    }

    fun passouDeAno(){
        if(foiAprovado){
            ano+=1
            println("Parabéns, você passou de ano $ano")
        }else{
            println("Reprovado")
        }
    }






}