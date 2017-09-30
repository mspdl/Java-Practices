/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voto;

import java.util.Scanner;

/**
 *
 * @author Morgan
 */
public class Voto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner t = new Scanner(System.in);
        System.out.print("Informe o ano de nascimento: ");
        int nasc = t.nextInt();
        int idade = 2017 - nasc;
        System.out.println("Idade: " + idade);
        if (idade < 0){
            System.out.println("Nem nasceu ainda pô!");
        }else{
            if(idade < 16){
                System.out.println("Ainda não pode votar");
            } else{
                if ((idade >= 16 && idade < 18) || (idade > 70)){
                    System.out.println("Voto é opcional");
                }else{
                    System.out.println("Voto obrigatório");
                }
            }
        }
    }
}
    
