
package com.mycompany.orientadoobjeto09polimorfismo;

public class Mamifero extends Animal{
    //atributos
    private String corPelo;
    
    //metodo especiais
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    //metodos subscritos
    @Override
    public void locomover() {
        System.out.println("Andando");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }
    
}
