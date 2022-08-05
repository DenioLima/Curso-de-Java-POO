
package com.mycompany.orientadoobjeto06lutador;

import java.util.Random;


public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //metodos
    public void marcarLuta(Lutador l1,Lutador l2){
        if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
            
        } else {
            this.setAprovada(false);
            this.desafiado = null;
            this.setDesafiante(null);
            
        }
    }
    public void lutar(){
        if (this.getAprovada() == true ) {
            this.getDesafiado().apresentar();
            this.getDesafiante().apresentar();
            //Vou criar e importar um objeto da classe random na biblioteca.Vous usar isso para pegar um numero aleatorio de 0 a 3
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch(vencedor){
                case 0:
                    System.out.println("-----------------------");
                    System.out.println("Empate");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    System.out.println("-------------------------");
                    break;
                case 1:
                    System.out.println("-------------------------");
                    System.out.println("Vitoria do " + this.getDesafiado().getNome() );
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    System.out.println("-------------------------");
                    break;
                case 2:
                    System.out.println("-------------------------");
                    System.out.println("Vitoria do " + this.getDesafiante().getNome());
                    this.getDesafiado().perderLuta();
                    this.getDesafiante().ganharLuta();
                    System.out.println("-------------------------");
                    break;
            }
            
        } else {
            System.out.println("Luta inavalida!");
        }
        
    }
    
    //metodos especias

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}
