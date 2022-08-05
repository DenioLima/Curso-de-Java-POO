
package com.mycompany.orientadoobjeto10polimorfismo;

public class Mamifero extends Animal{
    //atributo 
    private String corPelo;
    
    //metodo especial
    public String getCorPelo() {
        return corPelo;
        
    }

    public void setCorPelo(String corPelo) {    
        this.corPelo = corPelo;
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }
    
}
