/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09;

/**
 *
 * @author Morgan
 */
public class Aula09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];
        
        p[0] = new Pessoa("Morgan", 27, 'M');
        p[1] = new Pessoa("Maria", 19, 'F');

        l[0] = new Livro("O Senhor dos anéis", "Tolkien", 1892, p[0]);
        l[1] = new Livro("Harry Potter", "Holling", 2432, p[0]);
        l[2] = new Livro("O Segredo", "Alguém chato", 600, p[1]);
        
        for (int i = 0; i < l.length; i++){
            System.out.println(l[i].detalhes());

        }
    }
    
}
