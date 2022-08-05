
package com.mycompany.orientadoobjetocaneta;


public class Caneta {
    
    public static void main(String[] args) {
        
        Caneta01 caneta = new Caneta01("Azul","Bic",0.5f,true);
        caneta.setDestampada();
        caneta.status();
    }
    
}
