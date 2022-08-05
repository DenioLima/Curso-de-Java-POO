package com.mycompany.orientadoobjeto05controleremoto;

//para implemantar a classe a interface devo usar o implements e o nome da interface

public class ControleRemoto implements Controlador{

    //Atributos 
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //metodos especiais
    public int getVolume(){
        return this.volume;
    }
    public void setVolume(int v){
        this.volume = v;
    
    }
    public boolean getLigado (){
        return this.ligado;
    }
    public void setLigado(boolean li){
        this.ligado = li;
    }
    public boolean getTocando(){
        return this.tocando;
    }
    public void setTocando(boolean to){
        this.tocando = to;
    }
    //metdo construtor
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    
    //metodo subscrito da interface
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Esta ligado?" +this.getLigado());
        System.out.println("esta tocando?" + this.getLigado());
        System.out.print("Volume" + this.getVolume());
        
        for(int i = 0; i <= this.getVolume(); i+=10){
            System.out.print("|");
        
        }
        System.out.println("");  
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        this.setVolume(this.getVolume() + 1);
    }

    @Override
    public void menosvolume() {
        this.setVolume(this.getVolume() - 1);
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() == true && this.getVolume() > 0) {
            this.setVolume(0);
        } else {
            System.out.println("Esta desligado ou ja esta no mudo");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() == true && this.getVolume() <= 0) {
            this.setVolume(50);
        } else {
        }
    }

    @Override
    public void play() {
        if (this.getLigado() == true && this.getTocando() == false) {
            this.setTocando(true);
        } else {
        }
    }

    @Override
    public void pause() {
        if (this.getLigado()  && this.getTocando()) {
            this.setTocando(false);
        } else {
            System.out.println("erro");
        }
    }
    
}
