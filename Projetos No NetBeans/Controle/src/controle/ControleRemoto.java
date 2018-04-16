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
public class ControleRemoto implements Controlador
{
    
   private int volume ;
   
   private boolean ligado, tocando ;

    public ControleRemoto()
    {
    
       this.volume = 50 ;
       
       this.ligado = false ;
       this.tocando = false ;
    
    }

    public int getVolume()
    {
        return volume;
    }

    public void setVolume(int volume)
    {
        this.volume = volume;
    }

    public boolean isLigado()
    {
        return ligado;
    }

    public void setLigado(boolean ligado)
    {
        this.ligado = ligado;
    }

    public boolean isTocando()
    {
        return tocando;
    }

    public void setTocando(boolean tocando)
    {
        this.tocando = tocando;
    }
   
    //Métodos abstratos

    @Override
    public void ligar()
    {
        
        this.setLigado( true ) ;
        
    }

    @Override
    public void desligar()
    {
        this.setLigado( false ) ;
    }

    @Override
    public void abrirMenu()
    {
        
        System.out.println("\nEstá ligado ? : "+this.isLigado ( )) ;
        System.out.println("\nEstá tocando ? : "+this.isTocando ( )) ;
        System.out.println("\nVolume : "+this.getVolume ( )) ;
        
        for ( int i = 0; i <= this.getVolume ( ); i++ )
        {
            
            System.out.println("| ") ;
            
        }
                
    }

    @Override
    public void fecharMenu()
    {
       
        System.out.println("\nFechando menu") ;
        
    }

    @Override
    public void maisVolume( Scanner ler )
    {
        int vol, aux = this.getVolume ( ) ;
        
        System.out.print("\nDigite o volume que deseja implementar : ") ;
        vol = ler.nextInt ( ) ;
        
        System.out.println("\nVOLUME") ;        
        for ( int i = 0; i < ( vol + aux ); i++)
        {
            
            System.out.print("| ") ;
            
        }
        
        this.setVolume( vol + aux ) ;
    }

    @Override
    public void menosVolume( Scanner ler )
    {
       
       int vol, aux = this.getVolume ( ) ;
       
        System.out.print("\nDigite o volume que deseja diminuir : ") ;
        vol = ler.nextInt ( ) ;
        
        System.out.println("\nVolume") ;
        for ( int i = 0; i < ( aux - vol ); i++ )
        {
            
            System.out.print("") ;
            
        }
    
        this.setVolume( aux - vol ) ;
        
    }

    @Override
    public void ligarMudo()
    {
        
        this.setTocando( false ) ;
        
    }

    @Override
    public void desligarMudo()
    {
        
        this.setTocando( true ) ;
        
    }

    @Override
    public void play()
    {
        
        if ( this.isLigado() == true && this.isTocando() == true )
        {
            this.setTocando( true ) ;
        }
    
    }

    @Override
    public void pause()
    {
        
        if ( this.isLigado() == true && this.isTocando() == false )
        {
            
            this.setTocando ( false ) ;
            
        }
            
    }
    
    
}
