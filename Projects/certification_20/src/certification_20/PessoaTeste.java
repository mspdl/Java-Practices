/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certification_20;

/**
 *
 * @author Morgan
 */
public class PessoaTeste {
    
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        
        p.nome = "Morgan";
        p.mediaAluno(6, 8);
        
        double mediaTurma = p.mediaAluno("Turma A",8,3,10,5);
        
        System.out.println("A média da " + p.turma + " é: " + mediaTurma);
        System.out.println("A média da " + p.turma + " é: " + p.mediaAluno("Turma A",8,3,10,5));
    }
    
}
