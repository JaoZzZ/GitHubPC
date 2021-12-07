/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Computador;

/**
 *
 * @author IFSC
 */
public class ExComposicao {
   public static void main(String[] args) {
       
        Computador pc = new Computador();
        
        
        Computador pc2 = new Computador(8, 4.2, "Rx550", 500);
        
        
        pc.imprimeDadosComputador();
        pc2.imprimeDadosComputador();
        
   } 
}
