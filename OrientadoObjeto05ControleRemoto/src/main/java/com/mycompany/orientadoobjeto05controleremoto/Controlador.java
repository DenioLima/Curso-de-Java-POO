
package com.mycompany.orientadoobjeto05controleremoto;


public interface Controlador {
    //Na interface não se deve declarar atributos e todos os metodos  tem que ser publicos e abstratos
    
    public abstract void ligar();
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosvolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
    
}
