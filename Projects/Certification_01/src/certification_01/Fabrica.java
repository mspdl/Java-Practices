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
public class Fabrica {
    
    int carro = 0;
    static int totalCarros;
    
    void fabricarCarro(){
        carro++;
        totalCarros++;
    }
    
}
