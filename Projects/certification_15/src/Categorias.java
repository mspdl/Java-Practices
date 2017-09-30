/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Morgan
 */
public class Categorias {
    
    // #01 Categoria numérica
    byte b = 127;
    short s = 32767;
    int i = 2147483647;
    long l = 9223372036854775807l; // só diferencia de int se tiver 'l', 
                                   // maisculo ou minusculo, acima de 10 digitos
                                   // é obrigatório ter o 'l'
    // Como representar o número 267 em outras bases numéricas
    int ii = 0b100001011;
    int iii = 077;
    int iv = 0x10b;
    int v = 267;
    
    // #02 Categoria Ponto flutuante
        // pode ser usado '_' no lugar de '.', mas não pode usar '_' no inicio 
        // ou final do valor, somente entre números (no hexadecial A à F conta)
    float f = 3.40282347e+38f; // só diferencia de double se tiver 'f'
                               // pode ser maisculo ou minusculo
    double d = 1.7976931348623157e+308;
    
    // #03 Categoria Caracter
    char h = '6';
    char h1 = '\u0391';

    // #04 Categoria Boolean
    boolean boof = false;
    boolean boot = true;
    
    public static void main (String... x){
        Categorias cat = new Categorias();
        System.out.println("byte: " + cat.b);
        System.out.println("short: " + cat.s);
        System.out.println("int: " + cat.i);
        System.out.println("long: " + cat.l);
        System.out.println("int binário: " + cat.ii);
        System.out.println("int octal: " + cat.iii);
        System.out.println("int hexadecimal: " + cat.iv);
        System.out.println("int decimal: " + cat.v);
        System.out.println("char: " + cat.h);
        System.out.println("char: " + cat.h1);
        System.out.println("boolean false: " + cat.boof);
        System.out.println("boolean true: " + cat.boot);
        
    }
}
