/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote_interno;

/**
 *
 * @author Morgan
 */
public class Carro {
    
    public String nome;
    
    public void exibeVelocidade(){
        System.out.println("A velocidade de uma " + nome + " é de 380km/h");
    }
    
    public static void main (String... x){
        Carro c = new Carro();
        c.nome = "Ferrari";
        c.exibeVelocidade();
    }
    
}
