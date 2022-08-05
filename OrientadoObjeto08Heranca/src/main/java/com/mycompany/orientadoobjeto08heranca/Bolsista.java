
package com.mycompany.orientadoobjeto08heranca;

//para fazer a classe bolsista virar filha da classe aluno vou usar extends
public class Bolsista extends Aluno {
    //atributo
    private float bolsa;
    
    //metetodos especiais
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    //metodo
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.getNome());
    }
    
    //metodo sobreposto
    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome()+ " e bolsista,pagamento com desconto!");
    }
    
}
