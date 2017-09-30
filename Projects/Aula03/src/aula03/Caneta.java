/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

/**
 *
 * @author Morgan
 */
public class Caneta {
    
    public String modelo;
    public String cor;
    private double ponta;
    protected int carga;
    private boolean tampada;
    
    void status (){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Caneta cor " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
        System.out.println("Está tampada? " + this.tampada);
    }
    
    public void rabiscar(){
        if (this.tampada) {
            System.out.println("Não pode escrever com a caneta tampada");
        } else {
            System.out.println("Rabiscando...");
        }
    }
    
    public void pintar (){
        
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar (){
        this.tampada = false;        
    }
    
    public void escrever (String texto){
        if (this.tampada){
            System.out.println("Caneta está tampada, não dá para escrever assim!");
        }else{
            System.out.println(texto);
        }
    }
            
}
