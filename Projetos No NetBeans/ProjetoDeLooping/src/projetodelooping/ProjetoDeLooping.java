/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetodelooping;

/**
 *
 * @author Borin
 */
public class ProjetoDeLooping 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    
       int i = 0 ;
       
       while ( i < 10 )
       {
           
           i++ ;
           
           if ( i == 1 || i == 2 || i == 3 )
           {
               
               continue ; // ele pula o valor e dá um looping ( parecido com if e else )
               
           }
           
           if ( i == 7 )
           {
               
               break ;
               
           }
           
           System.out.println("\nValor de i : "+i) ;
           
       }
    
    }
    
}
