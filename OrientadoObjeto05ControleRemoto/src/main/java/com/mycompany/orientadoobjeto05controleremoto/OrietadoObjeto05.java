
package com.mycompany.orientadoobjeto05controleremoto;


public class OrietadoObjeto05 {
    
    public static void main(String[] args) {
        ControleRemoto cr1 = new ControleRemoto();
        cr1.ligar();
        cr1.ligarMudo();
        cr1.abrirMenu();
        
        ControleRemoto cr2 = new ControleRemoto();
        cr2.ligar();
        
        cr2.pause();
        
        
        cr2.abrirMenu();
        
    }
}
