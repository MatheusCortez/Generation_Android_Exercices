package Login

import javax.swing.JOptionPane

class Login {

   fun abrirMenu(){
       var simNaoEscolhaMenu:String="nao"
       println("foi")
       simNaoEscolhaMenu=  JOptionPane.showInputDialog("Deseja Abrir menu?")

       if(simNaoEscolhaMenu=="sim"||simNaoEscolhaMenu=="s"||simNaoEscolhaMenu== "SIM"||simNaoEscolhaMenu== "")
       {



           JOptionPane.showMessageDialog(null,"Bem vindo ao sistema")

           var menuChoice = JOptionPane.showInputDialog("O que deseja fazer:\n1-Listar Vendedores\n2-Consultar comissão\n3-Sair")
            when(menuChoice){

            }
       }else{
           JOptionPane.showMessageDialog(null,"Até mais")
       }

   }



}