
package com.mycompany.orientadoobjeto08heranca;

//para fazer a classe professor virar filha da classe pessoa vou usar extends
public class Professor extends Pessoa{
    //atributos
    private String especialidade;
    private float salario;
    
    //metodos especiais
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    //metodos
    public void receberAumento(int v){
        this.setSalario(this.getSalario() + v);
    }
}
