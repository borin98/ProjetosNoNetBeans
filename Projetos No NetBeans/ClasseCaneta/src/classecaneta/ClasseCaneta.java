/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classecaneta;

import java.util.Scanner;

/**
 *
 * @author Borin
 */
public class ClasseCaneta
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
        String comparacao ;
        
        double a ;
        
        Scanner ler = new Scanner ( System.in ) ;
        
        Caneta can = new Caneta ( ) ;
        
        System.out.print("\nDigite o nome da caneta : ") ;        
        can.modelo = ler.next ( ) ;
        
        System.out.print("\nDigite a cor da caneta : ") ;
        can.cor = ler.next ( ) ;
        
        System.out.print("\nDigite o status da caneta : ") ;
        comparacao = ler.next ( ) ;
        
        System.out.print("\nDigite a porcentagem da carga da caneta ") ;
        can.carga = ler.nextInt ( ) ;
        
        System.out.print("\nDigite a ponta da caneta : ") ;
        a = ler.nextDouble ( ) ;
        can.setPonta( a ) ;
        
        if ( comparacao.equals( "tampada" ) )
        {
            
            can.tampar ( ) ;
            
        }
    
        else
        {
            
            can.destampar ( ) ;
            
        }
        
        can.escrever ( ) ;
        
        can.rabiscar ( ) ;
        
    }
    
}
