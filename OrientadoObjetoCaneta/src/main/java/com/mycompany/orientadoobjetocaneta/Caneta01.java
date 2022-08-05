
package com.mycompany.orientadoobjetocaneta;

public class Caneta01 {
    //atributos
    public String cor;
    private float ponta;
    private String modelo;
    private boolean tampada;
     //metodos
    public String getModelo(){
        return this.modelo;
    }
    public void setTampada(boolean t){
        this.tampada = true;
    }
    public void setDestampada(){
        this.tampada = false;
    }
    public void status(){
        System.out.println("A caneta e "+ this.cor);
        System.out.println("A caneta e do modelo "+ this.getModelo());
        System.out.println("A caneta tem a ponta de " + this.ponta);
        System.out.println("A caneta esta tampada?" + this.tampada);
    }
    //metodos construtores
    public Caneta01(String c,String m,float p,boolean t){
        this.cor = c;
        this.modelo = m;
        this.ponta = p;
        this.tampada = t;
    }
   
}
