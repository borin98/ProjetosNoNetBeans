/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quantidadedepernas;

import java.util.Scanner;

/**
 *
 * @author Borin
 */
public class QuantidadeDePernas 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    
        Scanner ler = new Scanner ( System.in ) ;
        
        int patas ;
        
        String tipo ;
        
        System.out.print("\nDigite a quantidade de pernas do animal : ");
        patas = ler.nextInt ( ) ;
        
        switch ( patas )
        {
            
            case 1 :
                tipo = "Sací" ;
                break ;
            
            case 2 :
                tipo = "Bípede" ;
                break ;
            
            case 4 :
                tipo = "Quadrúpede" ;
                break ;
            
            case 6 :
                tipo = "Aranha" ;
                break ;
                
            default :
                tipo = "ET" ;
                break ;
             
        }
    
        System.out.println( tipo );    
    
    }
     
}
