/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores_logicos_ternarios;

import java.util.Scanner;

/**
 *
 * @author Borin
 */
public class OperadoresLogicosTernarios 
{

    public static void main(String[] args) 
    {
    
        Scanner ler = new Scanner ( System.in ) ;

        int n1, n2, r, op ;
 
        System.out.print("\nDigite um número : ") ;
        n1 = ler.nextInt ( ) ;
        
        System.out.print("\nDigite outro número : ") ;
        n2 = ler.nextInt ( ) ;
        
        r = ( n1 > n2 )? n1 : n2 ; // Operador ternário
        
        System.out.printf("\nO maior valor é %d\n", r);
    
        op = ( n1 > n2 )? n1 - n2 : n2 - n1 ;
        System.out.printf("\nA subtração será de : %d\n", op);
        
    }
    
}
