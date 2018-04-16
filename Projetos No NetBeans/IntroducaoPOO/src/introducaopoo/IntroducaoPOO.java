/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducaopoo ;

import java.util.Scanner ;

/**
 *
 * @author Borin
 */
public class IntroducaoPOO 
{

    /**
     * @param args the command line arguments
     */
       
    public static void main(String[] args) 
    {
    
        Caneta can = new Caneta ( ) ;
        Scanner ler = new Scanner ( System.in ) ;
        
        int sair = 0 ;
        
        String a, aux ;
        
        double b ;
        
        int c ;
        
        System.out.print("\nDeseja Registrar uma caneta ? ( S para sim e N para não ) : ");
        a = ler.next ( ) ;
            
        while ( sair != 1 )
        {
            
            if ( a.equals( "N" ) || a.equals( "n" )  )
            {
                
                System.out.println("\nObrigado por utilizar este programa !!");
                sair = 1 ;
                
            }
            
            else if ( a.equals ( "S" ) || a.equals ( "s" ) )
            {
                
                System.out.print("\nDigite o modelo da caneta : ");
                aux = ler.next ( ) ;
                can.setModelo( aux ) ;
                
                System.out.print("\nDigite a cor da caneta : ") ;
                aux = ler.next ( ) ;
                can.setCor( aux ) ;
            
                System.out.print("\nDigite a ponta da caneta : ");
                b = ler.nextDouble ( ) ;
                can.setCarga( b ) ;
                
                System.out.print("\nDigite se a caneta está tampada ( 1 para sim e 0 para nao ) : ") ;
                c = ler.nextInt ( ) ;
                can.setTampada( c ) ;
                
                System.out.println( can.getModelo ( ) ) ;
                System.out.println( can.getCor ( ) ) ;
                System.out.println( can.getPonta ( ) ) ;
                System.out.println( can.getTampada ( ) ) ;
                
                System.out.println("\nDeseja Registrar uma caneta ? ( S para sim e N para não )");
                a = ler.next ( ) ;
                
                
            }
            
            else
            {
                
                System.out.println("\nValor inválido !!!") ;
                System.out.print("\nDeseja Registrar uma caneta ? ( S para sim e N para  não )") ;
                a = ler.next ( ) ;
                
            }
            
        }
        
    
    }
    
}
