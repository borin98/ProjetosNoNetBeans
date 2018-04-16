/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducaopoo;

/**
 *
 * @author Borin
 */
public class Caneta 
{

    private String modelo, cor ;
    private double ponta, carga ;
    private int tampada ;
   
    
    public void verificar ( int tampada )
    {
        
        if ( tampada == 1 )
        {
            
            System.out.println("Pode rabiscar") ;
            
        }
        
        else
        {
            
            System.out.println("Não pode rabiscar");
            
        }
        
    }
    
    
    public void setModelo ( String modelo )
    {
        
       this.modelo = modelo ; 
        
    }

    public void setCor ( String cor )
    {
        
        this.cor = cor ;
        
    }
    
    public void setPonta ( double ponta )
    {
        
        this.ponta = ponta ;
        
    }

    public void setCarga ( double carga )
    {
        
        this.carga = carga ;
        
    }
    
    public void setTampada( int tampada )
    {
        
        this.tampada = tampada ;
        
    }
    
    /**
     *
     * @return
     */
    public String getModelo (  )
    {
        
        return modelo ;
        
    }
    
    public String getCor ( )
    {
        
        return cor ;
        
    }
    
    public double getPonta ( )
    {
        
        return ponta ;
        
    }
    
    public double getCarga ( )
    {
        
        return carga ;
        
    }
    
    public int getTampada ( )
    {
        
        return tampada ;
        
    }
    
}
