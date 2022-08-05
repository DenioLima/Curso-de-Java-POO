
package com.mycompany.orientadoobjeto;

public class Cruzeiro {
    //Atributos
    String estado;
    int pontuacao;
    int divisao;
    String adversario;
    String mascote;
    
    //metodos
    void serie(){
        if(pontuacao >= 70){
            System.out.println("Parabens cabuloso.Voltou para serie A como campeão!"+this.mascote +" cabulosa");   
        }if(pontuacao >= 62  && pontuacao <70){
            System.out.println("Parabens cabuloso.Voltou para serie A");
        }else{
            System.out.println("Que vergonha, mais um ano na serie B ");
        }
    }
    void proximoAdversario(){
        System.out.println("O proximo adversario do cabuloso e " + this.adversario);
    }
     void vitoria(){
         System.out.println(this.pontuacao +=3);
    }
    void status(){
        System.out.println(this.adversario);
         System.out.println(this.divisao);
          System.out.println(this.estado);
           System.out.println(this.mascote);
            System.out.println(this.pontuacao);
    }
    
}
