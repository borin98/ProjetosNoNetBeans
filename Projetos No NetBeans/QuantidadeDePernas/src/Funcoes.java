/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Borin
 */
public class Funcoes 
{
    
    private int num = 0;
    private int fatorial = 1 ;
    String formato = "" ;


    public void setValor ( int n )
    {
        
       String s = " = " ;
        
       num = n ;
       
        for ( int f = 1; num <= n; f++ )
        {
            
            fatorial *= f ;
            num -= 1 ;
            formato = num +" X " ;
               
        }
        
        formato += num +s+fatorial ;
        
        
        
    }

    public int getFatorial (  )
    {
        
        return this.fatorial ;
        
    }
    
    public String getFormula ( )
    {
        
        return this.formato ;
        
    }

}


