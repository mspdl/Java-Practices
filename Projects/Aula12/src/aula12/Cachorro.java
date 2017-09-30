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
public class Cachorro extends Mamifero {
    
    public void enterrarOsso(){
        System.out.println("Enterrando o osso");
    }
    
    public void abanarRabo(){
        System.out.println("Abanando o rabo");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Au! Au! Au!");
    }
    
}
