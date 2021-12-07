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
public class Computador {
  MemoriaRAM memoriaram;
  Processador processador;
  PlacadeVideo placadevideo;
  Hd hd;

    Computador() {
    
    }

  
  public void Computador(){
      memoriaram = new MemoriaRAM();
      processador = new Processador();
      placadevideo = new PlacadeVideo();
      hd = new Hd();
      
  }
  
  public void imprimeDadosComputador(){
      System.out.println("-----Computador-----");
        System.out.println("quantidade da memória: "+memoriaram.getQuantidade());
        System.out.println("nucleos da cpu: "+processador.getNucleos());
        System.out.println("modelo da gpu: "+placadevideo.getModelo());
        System.out.println("tamanho do HD: "+hd.getTamanho());
  }
  
   public void ligarPelaPrimeiraVez(){
        memoriaram = new MemoriaRAM();
        
    }
    
    public void ligarPelaPrimeiraVez(int quantidade, double nucleos, String modelo, int tamanho){
        memoriaram = new MemoriaRAM(quantidade);
        
    }
    
    public Computador(int quantidade, double nucleos, String modelo, int tamanho){
        memoriaram = new MemoriaRAM(quantidade); 
        processador = new Processador(nucleos);
        placadevideo = new PlacadeVideo(modelo);
        hd = new Hd(tamanho);
    }
      
  
}
