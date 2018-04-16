/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcao01;

import classes.Fatorial;

/**
 *
 * @author Borin
 */
public class Funcao01 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        int a = 5, b , c ;
        
        String d ;
        
        Fatorial f = new Fatorial ( ) ;
        
        f.setValor( a ) ;
        b = f.getFatorial ( ) ;
        d = f.getFormula ( ) ;
        
        System.out.println( b ) ;
        System.out.println( d );
        
    }
    
}
