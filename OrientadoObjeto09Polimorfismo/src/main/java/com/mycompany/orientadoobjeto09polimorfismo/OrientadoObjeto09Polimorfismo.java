
package com.mycompany.orientadoobjeto09polimorfismo;

import javax.tools.Tool;

public class OrientadoObjeto09Polimorfismo {
    
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        m.setCorPelo("Preto");
        m.setIdade(5);
        m.setMembros(4);
        m.setPeso(15.3f);
        m.alimentar();
        m.locomover();
        m.emitirSom();
        System.out.println(m.toString());
        m.espaco();
        
        r.setCorEscama("Verde");
        r.setIdade(2);
        r.setMembros(0);
        r.setPeso(3.5f);
        r.alimentar();
        r.emitirSom();
        r.locomover();
        System.out.println(r.toString());
        r.espaco();
        
        p.setCorEscama("Azul");
        p.setIdade(1);
        p.setMembros(0);
        p.setPeso(1.3f);
        p.alimentar();
        p.emitirSom();
        p.locomover();
        System.out.println(p.toString());
        p.espaco();
        
        a.setCorPena("Vermelho");
        a.setIdade(3);
        a.setMembros(2);
        a.setPeso(5.6f);
        a.alimentar();
        a.emitirSom();
        a.locomover();
        System.out.println(a.toString());
        a.espaco();
        
        Canguru can = new Canguru();
        Cachorro cach = new Cachorro();
        Cobra co = new Cobra();
        Tartaruga ta = new Tartaruga();
        PeixeDourado dourado = new PeixeDourado();
        Arara ara = new Arara();
        
       can.setIdade(12);
       can.setMembros(2);
       can.setPeso(79.5f);
       can.alimentar();
       can.emitirSom();
       can.locomover();
       can.usarBolsa();
       System.out.println(can.toString());
       can.espaco();
       
       cach.setIdade(4);
       cach.setMembros(4);
       cach.setPeso(5);
       cach.alimentar();
       cach.enterrarOssso();
       cach.emitirSom();
       cach.abanarRabo();
       System.out.println(cach.toString());
       cach.espaco();
       
       co.setIdade(3);
       co.setMembros(0);
       co.setPeso(1.5f);
       co.alimentar();
       co.emitirSom();
       co.locomover();
       System.out.println(co.toString());
       co.espaco();
       
       ta.setIdade(145);
       ta.setMembros(4);
       ta.setPeso(80.5f);
       ta.alimentar();
       ta.emitirSom();
       ta.locomover();
       System.out.println(ta.toString());
       ta.espaco();
       
       dourado.setIdade(1);
       dourado.setMembros(0);
       dourado.setPeso(3.5f);
       dourado.alimentar();
       dourado.emitirSom();
       dourado.locomover();
       System.out.println(dourado.toString());
       dourado.espaco();
       
       ara.setIdade(2);
       ara.setMembros(2);
       ara.setPeso(3.2f);
       ara.alimentar();
       ara.emitirSom();
       ara.locomover();
       System.out.println(ara.toString());
       ara.espaco();
    }
}
