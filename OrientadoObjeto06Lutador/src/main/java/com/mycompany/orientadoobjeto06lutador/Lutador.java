
package com.mycompany.orientadoobjeto06lutador;


public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitoria;
    private int empate;
    private int derrota;
    
    //metodo contrutor
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitoria, int empate, int derrota) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitoria = vitoria;
        this.empate = empate;
        this.derrota = derrota;
    }
    
    //metodos especias
    public String getCategoria() {
        return categoria;
    }
    
    public void setCategoria() {
        if (this.getPeso() < 52) {
            this.categoria = "Invalido";
        } else if (this.getPeso() > 52 && this.getPeso() <= 70.5) {
            this.categoria = "Leve";
        } else if (this.getPeso() > 75.5 && this.getPeso() <= 90.5 ) {
            this.categoria = "Medio";
        } else if (this.getPeso() > 90.5 &&this.getPeso() <= 110.5 ) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Invalido";
        }
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }
    
    //metdos
    public void apresentar(){
        System.out.println("------------------------------------------------");
        System.out.println("Lutador " + this.getNome() + " diretamente de " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " anos e com " + this.getAltura() + "m");
        System.out.println("Pesando " + this.getPeso() + "k");
        System.out.println(this.getVitoria() + " vitorias");
        System.out.println(this.getEmpate() + " empates");
        System.out.println(this.getDerrota() + " derrotas");
        System.out.println("-----------------------------------------------");
    }
    public void status(){
        System.out.println(this.getNome() + " peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitoria() + " vezes");
        System.out.println("Perdeu " + this.getDerrota() + " vezes");
        System.out.println("Empatou " + this.getEmpate() + " vezes");
        System.out.println("---------------------------------------");
    }
    public void ganharLuta(){
        this.setVitoria(this.getVitoria() + 1);
    }
    public void empatarLuta(){
        this.setEmpate(this.getEmpate() + 1);
    }
    public void perderLuta(){
        this.setDerrota(this.getDerrota() - 1);
    }
    
}
