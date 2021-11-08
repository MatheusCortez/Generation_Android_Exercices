package Calculadora

import org.junit.jupiter.api.Test



import org.junit.jupiter.api.Assertions.*


internal class CalculadoraTest {

    val calculadora = Calculadora()
    @Test
    fun somaTeste() {
        assertEquals(6,calculadora.soma(3,3))
    }

    @Test
    fun subtracaoTeste() {
        assertEquals(2,calculadora.subtracao(5,3))
    }

    @Test
    fun multiplicacaoTeste() {
        assertEquals(8,calculadora.multiplicacao(2,4))
    }

    @Test
    fun divisaoTest() {
        assertEquals(2,calculadora.divisao(4,2))
    }


}