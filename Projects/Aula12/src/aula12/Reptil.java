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
public class Reptil extends Animal {
    
    private String corEscama;

    
    // ----- Métodos de sobreposição
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo insetos e vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de réptil");
    }
    
    
    // ----- Getters e Setters
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
}
