/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07;

/**
 *
 * @author Morgan
 */
public class Aula07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Lutador l[] = new Lutador [6];
        
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 3, 1);
        
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
        
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
        
        l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93, 81.6, 13, 0, 2);
        
        l[4] = new Lutador("Morgan Espindola", "New Zeland", 27, 1.88, 110, 15, 1, 2);
        
        l[5] = new Lutador("André Espindola", "England", 29, 1.8, 98, 8, 0, 3);
        
        Luta EUC01 = new Luta();
        EUC01.marcarLuta(l[1], l[5]);
        EUC01.lutar();
        l[0].status();
        l[1].status();
    }
    
}
