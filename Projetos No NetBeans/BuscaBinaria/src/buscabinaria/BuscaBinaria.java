/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscabinaria;

import java.util.Arrays;
import java.util.Scanner ;

/**
 *
 * @author Borin
 */
public class BuscaBinaria 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    
        Scanner ler = new Scanner ( System.in ) ;
        
        int tam = 0 ;
        
        int achou = 0 ;
   
        int pos = 0 ;
        
        System.out.print("\nDigite o tamanho do vetor : ") ;
        tam = ler.nextInt ( ) ;
    
        while ( tam <= 0 )
        {
            
            System.out.println("\nValor inválido !!!") ;
            System.out.print("\nDigite o tamanho do vetor : ") ;
            tam = ler.nextInt ( ) ;
        
        }
        
        int n[] = new int [ tam ] ;
        
        for ( int i = 0; i < tam; i++ )
        {
            
            System.out.printf("\nDigite o valor do elemento %d : ", ( i + 1 ) ) ;
            n[i] = ler.nextInt ( ) ;
            
        }
        
        System.out.print("\nDigite o valor que deseja achar no vetor : ") ;
        achou = ler.nextInt ( ) ;
        
        pos = Arrays.binarySearch( n , achou ) ; // retorna a posição do elemento binário
        
        if ( pos >= 0 )
        {
            
            System.out.println("\nElemento existe no vetor !!! ") ;
            
        }
        
        else
        {
            
            System.out.println("\nElemento não existe no vetor !!!") ;
            
        }
        
    }
    
}
