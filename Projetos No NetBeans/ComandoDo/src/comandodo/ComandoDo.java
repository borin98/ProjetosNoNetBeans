/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comandodo;

import java.util.Scanner;

/**
 *
 * @author Borin
 */
public class ComandoDo 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    
        String resp ;
        Scanner ler = new Scanner ( System.in ) ;
        
        int s = 0, n ;
    
        do
        {
                   
            System.out.print("\nDigite um número : ") ;
            n = ler.nextInt ( ) ;
            
            s += n ;
            
            System.out.print("\nDeseja Continar ? ( S para sim e N para não ) : ") ;
            resp = ler.next( ) ;
        
            
        }   while ( resp.equals( "s" ) || resp.equals( "S" )  ) ;
        
        System.out.println("\nO valor da soma é de : "+s) ;
    }
    
}
