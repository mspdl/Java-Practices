/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author Morgan
 */
public class Conta {
    
    private int numConta;
    private String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    // ------- Construtor -------
    public Conta() {
    }
    
    // tipo de conta só aceita conta corrente ou conta poupança, pode ser CC ou CP
    // abrir conta = dizer o tipo, mudar status para aberta, 
    // se for corrente + 50, se for poupança + 150
    // fecharConta: conta não pode ter saldo nem débito, ou seja saldo = 0
    // depositar: a conta tem que estar aberta
    // sacar: a conta tem que estar aberta e o saldo tem q ser menor ou igual ao saque
    // pagarMensal: CC = R$ 12,00 CP = 20,00
    
    public void abrirConta(String t){
        if (t.equals("CC") || t.equals("CP")) {
            if (t.equals("CC")) {
                this.setTipo("CC");
                this.setSaldo(50);
            }else if (t.equals("CP")) {
                this.setTipo("CP");
                this.setSaldo(150);
            }
            this.setStatus(true);
            System.out.println("Conta de "+this.getDono()+" aberta com sucesso!");
        }else{
            System.out.println("Tipo de conta de "+this.getDono()+" está incorreto.");
        }
        System.out.println("");
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta de "+this.getDono()+" contém dinheiro, retire para fechar a conta!");
        }else if (this.getSaldo() <0) {
            System.out.println("Conta de "+this.getDono()+" em débito, quite para fechar a conta");
        }else{
            this.setStatus(false);
            System.out.println("Conta de "+this.getDono()+" fechada com sucesso.");
        }
        System.out.println("");
    }
    
    public void depositar(double v){
        if (this.getStatus() == false){
            System.out.println("Não é possível depositar, a conta de "+this.getDono()+" está fechada!");
        }else{
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Você depositou R$ " + v + " na conta de " + this.getDono());
            System.out.println("O saldo de " + this.getDono() + " agora é: R$ " + this.getSaldo());
        }
        System.out.println("");
    }
    
    public void sacar(double v){
        if (this.getStatus() == false){
            System.out.println("Não é possível sacar, pois a conta "+this.getDono()+" está fechada!");
        }else if(this.getSaldo() < v){
            System.out.println("Saldo insuficiente na conta de "+this.getDono()+".");
        }else{
            this.setSaldo(this.getSaldo() - v);;
            System.out.println("Você sacou R$ " + v + " da conta de " + this.getDono());
            System.out.println("O saldo de " + this.getDono() + " agora é: " + this.getSaldo());
        }
        System.out.println("");
    }
    
    public void pagarMensal(){
        double v = 0;
        if (this.getTipo().equals("CC") || this.getTipo().equals("CP")) {
            if (this.getTipo().equals("CC")) {
                v = 12;
            }else {
                v = 20;
            }
        }else{
            System.out.println("Tipo de conta de "+this.getDono()+" incorreta.");
        }
        
        if (this.getStatus() == true) {
            if (this.getSaldo() > v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade de R$ " + v + " cobrada de " + this.getDono());
                System.out.println("Saldo atual de " + this.getDono() + ": R$ " + this.getSaldo());
            } else {
                System.out.println("Saldo insuficiente, não pode cobrar mensalidade.");
            }
            
        } else { 
            System.out.println("Conta fechada, não pode cobrar mensalidade.");
        }
        System.out.println("");
    }
    
    // ------- Mostrar status da conta -------
    public void status(){
        System.out.println("---------------------");
        System.out.println("Número: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("");
    }
    
    // ------- Getters e Setters -------
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
