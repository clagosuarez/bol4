/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol4_4;

/**
 *
 * @author clagosuarez
 */
public class Conta {
    String nomeCliente = "";
    String numeroConta = "";
    double interese = 0;
    double saldo = 0;
//  Constructores
    public Conta(){
    
    }
    public Conta(String nomeCliente, String numeroConta, double interese, double saldo){
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.interese = interese;
        this.saldo = saldo;
    }
//  Setters
    public void setNome(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }
    public void setConta(String numeroConta){
        this.numeroConta = numeroConta;
    }
    public void setInterese(double interese){
        this.interese = interese;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
// Getters
    public String getNome(){
        return nomeCliente;
    }
    public String getConta(){
        return numeroConta;
    }
    public double getInterese(){
        return interese;
    }
    public double getSaldo(){
        return saldo;
    }
//  Ingreso
    public void ingreso(double cantidad){
        saldo += cantidad;
    }
//  Reintegro
    public void reintegro(double cantidad){
        saldo -= Math.abs(cantidad);
    }
//  Transferencia  
   public void transferencia(Conta destino, double cantidad){
       saldo -= Math.abs(cantidad);
       destino.setSaldo(destino.getSaldo() + cantidad);
   }
}

