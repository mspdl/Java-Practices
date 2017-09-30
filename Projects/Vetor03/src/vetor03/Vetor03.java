/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor03;

import java.util.Arrays;

/**
 *
 * @author Morgan
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num[] = {4,8,3,0,15};
        Arrays.sort(num);
        System.out.println("Lista de elementos da lista: ");
        for(int valor: num){
            System.out.println(valor);
        }
        
    }
    
}
