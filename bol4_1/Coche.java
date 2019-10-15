/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol4_1;

/**
 *
 * @author clagosuarez
 */
public class Coche {
    private int velocidade ;

    public Coche(){
    velocidade= 0;
    
    }
//Este método devolve a velocidade actual
    public int getVelocidade(){
       return velocidade;
        
    }
// Este método incrementa a velocidade na cantidade valor
    public void acelerar (int valor){
        velocidade += valor;
    }
// Este método diminue a velocidade na cantidade menos.
    public void frenar (int menos){
        velocidade -= menos;
    }
}
