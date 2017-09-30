/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provajava;

/**
 *
 * @author Morgan
 */
public class Basics {
    
//    public static void main (String[] args){
//        int x;
//        int y;
//        int z;
//        System.out.println(x+y+z);
//    }
    public static void main(String[] args){
        int x = 0;
        int y = 0;
        for (int z = 0; z < 5; z++){
            System.out.println("entrou no for");
            System.out.println("x = " + x + "| y = " + y + "| z = " + z);
            if ((++x > 2) && (++y > 2)){
                x++;
                System.out.println("entrou no if");
                System.out.println("x = " + x + "| y = " + y + "| z = " + z);
            }
        }
        System.out.println("x = " + x + " y = " + y);
    }
    
//    public static void main(String[] args){
//        for (String temp: String[] args)
//        System.out.println(temp);
//    }
}
