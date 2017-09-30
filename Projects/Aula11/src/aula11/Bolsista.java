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
public class Bolsista extends Aluno{
    private double bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.getNome());
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado.");
    }
    
    // ------ Métodos especiais
    public void setBolsa(double bolsa){
        this.bolsa = bolsa;
    }
    
    public double getBolsa(){
        return this.bolsa;
    }
            
            
}
