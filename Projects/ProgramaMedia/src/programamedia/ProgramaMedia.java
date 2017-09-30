/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author Morgan
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        System.out.print("Primeira nota: ");
        float n1 = t.nextFloat();
        System.out.print("Segunda nota: ");
        float n2 = t.nextFloat();
        
        float media = (n1 + n2) / 2;
        
        System.out.println("Média: " + media);
        if (media >= 9){
            System.out.println("Parabéns!");
        }
    }
    
}
