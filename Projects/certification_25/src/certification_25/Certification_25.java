/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certification_25;

/**
 *
 * @author Morgan
 */
public class Certification_25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int oito = 8;
        int dois = 2;
        
        int dez = oito + dois;
        int seis = oito - dois;
        int dezesseis = oito * dois;
        int quatro = oito / dois;
        int zero = oito % dois;
        
        System.out.println(oito+ " + " +dois+ " = " +dez);
        System.out.println(oito+ " - " +dois+ " = " +seis);
        System.out.println(oito+ " * " +dois+ " = " +dezesseis);
        System.out.println(oito+ " / " +dois+ " = " +quatro);
        System.out.println(oito+ " % " +dois+ " = " +zero);
        
        // em atribuições, um tipo menor não poder receber um tipo maior, pois perde precisão 
        // mas dentro de uma operação isso é possível
        // por exemplo:
        double d1 = 2;
        int i1 = 2;
        // int i2 = d1 + 1; // complia, mas da erro, não funciona
        System.out.println(d1 + i1); // fuciona
        byte b1 = 2;
        long  l1 = 2;
        int i3 = i1 + b1; // i1 eh int e b1 eh byte, n2 eh o maior tipo e eh o mesmo do n5
        long l2 = i3 + i3; // l1 e i3 sao int, int eh menor do que long
        
        // divisao por 0
        // somente numeros reais sao divisiveis por 0, inteiros nao sao
        // int n1 = 1 / 0; // erro em execução
        // double n2 = 1 /0 ; --> erro em execução
        
        
        double n2 = 1.0 / 0 ;
        double n3 = -1.0 / 0;
        System.out.println("");
        // System.out.println("inteiro dividido por zero: "+ (1/0)); --> erro em execução
        System.out.println("real dividido por zero: " + n2);
        // System.out.println("inteiro divido por zero: " + (1/0)); //--> erro em execução
        System.out.println("real dividido por zero: " + (1.0/0));
        System.out.println("");
        
        System.out.println("dois infinities positivos sendo somados: " + (n2 + (1.0 / 0)));
        System.out.println("dois infinities positivos sendo diminuidos: " + (n2 - (1.0 / 0)));
        System.out.println("dois infinities positivos sendo multiplicados: " + (n2 * (1.0 / 0)));
        System.out.println("dois infinities positivos sendo divididos: " + (n2 / (1.0 / 0)));
        System.out.println("dois infinities positivos calculando o resto da divisao: " + (n2 % (1.0 / 0)));
        System.out.println("");
        
        System.out.println("um infinity positivo e um negativo sendo somados: " + (n2 + n3));
        System.out.println("um infinity positivo e um negativo sendo diminuidos: " + (n2 - n3));
        System.out.println("um infinity positivo e um negativo sendo multiplicados: " + (n2 * n3));
        System.out.println("um infinity positivo e um negativo sendo divididos: " + (n2 / n3));
        System.out.println("um infinity positivo e um negativo calculando o resto da divisao: " + (n2 % n3));
    }
    
}
