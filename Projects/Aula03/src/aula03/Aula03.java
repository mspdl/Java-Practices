/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

import java.util.Scanner;

/**
 *
 * @author Morgan
 */
public class Aula03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "azul";
        // c1.ponta = 0.5;
        c1.carga = 80;
        // c1.tampada = true;
        c1.destampar();
        
        c1.status();
        System.out.println("");
        c1.rabiscar();
        // Scanner teclado = new Scanner(System.in);
        // System.out.print("Digite a frase que a caneta vai escrever: ");
        // c1.escrever(teclado.next());
    }
    
}
