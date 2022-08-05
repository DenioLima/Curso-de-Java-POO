
package com.mycompany.orientadoobjetobanco;

public class Banco {
    
    public static void main(String[] args) {
        
        contaBanco c1 = new contaBanco(0,false);
        c1.abrirConta("cp");
        c1.setnumConta(2424);
        c1.setDono("Diego Magela Goncalves");
        c1.estadoAtual();
        c1.depositar(8000000);
        c1.sacar(200000);
        c1.pagarMensal();
        
        
        contaBanco c2 = new contaBanco(0,false);
        c2.abrirConta("cc");
        c2.setnumConta(4747);
        c2.setDono("Denio goncalves");
        c2.estadoAtual();
        c2.depositar(200);
        c2.pagarMensal();
        c2.sacar(300);
        
    }
    
}
