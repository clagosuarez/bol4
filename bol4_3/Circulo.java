/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol4_3;

/**
 *
 * @author clagosuarez
 */
public class Circulo {
    double radio = 2;
    final double pi = 3.14;
    
    public Circulo(){
    // constructor vacío
    }
    
    public Circulo(double radio){
        this.radio= radio;
    }
    
    public double calcularArea(){
        return pi*Math.pow(radio, 2);
    }
    
    public double calcularLonxitude(){
        return 2*pi*radio;
    }
}
