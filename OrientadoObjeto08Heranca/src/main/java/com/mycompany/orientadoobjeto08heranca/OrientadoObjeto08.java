
package com.mycompany.orientadoobjeto08heranca;

public class OrientadoObjeto08 {
  
    public static void main(String[] args) {
       
        Visitante v = new Visitante();
        Aluno a = new Aluno();
        Professor pr = new Professor();
        Funcionario f = new Funcionario();
        Bolsista b = new Bolsista();
        
        v.setNome("Maria");
        a.setNome("Pedro");
        pr.setNome("Claudio");
        f.setNome("Fabiana");
        b.setNome("Jair");
        
        v.setIdade(35);
        a.setIdade(23);
        pr.setIdade(45);
        f.setIdade(35);
        b.setIdade(19);
        
        v.setSexo("F");
        a.setSexo("M");
        pr.setSexo("M");
        f.setSexo("F");
        b.setSexo("M");
        
        
        a.setCurso("Informaticaa");
        pr.setSalario(2500.50f);
        f.setSetor("estoque");
        
        a.pagarMensalidade();
        b.pagarMensalidade();
        
        System.out.println(v.toString());
        System.out.println(a.toString());
        System.out.println(pr.toString());
        System.out.println(f.toString());
        System.out.println(b.toString());
        System.out.println(v.toString());
        
        
    }
}
