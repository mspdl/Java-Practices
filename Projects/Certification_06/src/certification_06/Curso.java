/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certification_06;

import javax.swing.JOptionPane;

/**
 *
 * @author Morgan
 */
public class Curso {
    
    static float n1, n2;
    static float media;
    
    static void insiraNota(){
        n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota"));
        n2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a segunda nota"));
    }
    
    static void calcularMedia(){
        media = (n1 + n2)/2;
    }
    
    static void mostrarMedia(){
        JOptionPane.showMessageDialog(null, "A média é " + media);
    }
}
