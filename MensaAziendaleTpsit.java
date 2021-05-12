/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensaaziendaletpsit;

/**
 *
 * @author informatica
 */
public class MensaAziendaleTpsit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bancone a = new Bancone();
        Cuoco b = new Cuoco(a);
        Dipendenti c = new Dipendenti(a);
        Dipendenti d = new Dipendenti(a);
        
        
        for (int i = 0; i < 10; i++) {
            
            b.start();
            
        }
        
        for (int i = 0; i < 10; i++) {
            
            b.join();
            
            
            
            
        }
        
    }
    
    
    
    
}
