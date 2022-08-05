
package com.mycompany.orientadoobjeto10polimorfismo;

public class OrientadoObjetoPolimorfismo10 {
    
    public static void main(String[] args) {
        Mamifero ma = new Mamifero();
        Lobo lo = new Lobo();
        Cachorro ca = new Cachorro();
        
       ma.setIdade(14);
       ma.setMembros(4);
       ma.setPeso(90.2f);
       ma.emitirSom();
       System.out.println(ma.toString()); 
       ma.espaco();
       
       lo.setIdade(9);
       lo.setMembros(4);
       lo.setPeso(20.5f);
       lo.emitirSom();
       System.out.println(lo.toString());   
       lo.espaco();
       
       ca.setIdade(7);
       ca.setMembros(4);
       ca.setPeso(10.5f);
       ca.emitirSom();
       System.out.println(ca.toString());
       ca.reagir("Toma comida");
       ca.reagir(true);
       ca.reagir(10, 17);
       ca.reagir(7, 10.5f);
       ca.espaco();
    }
}
