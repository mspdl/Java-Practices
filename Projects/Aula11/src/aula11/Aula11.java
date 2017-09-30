/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11;

/**
 *
 * @author Morgan
 */
public class Aula11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        Pessoa p1 = new Pessoa();

        // Criando e exibindo um VISITANTE
//        Visitante v1 = new Visitante();
//        v1.setNome("Morgan");
//        v1.setIdade(27);
//        v1.setSexo("Masculino");
//        System.out.println(v1.toString());
        
        // Criando e exibindo um ALUNO
//        Aluno a1 = new Aluno();
//        a1.setNome("Eduardo");
//        a1.setIdade(16);
//        a1.setSexo("Masculino");
//        a1.pagarMensalidade();
//        System.out.println(a1.toString());
        
        // Criando e exibindo um BOLSISTA
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Ana");
        b1.setBolsa(12.5);
        b1.setSexo("Feminino");
        b1.pagarMensalidade();
        System.out.println(b1.toString());
    }
    
}
