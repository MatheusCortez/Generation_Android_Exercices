import Cursos.Cursos
import Estudante.Estudante

fun main(args: Array<String>) {


   val matheus:Estudante= Estudante("Matheus","Cortez",1,50.0,1)
    val caio:Estudante= Estudante("Caio","Cortez",4,80.0,2)
   val Allan:Estudante= Estudante("Allan","Cortez",4,80.0,2)

    val cursoIngles:Cursos = Cursos("Ingles","Genivaldo",1)


    cursoIngles.cadastrar(caio)
    cursoIngles.numeroDeEstudantesCadastrados()
    cursoIngles.removerEstudante(caio)
    cursoIngles.listarEstudantes()

    try {
        cursoIngles.verificaAluno(matheus)
    }catch (e:Exception){
        println(e.message)
    }
}