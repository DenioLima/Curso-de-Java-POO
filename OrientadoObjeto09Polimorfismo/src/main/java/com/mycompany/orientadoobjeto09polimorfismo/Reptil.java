
package com.mycompany.orientadoobjeto09polimorfismo;

public class Reptil extends Animal{
    //atributos
    private String corEscama;
    
    //metodos especiais
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    //metodos subscritos
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo insetos");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de reptil");
    }
    
}
