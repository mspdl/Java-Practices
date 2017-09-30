/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14;

/**
 *
 * @author Morgan
 */
public class Aula14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // instanceamento de vídeos
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");
        
        // instanceamento de gafanhotos
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Paulo", 25, "M", "paulo.loco");
        g[1] = new Gafanhoto("Mônica", 15, "F", "dentuca3234");
        
        // instanceamento de visualizações
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        vis[1] = new Visualizacao(g[0], v[1]);
        vis[1].avaliar(87.0);
        System.out.println(vis[1].toString());
        
//        // Mostrando lista de vídeos
//        System.out.println("Lista de vídeos");
//        for (Video vCont : v) {
//            System.out.println(vCont.toString());
//        }
//        System.out.println("");
//        
//        // Mostrando lista de gafanhotos
//        System.out.println("Lista de gafanhotos");
//        for (Gafanhoto gCont : g){
//            System.out.println(gCont.toString());
//        }
//        System.out.println("");


        
        
    }
    
}
