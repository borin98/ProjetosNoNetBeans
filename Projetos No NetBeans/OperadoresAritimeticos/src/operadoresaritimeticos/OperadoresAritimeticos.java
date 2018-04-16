/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritimeticos;

import java.util.Scanner ;
/**
 *
 * @author Borin
 */
public class OperadoresAritimeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    
       /* float n1 ;
        float n2 ;
     
        Scanner ler = new Scanner ( System.in ) ;
        
        System.out.print("\nDigite a nota da primeira prova : ");
        n1 = ler.nextFloat() ;
        
        System.out.print("\nDigite a nota da segunda prova : ");
        n2 = ler.nextFloat (  ) ;
        
        System.out.print("\nA media das provas foram : "+( (n1+n2 )/2));*/
        
        
        int numero = 5 ;
        //numero++ ;
        //System.out.println(numero);
        
        int valor = numero + ++numero ;
        
        System.out.println("\nPrimeiro caso : \n");
        
        System.out.println(valor);
        System.out.println( numero );
    
        System.out.println("\n------------------------------\n");
        
        numero = 5 ;
        
        valor = numero + numero++ ;
        
        System.out.println( valor );
        System.out.println ( numero );
        
        System.out.println("\n------------------------------\n");
        
        
    }
    
    
    
}
