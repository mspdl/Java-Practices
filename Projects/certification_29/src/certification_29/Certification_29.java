/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certification_29;

import javax.swing.JOptionPane;

/**
 *
 * @author Morgan
 */
public class Certification_29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual é a sua idade?"));
        // String resultado = (idade < 18 || idade >= 65) ? "Seu voto é opcional." : "Seu voto é obrigatório.";
        String resultado = 
                (idade < 16) ? 
                    "Você ainda não pode votar." : 
                (idade < 18 || idade >= 65) ? 
                    "Seu voto é opcional." : 
                    "Seu voto é obrigatório."; 
        JOptionPane.showMessageDialog(null, resultado);
        System.out.println((idade < 16) ? "Você ainda não pode votar." : (idade < 18 || idade >= 65) ? idade : "Seu voto é obrigatório."); 
        JOptionPane.showMessageDialog(null, (idade < 16) ? "Você ainda não pode votar." : (idade < 18 || idade >= 65) ? idade : "Seu voto é obrigatório.");
        // é possível imprimir qualquer tipo de variavel e condicao dentro do
        // println e do showmessagedialog porque eles usam a class Object, que 
        // é universal do java e aceita qualquer coisa
        
        
    }
    
}
