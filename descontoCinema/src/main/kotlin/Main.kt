fun main(args: Array<String>) {
/*
*Exercício 3

Um cinema aplica descontos dependendo da idade do cliente.

1 - Crie um projeto chamado DescontosCinema
2 - O App pede para um usuário digitar a sua idade e checa se ele
*   está apto para o deconto do ingresso. A tabela de descontos é a seguinte

Idade                            Preço do Ingresso
Ingresso inteiro           18 Reais
Abaixo de 5 anos        60% de Desconto
Acima de 60 anos       55% Discount

3 - Codifique o app para calcular o preço correto do ingresso com
* base na idade e mostre esse retorno para o usuário.
4 - Caso o usuário não tenha desconto, crie um sistema
*  para a quantidade de ingressos que ele quer e, se ele comprar dois ingressos ou mais,
* terá um desconto de 30% em cada um.
*
*
* */
    var idade:Int
    var valorIngressoCrianca:Float
    var valorIngressoIdoso:Float
    var count:Int
    count=0
    var precoTotal:Float=0.0F

    println("Quantos ingressos deseja comprar ao total?")
    count= readLine()!!.toInt()
    if(count<=0){
        return  println("Valor Invalido")

    }

    println("Há alguem menor de 5 anos?(S/N)")
    var respostaCrianca:String="N"
    respostaCrianca= readLine()!!

    if(respostaCrianca=="sim"||respostaCrianca=="S"||respostaCrianca=="s"||respostaCrianca=="SIM"){
        println("Quantos ingressos para menores de 5 anos deseja adquirir")
        var qtdIngressosCincoAnos:Int=0
        qtdIngressosCincoAnos= readLine()!!.toInt()

        valorIngressoCrianca= (qtdIngressosCincoAnos*(18*0.4)).toFloat()
        count=count-qtdIngressosCincoAnos

        if(count==0){
            return   println("O valor total é igual a $valorIngressoCrianca sendo $qtdIngressosCincoAnos para crianças " +
                    "ate 5 anos")
        }

        println("Ainda há $count ingressos referente a sua compra algum será para alguem " +
                "com idade igual ou superior a 60 anos ?")
        var respostaIdoso:String="N"
        respostaIdoso= readLine()!!
        if(respostaIdoso=="sim"||respostaIdoso=="S"||respostaIdoso=="s"||respostaIdoso=="SIM"){
            var qtdIngressosIdoso:Int=0
            println("Quantos ingressos para maiores de 60 anos deseja?")
            qtdIngressosIdoso= readLine()!!.toInt()
            count=count-qtdIngressosIdoso
            valorIngressoIdoso=(qtdIngressosIdoso*(18*0.45)).toFloat()

            precoTotal=valorIngressoIdoso
            if(count==0){
                return println("O valor total é igual a $precoTotal sendo referente a $qtdIngressosIdoso de ingressos " +
                        "para pessoas maiores de 60 anos totalizando")

            }else{
                println("Ainda há $count ingressos eles serão adquiridos ?")
                var respostaIngressosRestantes= readLine()!!
                if(respostaIngressosRestantes=="S"||respostaIngressosRestantes=="s"||respostaIngressosRestantes=="SIM"
                    ||respostaIngressosRestantes=="sim"){
                    var totalIngressosComuns=count*18

                    precoTotal=precoTotal+(totalIngressosComuns)
                    return println("O valor total é igual a $precoTotal sendo referente a $qtdIngressosIdoso de ingressos " +
                            "para pessoas maiores de 60 anos totalizando $valorIngressoIdoso \n " +
                            "\n  $qtdIngressosCincoAnos de ingressos para menores de 5 anos totalizando $valorIngressoCrianca" +
                            "\n $count de ingressos a valor comum totalizando $totalIngressosComuns ")
                }
            }

        }


    }
    else {
        println("Sera adquirido algum ingresso para maiores de 60 anos ?")
        var respostaIdoso:String="N"
        respostaIdoso= readLine()!!

        if(respostaIdoso=="sim"||respostaIdoso=="S"||respostaIdoso=="s"||respostaIdoso=="SIM"){
            var qtdIngressosIdoso:Int=0
            println("Quantos ingressos para maiores de 60 anos deseja?")
            qtdIngressosIdoso= readLine()!!.toInt()
            count=count-qtdIngressosIdoso
            valorIngressoIdoso=(qtdIngressosIdoso*(18*0.45)).toFloat()
            precoTotal=valorIngressoIdoso
            if(count==0){
                return println("O valor total gasto foi $precoTotal sendo solicitado $qtdIngressosIdoso " +
                        " para pessoas maiores de 60 anos")
            }else{
                println("Ainda há $count ingressos eles serão adquiridos ?")
                var respostaIngressosRestantes= readLine()!!
                if(respostaIngressosRestantes=="S"||respostaIngressosRestantes=="s"||respostaIngressosRestantes=="SIM"
                    ||respostaIngressosRestantes=="sim"){

                    if(count>=2) {
                        var totalIngressosComuns = count * 12.6
                        totalIngressosComuns
                        precoTotal=precoTotal+(totalIngressosComuns).toFloat()
                        return println("O valor total é igual a $precoTotal sendo referente a $qtdIngressosIdoso de ingressos " +
                                "para pessoas maiores de 60 anos totalizando $valorIngressoIdoso" +
                                "\n $count de ingressos a valor comum totalizando $totalIngressosComuns ")


                    }

                    var totalIngressosComuns = count * 18

                    precoTotal=precoTotal+(totalIngressosComuns)
                    return println("O valor total é igual a $precoTotal sendo referente a $qtdIngressosIdoso de ingressos " +
                            "para pessoas maiores de 60 anos totalizando $valorIngressoIdoso" +
                            "\n $count de ingressos a valor comum totalizando $totalIngressosComuns ")
                }
            }

        }

        else{
            if(count>=2) {
                var totalIngressosComuns = count * 12.6
                totalIngressosComuns
                precoTotal=precoTotal+(totalIngressosComuns).toFloat()
                return println("O valor total é igual a $precoTotal sendo referente  " +
                        "\n $count de ingressos a valor comum ")


            } else{
                precoTotal= (count*18).toFloat()
                return println("O valor total é igual a $precoTotal" +
                        "Sendo referente a $count ingresso(s) no valor de 18 cada  " )
            }

        }



    }



}