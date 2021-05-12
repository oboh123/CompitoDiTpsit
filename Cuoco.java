/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensaaziendaletpsit;

//Thread Produttore



/**
 *
 * @author informatica
 */
public class Cuoco extends Thread{
    
    String nomeCuoco;

    public Cuoco(String nomeCuoco) {
        this.nomeCuoco = nomeCuoco;
    }

    public Cuoco(Bancone b) {
    }
    
    
    
    double casuale = (int)(Math.random()*10);
    Bancone a = new Bancone();

    @Override
    public void run() {

        try {
            
            sleep((long) casuale);
                    
            
            
        } catch (Exception e) {
        }
        
        a.depositaIlPiatto();
        
    }
    
   
    
    

    
    
    
    
    
   
        
    
    
    
    
    
    
    
}
