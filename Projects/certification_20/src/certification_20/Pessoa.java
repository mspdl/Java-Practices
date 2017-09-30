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
public class Pessoa {
    
    String nome;
    double nota1;
    double nota2;
    double mediaAluno;
    String turma;
    
    public void mediaAluno (double n1, double n2){
        this.nota1 = n1;
        this.nota2 = n2;
        this.mediaAluno = (this.nota1 + this.nota2)/2;
        System.out.println(this.nome + ", sua média é: " + this.mediaAluno);
    }
    
    public double mediaAluno(String turma, double ... notas){
        double totalNotas = 0;
        this.turma = turma;
        for (int i = 0; i < notas.length; i++){
            totalNotas += notas[i];
        }
        double mediaNotas = totalNotas/notas.length;
        return mediaNotas;
    }
    
}
