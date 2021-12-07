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
public class Processador {
   private double nucleos;
    
    public Processador(){
        nucleos=4.2;
        
    }
    public Processador(double nucleos){
        this.nucleos=nucleos;
        
    }
    public double getNucleos() {
        return nucleos;
    }

    public void setNucleos(double nucleos) {
        this.nucleos = nucleos;
    }
    
}

