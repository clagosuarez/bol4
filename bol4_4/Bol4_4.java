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
public class Bol4_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta santander = new Conta("Pablo","1234",0.1,1700);
        System.out.println("Antes de ingresar " + santander.getSaldo());
        santander.ingreso(1200);
        System.out.println("Después de ingresar " + santander.getSaldo());
        santander.reintegro(-100);
        System.out.println("Después de retirar " + santander.getSaldo());
        
        Conta abanca = new Conta("Ana","5678",1,3550);
        System.out.println("Antes de transferir: \n Santander: " + santander.getSaldo() + "\n ABanca: "+ abanca.getSaldo());
        santander.transferencia(abanca, 200);
        System.out.println("Después de transferir: \n Santander: " + santander.getSaldo() + "\n ABanca: "+ abanca.getSaldo());
    }
    
}
