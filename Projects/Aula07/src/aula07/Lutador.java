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
public class Lutador {
    
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    public void apresentar(){
        System.out.println("APRESENTANDO ...");
        System.out.println(this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " anos");
        System.out.println(this.getAltura() + "m");
        System.out.println("Pesando " + this.getPeso() + " quilos");
        System.out.println("Ganhou " + this.getVitorias() + " lutas");
        System.out.println("Perdeu " + this.getDerrotas() + " lutas");
        System.out.println("e empatou " + this.getEmpates() + " lutas.");
        System.out.println("");
    }
    
    public void status(){
        System.out.println("");
        System.out.println(this.getNome());
        System.out.println(this.getPeso() + " quilos");
        System.out.println("ganhou: " + this.getVitorias());
        System.out.println("perdeu: " + this.getDerrotas());
        System.out.println("empatou: " + this.getEmpates());
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    
    // Métodos especiais
    public Lutador (String no, String na, int id, double al, double pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);
    }
    
    public String getNome(){
        return this.nome;
    }
    
    private void setNome(String n){
        this.nome = n;
    }
    
    private String getNacionalidade(){
        return this.nacionalidade;
    }
    
    private void setNacionalidade(String n){
        this.nacionalidade = n;
    }
    
    private int getIdade(){
        return this.idade;
    }
    
    private void setIdade(int i){
        this.idade = i;
    }
    
    private double getAltura(){
        return this.altura;
    }
    
    private void setAltura(double a){
        this.altura = a;
    }
    
    private double getPeso(){
        return this.peso;
    }
    
    private void setPeso(double p){
        this.peso = p;
        this.setCategoria();
    }
    
    private void setCategoria(){
        if (this.peso < 52.2){
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3){
            this.categoria = "Leve";
        } else if (this.peso <= 83.9){
            this.categoria = "Médio";
        } else if (this.peso <= 120.2){
            this.categoria = "Pesado";
        } else{
            this.categoria = "Inválido";
        }
    }
    
    public String getCategoria(){
        return this.categoria;
    }

    private int getVitorias() {
        return vitorias;
    }

    private void setVitorias(int v) {
        this.vitorias = v;
    }

    private int getDerrotas() {
        return derrotas;
    }

    private void setDerrotas(int d) {
        this.derrotas = d;
    }

    private int getEmpates() {
        return empates;
    }

    private void setEmpates(int e) {
        this.empates = e;
    }
    
}
