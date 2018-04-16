/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;

import java.util.Scanner ;

/**
 *
 * @author Borin
 */
public class Vetores 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    
        Scanner ler =  new Scanner ( System.in ) ;
        
        int tam ;
        System.out.print("\nDigite o tamanho do vetor : ") ; 
        tam = ler.nextInt ( ) ;
        
        int soma = 0 ;
        
        while ( tam <= 0 )
        {
            
            System.out.println("\nValor inválido !!! ") ;
            System.out.print("\nDigite o tamanho do vetor : ") ;
            tam = ler.nextInt (  ) ;
            
        }
        
        int n[] = new int[tam] ;
        
        for ( int i = 0; i < tam; i++ )
        {
            
            System.out.printf("\nDigite o valor do elemento %d : ", ( i + 1 ) ) ;
            n[i] = ler.nextInt ( ) ;
        
            soma += n[i] ;
            
        }
        
        /*for ( int valor : n )
        {
            
            System.out.println( valor );   
            
        }*/ //copia todos os valores de um vetor para outro 
        
        System.out.println("\nA soma dos elementos é : "+soma) ;
        
    }
    
}
