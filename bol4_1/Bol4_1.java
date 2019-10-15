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
public class Bol4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Coche bmw = new Coche();
    bmw.getVelocidade();
    System.out.println("La velocidad inicial es de " + bmw.getVelocidade() + "km/h");
    bmw.acelerar(20);
    System.out.println("Una vez acelerado, la velocidad es de " + bmw.getVelocidade() + "km/h");
    bmw.frenar(10);
    System.out.println("Una vez frenado, la velocidad es de " + bmw.getVelocidade() + "km/h");
    }
    
}
