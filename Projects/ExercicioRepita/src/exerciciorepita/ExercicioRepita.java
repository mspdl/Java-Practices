/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Morgan
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Olá Mundo","Boas vindas",JOptionPane.ERROR_MESSAGE);
        int numero = 0;
        int soma = 0;
        int cont = 0;
        int contPares = 0;
        int contImpares = 0; 
        int contAcimaDe100 = 0;
        float media = 0;
        do{
             numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: \n(0 para sair)"));
             soma += numero;
             if (numero % 2 == 0){
                 contPares++;
             } else {
                 contImpares++;
             }
             if (numero > 100){
                 contAcimaDe100++;
             }
             cont++;
        } while (numero != 0);
        media = soma/cont;
        JOptionPane.showMessageDialog(null, 
                "<html><h2>Resultado Final</h2>" +
                "<hr>" + 
                "Números informados: " + cont + "<br>" +
                "Soma total: " + soma + "<br>" +
                "Total de pares: " + contPares + "<br>" +
                "Total de ímpares: " + contImpares + "<br>" +
                "Acima de 100: " + contAcimaDe100 + "<br>" +
                "Média: " + media
                ,"Resultado",JOptionPane.WARNING_MESSAGE);
    }
    
}
