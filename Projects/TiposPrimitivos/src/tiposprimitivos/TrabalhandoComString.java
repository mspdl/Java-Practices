/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

/**
 *
 * @author Morgan
 */
public class TrabalhandoComString {
    
    public static void main(String[] args) {
        String nome1 = "Java";
        String nome2 = new String("Java");
        char [] nome3 = new char[]{'J','a','v','a'};
        String nome4 = new String(nome3);
        StringBuilder nome5 = new StringBuilder("Java");
        String nome6 = new String(nome5);
        String nome7 = null;
        String nome8 = "Meu nome é:" + " " + "Morgan Espindola"; 
        String nome9 = "java"; // a string não pode ser alterada,
        nome9 = nome9.toUpperCase(); //esse método deixa em maisculo, mas precisa atribuir o valor para a variavel
        nome9 = nome9.toLowerCase(); //esse método deixa em minusculo, mas precisa atribuir o valor para a variavel
        String nome10 = "JAVA";
        String nome11 = "joao e maria";
        
        System.out.println("Forma 01: " + nome1);
        System.out.println("Forma 02: " + nome2);
        System.out.println("Forma 03: " + nome3);
        System.out.println("Forma 04: " + nome4);
        System.out.println("Forma 05: " + nome5);
        System.out.println("Forma 06: " + nome6);
        System.out.println("Forma 07: " + nome7);
        System.out.println("Forma 08: " + nome8 + null);
        System.out.println("Olá! Meu nome é Morgan e tenho " + 27 + " anos."); // é possível concatenar números
        System.out.println("Olá! Meu nome é Morgan e tenho " + 2 + 7 + " anos."); // quando separados, eles são concatanedos
        System.out.println(2 + 7 + " é a minha idade. Mas tenho " + 2 + 7 + " anos."); // no inicio da string eles são somados e não concataneados
        System.out.println("Forma 09: " + nome9);
        int pos = 1;
        System.out.println("Retorna o valor de " + nome9+ " na posição " + pos
                + ": " + nome9.charAt(pos)); // retorna caracter na posição do
                                             //parametro, se o valor do parametro for maior que o tamanho da string, vai dar erro códico
        System.out.println("Informa o tamanho de " + nome9 + ": " + nome9.length()); //retorna o tamanho da string
        System.out.println("Tá vázio? " + "".isEmpty());
        System.out.println("Morgan, tá vazio? " + "Morgan".isEmpty());
        String fodase = "Ah vai se fuder";
        System.out.println(fodase.trim()); //trim tira os espaços, mas não tá funcionando essa bosta
        System.out.println(nome10.replace("JA", "LA")); // procura e substitui trechos de uma string
        System.out.println(nome10.substring(1,4)); // retorna um caracter ou intervalo de uma string
        System.out.println(nome10);
        System.out.println("Morgan = morgan? (com ignorecase): " + "Morgan".equalsIgnoreCase("morgan"));
        System.out.println("Morgan = morgan? " + "Morgan".equals("morgan"));
        System.out.println("a".compareTo("b")); //retorna negativo
        System.out.println("d".compareTo("b")); // retorna positivo
        System.out.println("a".compareToIgnoreCase("A")); // retorna 0
        System.out.println("a".compareTo("A")); // retrona positivo
        System.out.println(nome11.indexOf("a")); // retorna a posição da primeira busca, da esquerda para a direita
        System.out.println(nome11.lastIndexOf("d")); // retorna a posição da ultima busca, da esquerda para a direita
        System.out.println(nome11.indexOf("a",3)); // retorna a posição da primeira busca depois de um parametro, da esquerda para a direita
        System.out.println(nome11.startsWith("joao")); //verifica se a string inicia com o parametro
        System.out.println(nome11.endsWith("maria")); //verifica se a string termina com o paramentro
    }
    
}
