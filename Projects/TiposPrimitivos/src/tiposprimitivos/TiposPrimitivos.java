/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Morgan
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Informe o nome: ");
        Scanner teclado = new Scanner (System.in);
        String nome = teclado.nextLine();
        System.out.print("Informe a nota de " + nome + ": ");
        float nota = teclado.nextFloat();
        
        System.out.println("A nota de " + nome + " é " + nota);
    }
    
}
