/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipoporpernas;

import java.util.Scanner;

/**
 *
 * @author Morgan
 */
public class TipoPorPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        String tipo;
        
        System.out.print("Informe a quantidade de pernas: ");
        int pernas = t.nextInt();
        switch (pernas){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6: case 8:
                tipo = "Aracnídeo";
                break;
            case 100:
                tipo = "Centopéia";
                break;
            default:
                tipo = "ET";
        }
        
        System.out.println("Este(a) é um(a) " + tipo);
        
    }
}
