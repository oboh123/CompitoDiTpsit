/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensaaziendaletpsit;

//Thread Consumatore

/**
 *
 * @author informatica
 */
public class Dipendenti extends Thread{
    
    Bancone a = new Bancone();
    double casuale = (int)(Math.random()*10);    

    public Dipendenti() {
    }


    @Override
    public void run() {

        try {
            
            a.prendiIlPiatto();   
            sleep((long) casuale);
            
        } catch (Exception e) {
        }
        
        
        
    }
    
    


    
    
    
}
