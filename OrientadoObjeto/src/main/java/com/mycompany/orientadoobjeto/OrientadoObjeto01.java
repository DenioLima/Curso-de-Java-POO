
package com.mycompany.orientadoobjeto;


public class OrientadoObjeto01 {
    
    public static void main(String[] args) {
        
        Cruzeiro cru = new Cruzeiro();
        cru.estado = "MG";
        cru.divisao = 2;
        cru.adversario = "Ponte Preta";
        cru.pontuacao = 28;
        cru.mascote = "Raposao cabuloso";
        
        cru.status();
        cru.proximoAdversario();
        cru.vitoria();
        cru.serie();
        
    }
    
}
