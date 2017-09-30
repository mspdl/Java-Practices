/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor02;

import java.util.Scanner;

/**
 *
 * @author Morgan
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                
        String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul",
            "Ago","Set","Out","Nov","Dez"};
        int dias[] = {31,28,31,30,31,30,31,31,30,31,30,31,30,31};
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o ano: ");
        float ano = teclado.nextInt();
        
        if ((ano % 4 == 0) && ((ano % 100 == 0) && (ano % 400 == 0))) {
            System.out.println("Ano bissexto");
            dias[1] = 29;
        } else {
            System.out.println("Ano não bissexto");
        }
        
        for (int i = 0; i < mes.length; i++) {
            System.out.println("O mês de " + mes[i] + " tem "
                    + dias[i] + " dias ao todo.");
        }
        
    }    

}
