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
public class Canguru extends Mamifero {
    
    public void usarBolsa(){
        System.out.println("Usando bolsa");
    }
    
    @Override
    public void locomover(){
        System.out.println("Saltando");
    }
    
}
