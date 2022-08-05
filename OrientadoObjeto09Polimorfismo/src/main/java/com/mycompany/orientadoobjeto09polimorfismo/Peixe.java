
package com.mycompany.orientadoobjeto09polimorfismo;

public class Peixe extends Animal{
    //atributos
    private String corEscama;
    
    //metodos especiais
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    //metodo
    public void soltarBolha(){
        System.out.println("Soltando bolhas");
    }
    //metodos subscritos
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo algas e frutos do mar");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de peixe");
    }
    
}
