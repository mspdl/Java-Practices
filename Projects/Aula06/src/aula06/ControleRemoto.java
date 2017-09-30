/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

/**
 *
 * @author Morgan
 */
public class ControleRemoto implements Controlador{
    
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    // Métodos Especiais
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }
    
    private void setVolume(int v){
        this.volume = v;
    }
    
    private int getVolume(){
        return this.volume;
    }
    
    private void setLigado(boolean l){
        this.ligado = l;
    }
    
    private boolean getLigado(){
        return this.ligado;
    }
    
    private void setTocando(boolean t){
        this.tocando = t;
    }
    
    private boolean getTocando(){
        return this.tocando;
    }

    // Métodos Abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.getLigado()){
            System.out.println("--- MENU ---");
            System.out.println("Está ligado? " + this.getLigado());
            System.out.println("Está tocando? " + this.getTocando());
            System.out.print("Volume: " + this.getVolume() + " ");
            for (int i = 0; i < this.getVolume(); i+=10){
                System.out.print("|");
            }
            System.out.println("");
        } else {
            System.out.println("TV Desligada - Menu não pode ser exibido.");
        }
        
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado() && this.getVolume() < 100){
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("TV Desligada ou Volume já está no máximo");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("TV Desligada ou Volume já está no mínimo");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        } else {
            System.out.println("Não consegui reproduzir");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        } else {
            System.out.println("Não consegui pausar");
        }
    }
}
