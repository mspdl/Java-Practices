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
public class MySwitch {
    public static void main(String argv[]){
        int k=10;
        switch(k){
            default:
                System.out.println("This is the default output");
                break;
            case 10:
                System.out.println("ten");
            case 20:
                System.out.println("twenty");
                break;
        }
    }
}
