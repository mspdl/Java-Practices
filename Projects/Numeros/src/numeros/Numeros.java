/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author Morgan
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0;
        String resposta = "";
        Scanner t = new Scanner(System.in);
        
        do{
            System.out.print("Informe um numero: ");
            n = t.nextInt();
            s += n;
            System.out.print("Quer continuar? [S/N]: ");
            resposta = t.next();
        } while (resposta.equals("S") || resposta.equals("s"));
        
        System.out.println("Soma total: " + s);
    }
    
}
