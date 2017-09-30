/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certification_13;

class Carro{
    
}
public class Variavel {
    
    int age;
    byte b;
    long l;
    float f;
    double d;
    char ch;
    boolean boo;
    Carro car;
    String name;
    
    public static void main (String... x){
        
        Variavel c = new Variavel();
        System.out.println("Default values of variable types:");
        System.out.println("int: " + c.age);
        System.out.println("byte: " + c.b);
        System.out.println("long: " + c.l);
        System.out.println("float: " + c.f);
        System.out.println("double: " + c.d);
        System.out.println("char: " + c.ch + " <- here is a char");
        System.out.println("boolean: " + c.boo);
        System.out.println("Class: " + c.car); // default value of a class is null
        System.out.println("String: " + c.name); // String is class too, so it's default value is null
        
//      Exemplo de que não pode deixar de inicializar uma váriavel, até mesmo em condições
//        int age;
//        if(x.length > 10){
//            age = 21;
//        }else{
//            System.out.println("Do something else");
//            age = 0;
//        }
//        
//        System.out.println(age + " years old.");
        
    }
    
}
