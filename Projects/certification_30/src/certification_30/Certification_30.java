/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certification_30;

/**
 *
 * @author Morgan
 */
public class Certification_30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double d = 1.99999999998;
        int i = (int) d;
        long l = 1123123123123123122l;
        int i2 = (int) l;
        int i3 = 245;
        byte b = (byte) i3;
        System.out.println("d = " + d);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
        System.out.println("b = " + b);
    }
    
}
