
package com.mycompany.orientadoobjeto07exercicio;

public class Livro implements Publicacao {
   //atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //metodos especias
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    //metodo construtor
    public Livro(String titulo, String autor, int totPaginas,Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
    }
    
    //metodo
    public String detalhes(){
        return "Livro{" + "titulo=" + titulo + "\n, autor=" + autor + "\n, totPaginas=" + totPaginas + "\n, pagAtual=" 
                + pagAtual + "\n, aberto=" + aberto + "\n, leitor=" + leitor.getNome() +
                "\n, idade=" + leitor.getIdade() +"\n, sexo" + leitor.getSexo() + '}';
        
    }
   
    //metodos subscrito da interface
    @Override
    public void abrir() {
     this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear() {
        
        for(int i = 1; i <= this.getTotPaginas(); i++ ){
            this.setPagAtual(this.getPagAtual() + 1);
        }
    }

    @Override
    public void avancarPagina() {
        this.setPagAtual(this.getPagAtual() + 1);
        
    }

    @Override
    public void voltarPagina() {
        this.setPagAtual(this.getPagAtual() - 1);
       
    }
    
}
