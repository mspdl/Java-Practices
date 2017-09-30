/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10;

/**
 *
 * @author Morgan
 */
public class Professor extends Pessoa {
    
    private String especialidade;
    private double salario;
    
    // Métodos
    public void receberAum(double aumento){
        this.setSalario(this.getSalario() + aumento);
    }
    
    // Métodos Especiais
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
