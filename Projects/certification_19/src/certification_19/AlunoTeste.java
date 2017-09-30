/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certification_19;

/**
 *
 * @author Morgan
 */
public class AlunoTeste {
    
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        Aluno a = new Aluno();
        a.nome = "Morgan";
        aluno.c1 = a;
        a = new Aluno();
        a.nome = "tanso";
        a = null;
        
        System.out.println("Quantidade de objetos = " + Aluno.contador);
        System.out.println(aluno.c1.nome);
        
    }
    
}
