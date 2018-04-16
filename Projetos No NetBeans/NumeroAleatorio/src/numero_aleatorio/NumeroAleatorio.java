/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero_aleatorio;

import java.util.Scanner;

/**
 *
 * @author Borin
 */
public class NumeroAleatorio 
{

    public static void main(String[] args) 
    {
    
       double ale = Math.random() ; //sempre vai gerar um número entre 0 à 1
       
       double n1 ;
       double n2 ;
       
       Scanner ler = new Scanner ( System.in ) ;
       
        System.out.println("\nDigite o intervalo que deseja calcular : ");
        n1 = ler.nextDouble (  ) ;
        n2 = ler.nextDouble (  ) ;
        
        int n ;
        
        if ( n1 > n2  )
        {
            
            n = ( int ) ( n2 + ale* ( n1 - n2 ) ) ;
            
        }
       
        else
        {
            
            n = ( int ) ( n1 + ale* ( n2 - n1 ) ) ;
            
        }
        
        System.out.println( n ) ;
        
       // System.out.println( ale );
        
    }
    
}
