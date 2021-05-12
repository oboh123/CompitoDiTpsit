/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensaaziendaletpsit;

import java.util.concurrent.Semaphore;

/**
 *
 * @author informatica
 */
public class Bancone extends Thread{

    public Bancone() {
    }
    
    
    double casuale = (int)(Math.random()*10);
    protected static Semaphore semPieno = new Semaphore(0);
    protected static Semaphore semVuoto = new Semaphore(1);
    
    static int numeroDelPiatto = 0;
    
    public synchronized void depositaIlPiatto(){     
        
        
        
        try {
            semVuoto.acquire();
            
            numeroDelPiatto++;
            System.out.println("Il piatto numero: " + numeroDelPiatto + "è pronto");
            
        } catch (Exception e) {
        }
        
            semPieno.release();
    }   
    
    public synchronized void prendiIlPiatto(){
              
        try {
            
            semPieno.acquire();
            System.out.println("Consuma piatto numero: " + numeroDelPiatto);
            
        } catch (Exception e) {
            
        }
        
            semVuoto.release();

    }

    public int getNumeroDelPiatto() {
        return numeroDelPiatto;
    }
    
    public boolean massimoNumeroPiatti(){
        
        if (numeroDelPiatto > 10) {
            return true;    
        }else{
            return false;
        }
    }
    
    
    
    
    
}
