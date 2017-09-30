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
public class Aula12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Estanciando objetos das classes de animais
//        Animal n = new Animal();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        
        
        // Declarando, configurando e exibindo um Mamífero
        System.out.println("--- Mamífero ----");
        m.setPeso(85.3);
        m.setIdade(2);
        m.setMembros(4);
        m.setCorPelo("Preto");
        m.locomover();
        m.alimentar();
        m.emitirSom();
        System.out.println("");
        
        // Declarando, configurando e exibindo um Peixe
        System.out.println("--- Peixe ----");
        p.setPeso(0.35);
        p.setIdade(1);
        p.setMembros(0);
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolha();
        System.out.println("");
        
        // Declarando, configurando e exibindo uma Ave
        System.out.println("--- Ave ---");
        a.setPeso(0.89);
        a.setIdade(2);
        a.setMembros(2);
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();
        System.out.println("");
        
        // Declarando, configurando e exibindo um Canguru
        System.out.println("--- Canguru ----");
        c.setPeso(55.3);
        c.setIdade(3);
        c.setMembros(4);
        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.usarBolsa();
        System.out.println("");
        
        // Declarando, configurando e exibindo um Cachorro
        System.out.println("--- Cachorro ---");
        k.setPeso(3.94);
        k.setIdade(5);
        k.setMembros(4);
        k.locomover();
        k.alimentar();
        k.emitirSom();
        k.abanarRabo();
        System.out.println("");
        
        // Declarando, configurando e exibindo uma Cobra
        System.out.println("--- Cobra ---");
        j.setPeso(5.6);
        j.setPeso(1);
        j.setMembros(0);
        j.locomover();
        j.alimentar();
        j.emitirSom();
        System.out.println("");
    }
    
}
