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
public class Ex1 {
    
    public static void main (String[] args){
        boolean a = true;
        boolean b = false;
        boolean c = true;
        if (a == true){
            if (b == true){
                if (c == true){
                    System.out.println("Some things are true in this world");
                } else{
                    System.out.println("Nothing is true in this world");
                }
            }else if (a && (b = c)){
                System.out.println("It's too confusing to tell what is " + 
                                   "true and what is false");
            }else{
                System.out.println("Hey this won't compile");
            }
        }
        
    }
    
}
