/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaodestrings;

import java.util.Scanner;

/**
 *
 * @author Borin
 */
public class ComparacaoDeStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    
       String n1 ;
       String n2 ;
       
       String res ;
       
       Scanner ler =  new Scanner ( System.in ) ;
    
        System.out.print("\nDigite seu nome : ") ;
        n1 = ler.nextLine ( ) ;
   
        System.out.print("\nDigite qualquer outro nome : ") ;
        n2 = ler.nextLine ( ) ;
        
        res = ( n1.equals( n2 ) )? "Iguais" : "Diferentes" ;
        //método para comparação de objetos
          
        System.out.printf("\nAs palavras são %s em sí\n", res) ;
        
    }
    
}
