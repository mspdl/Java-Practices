/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author Morgan
 */
public class Caneta {
    
    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampada;
    
    void status (){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
        System.out.println("Está tampada? " + this.tampada);
    }
    
    void rabiscar(){
        if (this.tampada) {
            System.out.println("Não pode escrever com a caneta tampada");
        } else {
            System.out.println("Rabiscando...");
        }
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar (){
        this.tampada = false;        
    }
            
}
