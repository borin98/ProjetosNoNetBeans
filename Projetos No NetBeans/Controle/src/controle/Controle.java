/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controle;

import java.util.Scanner;

/**
 *
 * @author Borin
 */
public class Controle
{

    /**
     *
     * @param opcao
     * @param controle
     * @param ler
     */
    public static void analise( int opcao, ControleRemoto controle, Scanner ler )
    {
        
        if ( opcao == 0 )
        {
            
          controle.ligar ( ) ;
            
        }
        
        else if ( opcao == 1 )
        {
            
            controle.desligar ( ) ;
            
        }
        
        else if ( opcao == 2 )
        {
            
          controle.abrirMenu ( ) ;
            
        }
        
        else if ( opcao == 3 )
        {
            
            controle.fecharMenu ( ) ;
            
        }
        
        else if ( opcao == 4 )
        {
            
            controle.maisVolume( ler ) ;
        }
        
        else if ( opcao == 5 )
        {
            
            controle.menosVolume( ler ) ;
            
        }
        
        else if ( opcao == 6 )
        {
            
            controle.ligarMudo ( ) ;
            
        }
   
        else if ( opcao == 7 )
        {
            
            controle.desligarMudo ( ) ;
            
        }
        
        else if ( opcao == 8 )
        {
            
            controle.play ( ) ;
            
        }
        
        else
        {
            
            controle.pause ( ) ;
            
        }
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       
       Scanner ler = new Scanner ( System.in ) ; 
       ControleRemoto controle = new ControleRemoto ( ) ;
       
       int opcao = 1 ;
       
        System.out.println("\nDigite uma opção ") ;
       
       while ( opcao < 9  )
       {
          
           System.out.println("\n0 para ligar") ;
           System.out.println("\n1 para desligar") ;
           System.out.println("\n2 para abrir o menu") ;
           System.out.println("\n3 para fechar o menu") ;
           System.out.println("\n4 para aumentar o volume") ;
           System.out.println("\n5 para diminuir o volume") ;
           System.out.println("\n6 para ligar o mudo") ;
           System.out.println("\n7 para desligar o mudo") ;
           System.out.println("\n8 para dar play") ;
           System.out.println("\n9 para dar pause") ;
      
           System.out.print("\nOpção : ") ;
           opcao = ler.nextInt ( ) ;

           
           if ( opcao < 0 || opcao > 9)
           {
               
               System.out.println("\nOpção inválida !!!") ;
                continue ;
           }
                               
           analise( opcao, controle, ler ) ;
           
       }
       
    }
    
}
