/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classecaneta;

/**
 *
 * @author Borin
 */
public class Caneta
{
    
    public String modelo, cor ;
    
    private double ponta ;
    
    protected int carga ;
    protected boolean tampada ;
    
    public void escrever ( )
    {
        
        System.out.println("\nModelo : "+this.modelo) ;
        System.out.println("\nCor : "+this.cor) ;
        System.out.println("\nPonta : "+this.ponta) ;
        System.out.println("\nCarga : "+this.carga+" %") ;
        System.out.println("\nEstá tampada ? : "+this.tampada) ;
        
    }
    
    public void rabiscar ( )
    {
        
        if ( this.tampada == true )
        {
            
            System.out.println("\nNão posso rabiscar !!!") ;
            
        }
        
        else
        {
            
            System.out.println("\nPosso rabiscar !!!") ;
            
        }
        
    }
    
    protected void tampar ( )
    {
        
      this.tampada = true ;  
        
    }
    
    /**
     *
     */
    protected void destampar ( )
    {
        
        this.tampada = false ;
        
    }
    
    /**
     *
     * @param a
     */
    public void setPonta ( double a )
    {
        
        this.ponta = a ;
        
    }
    
    /**
     *
     * @return
     */
    public double getPonta ( )
    {
        
        return this.ponta ;
        
    }
    
}
