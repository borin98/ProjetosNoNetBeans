/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telainterativa;

import javax.swing.JOptionPane ;

/**
 *
 * @author Borin
 */
public class TelaInterativa 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    
       int n ;
       
       double media = 0 ;
       int acimaDeCem = 0 ;
       int impar = 0 ;
       int par = 0;
       int soma = 0 ;
       int valores = 0 ;
       
       do
       {
           
           n = Integer.parseInt( JOptionPane.showInputDialog(null, "<html>Informe um número :<br><em> ( valor 0 para terminar )</em></html> ") ) ;
           
           soma += n ;
           valores += 1 ;
           
           if ( n > 100 )
           {
               
               acimaDeCem += 1 ;
               
           }
          
           if ( n%2 == 0 && n != 0 )
           {
               
               par += 1 ;
               
           }
           
           else if ( n%2 != 0 )
           {
               
               impar += 1 ;
               
           }
          
           
           
       } while ( n != 0 ) ;
    
       media = soma/valores ;
        
       valores -= 1 ;
       
       JOptionPane.showMessageDialog(null, "<html> Resultado Final( Excluindo zero ) <hr>"+
                                           "<br>Total Valores : "+valores+
                                           "<br>Total de Pares : "+par+
                                           "<br>Total de Ímpares : "+impar+
                                           "<br>Acima de 100 : "+acimaDeCem+
                                           "<br>Média dos Valores : "+media+"</html>") ;
       
    }
    
}
