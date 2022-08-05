
package com.mycompany.orientadoobjeto07exercicio;

public class ProjetoLivro {
  
    public static void main(String[] args) {
        
        Pessoa p[] = new Pessoa[3];
        Livro l[] = new Livro[5];
        
        p[0] = new Pessoa("Denio",33,"M");
        p[1] = new Pessoa("Diego",28,"M");
        p[2] = new Pessoa("Lica",55,"F");
        
        l[0] = new Livro("A caminho da luz","Chico xavier",206,p[0]);
        l[1] = new Livro("Paulo e Estevao","Chico xavier",488,p[0]);
        l[2] = new Livro("O poder da cura","PE Reginaldo Manzotti",150,p[2]);
        l[3] = new Livro("Livro dos espiritos","Allan Kardec",358,p[1]);
        l[4] = new Livro("Uma breve historia do tempo","Stephen Hawking",256,p[0]);
        
        l[0].abrir();
        l[0].folhear();
        System.out.println(l[1].detalhes());
        
        System.out.println(l[3].detalhes());
    }
}
