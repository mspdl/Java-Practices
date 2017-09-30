/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certification_17;

/**
 *
 * @author Morgan
 */
public class Variavel {
    
    int valor;
    
    public static void main (String args[]){
        
        Variavel referencia = new Variavel();
        referencia.valor = 10;
        Variavel referencia2 = referencia;
        Variavel referencia3 = referencia2;
        
        referencia.valor++;
        
        System.out.println(referencia.valor);
        System.out.println(referencia2.valor);
        System.out.println(referencia3.valor);
        
        int idade = 21;
        int idade2 = idade;
        
        idade++;
        
        System.out.println(idade);
        System.out.println(idade2);
        
    }
    
}
