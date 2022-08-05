
package com.mycompany.orientadoobjetobanco;

public class contaBanco {
    
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;   
      
   //Metedos   
    public void estadoAtual(){
        System.out.println("O numero da conta:" + this.getnumConta());
        System.out.println("O tipo da conta:" + this.getTipo());
        System.out.println("O dono da conta:" + this.getDono());
        System.out.println("O saldo da conta:" + this.getSaldo());
        System.out.println("O status da conta:" + this.getStatus());
    }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        //quando abrair um conta corrente quero q o cliente ganhe 50R$
        if (this.getTipo() == "cc") {
            this.setSaldo(50);
            System.out.println("Sua conta corrente foi aberta com sucesso!");
            //quando abrair um conta poupança quero q o cliente ganhe 50R$
        } else if(this.getTipo() == "cp"){
             this.setSaldo(150);
             System.out.println("Sua conta poupança foi aberta com sucesso!");
        }else{
            System.out.println("Nãp foi possivel fazer a operação");
        }
        
    }
    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro,não pode ser fechada");
        } else if(this.getSaldo() < 0) {
            System.out.println("Conta com debito negativo, não pode ser fechada");
        }else{
            this.setStatus(false);
            System.out.println("Sua conta foi fechda com sucesso!");
        }
    }
    public void depositar(float v){
        
        if (this.getStatus() == true && v > 0 ) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito feito com sucesso!");
        } else {
            System.out.println("Sua conta esta fechada ou não é possivel depositar o valor desejado!");
        }
    }
    public void sacar(float v){
        if(this.getStatus() == true && v < this.getSaldo()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Seu saque foi efetuado com sucesso!");
        }else{
            System.out.println("Sua conta esta fechada ou vc não possue saldo suficiente para realizar essa solicitação!");
        }
    }
    public void pagarMensal(){
      
        int m = 0;
        if (this.getStatus() == true && this.getTipo() == "cc" && this.getSaldo() > m) {
            m = 40;    this.setSaldo(this.getSaldo() - m); 
            System.out.println("Pagamento da mensalidade de 40 reias feita com sucesso!");
        } else if(this.getStatus() == true && this.getTipo() == "cp" && this.getSaldo() > m){
            m = 20;   this.setSaldo(this.getSaldo() - m);
            System.out.println("Pagamento da mensalidade de 20 reias feita com sucesso!");
        }else{
            System.out.println("Conta fechada ou saldo insuficiente! ");
        }
    }
    public int getnumConta(){
        return this.numConta;
    }
    public void setnumConta(int nc){
        this.numConta = nc;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getDono(){
        return this.dono;
    }
    public void setDono(String d){
        this.dono = d;
    }
     public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float s){
        this.saldo = s;
    }
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean sta){
        this.status = sta;
    }
    
    //metodo contrutor
    public contaBanco (float s,boolean st){
        this.saldo = s;
        this.status = st;
    }
}
