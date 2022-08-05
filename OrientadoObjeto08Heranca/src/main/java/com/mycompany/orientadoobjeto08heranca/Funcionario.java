
package com.mycompany.orientadoobjeto08heranca;

//para fazer a classe funcionario virar filha da classe pessoa vou usar extends
public class Funcionario extends Pessoa{
    //atributos
    private String setor;
    private boolean trabalhando;
    
    //metodos especiais

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    //metodos
    public void mudarTrabalho(){
        this.setTrabalhando(true);
    }
    
}
