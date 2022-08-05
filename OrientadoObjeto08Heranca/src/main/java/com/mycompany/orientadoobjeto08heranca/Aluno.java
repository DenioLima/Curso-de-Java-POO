
package com.mycompany.orientadoobjeto08heranca;

//para fazer a classe aluno virar filha da classe pessoa vou usar extends
public class Aluno extends Pessoa{
    //atributo
    private int matricula;
    private String curso;
    
    //metodos especiais
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    //metodos
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno " + this.getNome());
    }
}
