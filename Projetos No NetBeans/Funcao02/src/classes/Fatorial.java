/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Borin
 */
public class Fatorial 
{

    private int num = 0 ;
    private int fat = 1 ;
    private String formula = "" ;
    
    public void setValor ( int n )
    {
       
        num = n ;
        int f = 1 ;
        String s = "" ;
        
        for ( int c = num; c > 1; c -- )
        {
            
            f *= c ;
            s += c + " X " ;
            
        }
        
        s += "1 = " ;
        fat = f ;
        formula = s ;
        
    }
    
    public int getFatorial ( )
    {
        
        return this.fat ;
        
    }
    
    public String getFormula ( )
    {
        
        return this.formula ;
        
    }

}
