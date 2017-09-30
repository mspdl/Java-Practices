/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certification_28;

/**
 *
 * @author Morgan
 */
public class Certification_28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int i = 5;
        System.out.println("Pós-incrementos"); // soma só depois de executar a linha
        System.out.println("i++ = " + i++); // i = 5
        System.out.println("i = " + i); // i = 6
        System.out.println("i-- = " + i--); // i = 6
        System.out.println("i = " + i); // i = 5
        
        System.out.println("");
        
        System.out.println("Pré-incrementos");
        System.out.println("++i = " + ++i); // i = 6
        System.out.println("i = " + i); // i = 6
        System.out.println("--i = " + --i); // i = 5
        System.out.println("i = " + i); // i = 5
        
        System.out.println("");
        
        int b = 10;
        System.out.println("b = " + b); // b = 10
        System.out.println("b += 20 = " + (b += 20)); // ou b = b + 20
        System.out.println("b = " + b); // b = 30
        System.out.println("b -= 15 = " + (b -= 15)); // ou b = b - 15
        System.out.println("b = " + b); // b = 15
        System.out.println("b *= 3 = " + (b *= 3)); // ou b = b * 3
        System.out.println("b = " + b); // b = 45
        
        System.out.println("");
        
        byte c = 5;
        System.out.println("c = " + c);
        System.out.println("c += 10 = " + (c += 10)); // se eu colocar c = c + 10 da erro
                                                      // no caso, o compilador aceita e faz a conversão pra int
        System.out.println("c += 200 = " + (c += 200)); // o byte é de -127 à 127, se passar disso da um numero maluco
        
        int d = 10;
        System.out.println("d += ++d + d + ++d = " + (d += ++d + d + ++d)); // d = 10 + 11 + 11 + 12
    }
    
}
