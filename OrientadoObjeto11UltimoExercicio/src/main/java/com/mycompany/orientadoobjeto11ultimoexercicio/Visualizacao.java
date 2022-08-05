
package com.mycompany.orientadoobjeto11ultimoexercicio;

public class Visualizacao {
    //atributos com agregação
    private Aluno espectador;
    private Video filme;
    
    //metodo contrutor
    public Visualizacao(Aluno espectador, Video filme) {    
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }

    //metodos especiais
    public Aluno getEspectador() {
        return espectador;
    }

    public void setEspectador(Aluno espectador) {
        this.espectador = espectador;
    }

    public Video getVideo() {
        return filme;
    }

    public void setVideo(Video filme) {
        this.filme = filme;
    }
    
    //metodos de sobrecarga
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    public void avaliar(float porcentagem){
        int tot = 0;
        if (porcentagem <=20) {
            tot = 3;
        } else if (porcentagem <= 50) {
            tot = 5;
        } else if (porcentagem < 90) {
            tot = 8;
        } else if (porcentagem >=90) {
            tot = 10;
        } else {
        }
        this.filme.setAvaliacao(tot);
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
}
