
package com.mycompany.orientadoobjeto06lutador;

public class OrientadoObjeto06 {
    public static void main(String[] args) {
        
        Lutador lu[] = new Lutador[6];
        lu[0] = new Lutador("Denio","Brasil",33,1.70f,72.5f,9,1,0);
        lu[1] = new Lutador("Diego","Argentina",28,1.75f,78.2f,7,1,2);
        lu[2] = new Lutador ("Yan","Japao",29,1.92f,110.1f,6,2,2);
        lu[3] = new Lutador ("Abraao","Israel",82,1.45f,85.3f,5,1,4);
        lu[4] = new Lutador ("Soneca","Russia",29,1.86f,84.6f,4,2,4);
        lu[5] = new Lutador ("Lucas","Mexico",30,1.80f,78.9f,4,5,1);
        
        Luta luta = new Luta();
        luta.marcarLuta(lu[3], lu[5]);
        luta.lutar();
        lu[3].status();
        lu[5].status();
    }
    
}
