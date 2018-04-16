/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poupanca;

import java.util.Scanner;

/**
 *
 * @author Borin
 */
public class Poupanca
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
        Scanner ler = new Scanner ( System.in ) ;
        
        Conta conta = new Conta ( ler ) ;
        conta.abrirConta( ler ) ;
        
       
    }
    
}
