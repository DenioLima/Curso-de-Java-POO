
package com.mycompany.orientadoobjeto11ultimoexercicio;

public class OrientadoObjeto11UltimoExercicio {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula de Banco de dados");
        v[2] = new Video("Aula 10 de HTML5");
        
        Aluno a[] = new Aluno[2];
        a[0] = new Aluno("Denio",33,"M","abc123");
        a[1] = new Aluno("Diego",26,"M","def456");
        
        
        System.out.println("----------------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("----------------------------------");
        System.out.println(a[1].toString());
        System.out.println(a[0].toString());
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(a[0],v[0]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualizacao(a[1],v[2]);
        vis[1].avaliar(15.6f);
        System.out.println(vis[1].toString());
        
    }
   
}
