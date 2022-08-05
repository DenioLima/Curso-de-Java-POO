
package com.mycompany.orientadoobjeto09polimorfismo;

public class Ave extends Animal {
    //atributos
    private String corPena;
    
    //metodos especiais
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    //metodo
    public void fazerNinho(){
        System.out.println("Fazendo ninho");
    }
    //metodos subscritos
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }
    
    
}
