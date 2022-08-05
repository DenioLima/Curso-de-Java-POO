
package com.mycompany.orientadoobjeto10polimorfismo;
    
public class Cachorro extends Lobo{
    //Vou usar o polimorfismo de sobrecarga, para isso vou usar o mesmo metodo na mesma classe com assinaturas diferentes
    public void reagir(String frase){
        if (frase == "Toma comida" || frase =="Ola") {
            System.out.println("Abanar o rabo e latir");
        } else {
            System.out.println("Rosnar");
        }
    }
    public void reagir(int h,int m){
        if (h < 12) {
            System.out.println("Abanar");
        } else if (h >= 12 && h < 18) {
            System.out.println("Abanar e latir");
        } else {
            System.out.println("Ignorar");
        }
        
    }
    public void reagir(boolean dono){
        if (dono == true) {
            System.out.println("Abanar o rabo");
        } else {
            System.out.println("Rosnar e latir");
        }
    }
    public void reagir(int idade,float peso){
        if (idade < 5 && peso < 5) {
            System.out.println("Correr e abanar o rabo");
        } else if (idade >= 5 && peso >= 5) {
            System.out.println("Ficar parado e abanar o rabo");
        } else {
            System.out.println("Ignorar");
        }
 {
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    //metodo subscrito
    @Override
    public void emitirSom() {
        System.out.println("Latindo");
    }
    
    
}
