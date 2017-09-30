/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certification_01;

/**
 *
 * @author Morgan
 */
public class Certification_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Fabrica mark = new Fabrica();
        for (int i = 0; i < 4; i++){
            mark.fabricarCarro();
        }
        System.out.println("Mark fabricou " + mark.carro + " carros.");
        
        Fabrica lucio = new Fabrica();
        for (int i = 0; i < 2; i++){
            lucio.fabricarCarro();
        }
        System.out.println("Lucio fabricou " + lucio.carro +  " carros.");
        
        System.out.println("Total de carros fabricados: " + Fabrica.totalCarros);
    }
    
}
