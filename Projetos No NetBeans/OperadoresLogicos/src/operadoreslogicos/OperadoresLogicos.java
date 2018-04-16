/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoreslogicos;

import java.util.Scanner;

/**
 *
 * @author Borin
 */
public class OperadoresLogicos 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    
        int x, y, z ;
        boolean r ;
        
        Scanner ler = new Scanner ( System.in ) ;
     
        System.out.println("\nDigite, respectivamente, o valor de x, y e z");
        x = ler.nextInt (  ) ;
        y = ler.nextInt (  ) ;
        z = ler.nextInt (  ) ;
        
        System.out.println("\n--------------------------------------\n");
        
        r = ( x < y && y < z ) ;
        System.out.println("\nOperador &&");
        System.out.printf("%d < %d e %d < %d ? \n", x, y, y, z);
        System.out.println( r ) ;
        
        System.out.println("\n--------------------------------------\n");
    
        System.out.println("\nOperador ||");
        r = ( x < y || y < z ) ;
        System.out.printf("%d < %d ou %d < %d ? \n", x, y, y, z);
        System.out.println( r ) ;
    
        System.out.println("\n--------------------------------------\n");
        
        System.out.println("\nOperador ^");
        r = ( x < y ^ y < z ) ;
        System.out.printf("%d < %d ou, exclusivo, %d < %d ? \n", x, y, y, z);
        System.out.println( r ) ;
    
        System.out.println("\n--------------------------------------\n");
    }
    
}
