/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Morgan
 */
public class StringQueMuda {
    
    public static void main(String[] args) {
        
        String nome = "Jair";
        String cpf = "11111111111";
        
        StringBuffer sb1 = new StringBuffer(cpf); //065.910.139-46
        sb1.insert(3, '.');
        sb1.insert(7, '.');
        sb1.insert(11, '-');
        sb1.append(", este é o meu CPF");
        System.out.println(sb1.toString());
        
        StringBuffer sb2 = new StringBuffer(60);
        System.out.println(sb2);
        
        StringBuffer sb3 = new StringBuffer(sb1);
        sb3.append(" e o meu nome é ");
        sb3.append(nome);
        sb3.append('.');
        System.out.println(sb3);
        
        StringBuffer sb4 = new StringBuffer();
        sb4.append(sb3);
        sb4.delete(24, 28);
        sb4.insert(29, "de ");
        sb4.delete(31, 46);
        System.out.println(sb4);
        
        StringBuilder sb5 = new StringBuilder();
        sb5.append(new Pessoa());
        System.out.println(sb5);
        
        StringBuilder sb6 = new StringBuilder("morgan");
        sb6.reverse();
        System.out.println(sb6);
        
        StringBuilder sb7 = new StringBuilder("Certificação Java");
        System.out.println(sb7.substring(0,12));
        System.out.println(sb7.subSequence(13, 17));
        
        String sb8 = "Certificação Java";
        System.out.println(sb8.substring(0,12));
        System.out.println(sb8.subSequence(13, 17));
    }
    
}       
        
//        String strFinal = "";
//        long tStart = System.currentTimeMillis();
//        for (int i = 0; i < 100000; i ++) {
//            strFinal += "a";
//        }
//        long tEnd = System.currentTimeMillis();
//        long tResult = tEnd - tStart;
//        System.out.println("Tempo de Execução com operador '+' = " + tResult + "ms.");
//        
//        StringBuilder strBuilder = new StringBuilder();
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < 100000; i ++) {
//            strBuilder.append("a");
//        }
//        long end = System.currentTimeMillis();
//        long result = end - start;
//        System.out.println("Tempo de Exercução com StringBuilder = " + result + "ms.");
        

