/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certification_09;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

/**
 *
 * @author Morgan
 */
public class Conta {

    String cliente;
    double saldo;
    
    void exibeSaldo(){
        System.out.println(this.cliente + ", seu saldo é R$ "+this.saldo);
    }
    
    void sacar(double valor){
        if(valor <= this.saldo){
            this.saldo -= valor;
            System.out.println(this.cliente + " sacou R$ " + valor + " com sucesso! "
                    + "Saldo atual: R$ " + this.saldo);
        }else{
            System.out.println("Não há saldo suficiente para sacar R$ "+ valor +". Saldo atual: R$ " + this.saldo);
        }
    }
    
    void depositar(double valor){
        this.saldo += valor;
        System.out.println("R$ " + valor + " foi depositado à conta de " + this.cliente + "! "
                + "Saldo atual: R$ " + this.saldo);
    }
    
    static final public void main (String... x){
        Conta c1 = new Conta();
        c1.cliente = "Morgan";
        c1.saldo = 20000;
        c1.exibeSaldo();
        c1.sacar(10000);
        c1.depositar(1000);
    }
}
