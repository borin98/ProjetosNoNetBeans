/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author Borin
 */
public class ProgramaMedia 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    
        Scanner ler = new Scanner ( System.in ) ;
        
        System.out.print("\nDigite a nota da primeira prova : ");
        
        float n1 = ler.nextFloat (  ) ;
       
        System.out.print("\nDigite a nota da segunda prova : ");
        
        float n2 = ler.nextFloat (  ) ;
    
        if ( ( n1 + n2 )/2 >= 9 )
        {
           
            System.out.print("\nParabéns !!!");
            
        }
        
        System.out.println("\nSua média foi de "+( n1 + n2 )/2);
        
    }
    
}
