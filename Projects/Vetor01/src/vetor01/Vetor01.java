/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

/**
 *
 * @author Morgan
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n[] = {10,81,12,9,2};
        System.out.println("Tamanho do vetor n: " + n.length);
        for (int i = 0; i < n.length; i++){
            System.out.println(i + ": " + n[i]);
        }
    }
    
}
