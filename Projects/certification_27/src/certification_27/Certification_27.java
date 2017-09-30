/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certification_27;

/**
 *
 * @author Morgan
 */
public class Certification_27 {

    public static boolean mTrue (){
        System.out.println("Método verdadeiro");
        return true;
    }
    
    public static boolean mFalse(){
        System.out.println("Método falso");
        return false;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("1 == 1 & 1 > 2 ? " + (1 == 1 & 1 > 2));
        System.out.println("1 == 1 | 1 > 2 ? " + (1 == 1 | 1 > 2));
        System.out.println("1 != 1 | 5 > 2 ? " + (1 != 1 | 5 > 2));
        System.out.println("1 != 1 ^ 5 > 2 ? " + (1 != 1 ^ 5 > 2));     // se tiver dois iguais da false
                                                                        // se tiver dois diferentes da true
        System.out.println("!(1 == 1) ? " + !(1 == 1));
        System.out.println("!(1 != 1) ? " + !(1 != 1));
        // os duplos && e || servem para o compilador saber que se a primeira 
        // expressão já resolve a primeira expressão, se servi ele ignora o resto
        // por exemplo:
        System.out.println("1 != 1 && 10 > 2 ? " + (1 != 1 && 10 > 2)); // o compilador já sabe que a primeira expressão
                                                                        // vai dar false, então ele já ignora a segunda
                                                                        // porque a false E qualquer coisa é false
        System.out.println("1 == 1 || 2 > 1 ? " + (1 == 1 || 2 > 1));   // aqui o compilador ignora a segunda expressão por causa do OU
                                                                        // qualquer coisa com true no caso do OU é true
        System.out.println(mFalse() && mTrue()); // quando é apenas um & ele roda a segunda expressão
                                                                    // mesmo a primeira sendo false
        System.out.println(mTrue() && mFalse());
        
        int i = 10;
        System.out.println(i == 10 && i++ == 10);
        System.out.println(i);
    }
    
}
