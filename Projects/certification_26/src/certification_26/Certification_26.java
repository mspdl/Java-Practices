/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certification_26;

/**
 *
 * @author Morgan
 */
public class Certification_26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("1 == 1 ? " + (1 == 1));
        System.out.println("1 != 1 ? " + (1 != 1));
        System.out.println("2 < 1 ? " + (2 < 1));
        System.out.println("2 > 1 ? " + (2 > 1));
        System.out.println("1 >= 1 ? " + (1 >=1));
        System.out.println("2 >= 1 ? " + (2 >= 1));
        System.out.println("2 <= 1 ? " + (2 <= 1));
        // A comparação disconsidera o tipo de variavel e compara apenas o valor
        System.out.println("1 == 1.0 ? " + (1 == 1.0));
        System.out.println("1.0f == 1.0d ? " + (1.0f == 1.0d));
        System.out.println("1.0f == 1l ? " + (1.0f == 1l));
        
        // Valores não numéricos só podem ser conparados com igual ou diferente
            // obviamente eles não podem ser medidos como menor ou maior
        String nome1 = new String();
        String nome2 = new String();
        
        System.out.println("nome1 = nome2 ? " + (nome1 == nome2));
        System.out.println("nome1.equals(nome2) ? " + nome1.equals(nome2));
        
        // System.out.println(true == 1); -> booleano não pode ser comparado com numeros
        
        System.out.println("a > 1 ? " + ('a' > 1)); // a na tabela ascii é 65, que é maior que 1
        
        int a = 10;
        System.out.println("a = 25 ? " + (a = 25));
        System.out.println("a == 25 ? " + (a == 25));
        
        System.out.println("1 == (100.0/100) ? " + (1 == (100.0/100)));
    }
    
}
