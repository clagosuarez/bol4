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
public class Bol4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo monedaEuro = new Circulo(11.6);
        System.out.println("El área de una moneda de 1 euro es de " + Math.round(monedaEuro.calcularArea()) + "mm");
        System.out.println("La longitud de una moneda de 1 euro es de " + Math.round(monedaEuro.calcularLonxitude()) + "mm");
    }
    
}
