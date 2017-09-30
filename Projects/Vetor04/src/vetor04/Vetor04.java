/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor04;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Morgan
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num[] = {4,8,3,0,15};
        Arrays.sort(num);
        System.out.println("Lista de elementos da lista: ");
        for(int i = 0; i < num.length; i++){
            System.out.println("id " + i + " = valor " + num[i]);
        }
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um número da lista: ");
        int pesquisa = teclado.nextInt();
        int pos = Arrays.binarySearch(num, pesquisa);
        if (pos >= 0) {
            System.out.println("Número informado está na posição " + pos);
        } else {
            System.out.println("Número não encontrado");
        }
    }
    
}
