/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author Morgan
 */
public class Peixe extends Animal {
    
    private String corEscama;
    
    
    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }
    
    
    // ----- Métodos de sobreposição
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo outros seres aquaticos");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }
    
    
    // ----- Getters e Setters
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
}
