
package com.mycompany.orientadoobjeto11ultimoexercicio;
    //A classe aluno vai ser filha da classe pessoa e para isso vou usa a palavra extends
public class Aluno extends Pessoa{
    //Atributos
    private String login;
    private int totAssistido;
    
    //metodo contrutor
    public Aluno(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
   
    //metodos
    public void viuMaisUm(){
        this.setTotAssistido(this.getTotAssistido() + 1);
    }
    //metodos especiais
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        //quero chamar tbm os dados do metodo toString da classe pesssoa, para isso vou usar dentro do metodo atual toString +super.toString()
        return "Aluno{"+ super.toString() + "login=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
}
