/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificaseemaiordeidade;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Borin
 */
public class VerificaSeEMaiorDeIdade 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    
        Calendar cal = GregorianCalendar.getInstance(); 
        Scanner ler = new Scanner ( System.in ) ;
        
        System.out.print("\nDigite o seu ano de nascimento : ") ;
        int anoNascimento = ler.nextInt ( ) ;
    
        int anoAtual = cal.get( Calendar.YEAR ) ;
        
        int idade =  anoAtual - anoNascimento ;
        
        System.out.println("Sua idade é : "+idade) ;
        
        if ( idade >= 18 )
        {
            
            System.out.println("\nVocê é maior de idade !!!");
            
        }
        
        else
        {
            
            System.out.println("\nVocê é menor de idade !!!");
            
        }
        
    }
    
}
