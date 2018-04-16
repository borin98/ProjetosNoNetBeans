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
public interface Controlador
{

    Scanner ler = new Scanner ( System.in ) ;
    
    public abstract void ligar ( ) ;
    public abstract void desligar ( ) ;
    
    public abstract void abrirMenu ( ) ;
    public abstract void fecharMenu ( ) ;
    
    public abstract void maisVolume ( Scanner ler ) ;

    /**
     *
     * @param ler
     */
    public abstract void menosVolume ( Scanner ler );
    
    public abstract void ligarMudo ( ) ;
    public abstract void desligarMudo ( ) ;
    
    public abstract void play ( ) ;
    public abstract void pause ( ) ;
}
