/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certification_24;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Morgan
 */
public class Certification_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 0;
        int outroNumero = 15;
        numero  = numero + outroNumero; 
        System.out.println(numero);
        numero += outroNumero; // essa operacao tem o mesmo resultado da acima
        System.out.println(numero);
        
        // Não pode fazer
        // double d = 10;
        // float f = d;
        // long l = d ou f;
        // int i = d ou f ou l;
        // short s = d ou f ou l ou i;
        // byte b = d ou f ou l ou i s; (somente = s)
        
        // Pode ser feito
        byte b = 10;
        short s = b;
        int i = s; // ou i=b
        long l = i; // ou l=s ou l=b
        float f = l; // ou f=i ou l=s ou l=b
        double d = f; // ou d=l ou d=i ou d=s ou d=b
        
        // O char pode receber qualquer inteiro, desde que seja da tabela ASCII
        // Char não receber valor de variaveis de numeros
        char h1 = 65; // char com inteiro
        char h2 = 'A'; // char com caracter
        System.out.println("char = 65: " + h1);
        System.out.println("char = A: " + h2);
        
        // Char pode ser atribuido para qualquer numero
        int i1 = h1;
        long l1 = h1;
        float f1 = h2;
        
        System.out.println("int:"+ i + " long:" + l + " float:" + f);
        
        // referencias de objetos podem ser atribuidas para casos onde o mais
            // abrangente receba o menos abrangente
        ArrayList<String> lista = new ArrayList<String>();
        List<String>lista2 = lista;
        
    }
    
}
