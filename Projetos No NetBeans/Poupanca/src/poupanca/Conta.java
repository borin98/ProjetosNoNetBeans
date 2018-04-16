/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poupanca;

import java.util.Scanner ;

/**
 *
 * @author Borin
 */
public class Conta
{
    Scanner ler = new Scanner ( System.in ) ;
        
    private String numConta, tipo, dono, status ;
    private float saldo ;

     public Conta ( Scanner ler )
    {
        
        this.criarConta( ler ) ;
        
    }
    
    /**
     *
     * @param dono
     */
    public void setDono(String dono)
    {
        this.dono = dono;
    }

    /**
     * @return the numConta
     */
    public String getNumConta()
    {
        return numConta;
    }

    /**
     * @param numConta the numConta to set
     */
    public void setNumConta(String numConta)
    {
        this.numConta = numConta;
    }

    /**
     * @return the tipo
     */
    public String getTipo()
    {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }

    /**
     * @return the dono
     */
    public String getDono()
    {
        return dono;
    }

    /**
     * @return the status
     */
    public String getStatus()
    {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status)
    {
        this.status = status;
    }

    /**
     * @return the saldo
     */
    public float getSaldo()
    {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(float saldo)
    {
        this.saldo = saldo;
    }
    
    public void fecharConta ( )
    {
        
        System.out.println("\nObrigado por utilizar nosso serviço !!!");
        
    }
    
    public void depositar ( Scanner ler )
    {
        float dinheiro, aux ;
        
        System.out.print("\nDigite a quantidade de dinheiro que deseja depositar : R$ ") ;
        dinheiro = ler.nextFloat ( ) ;
        aux = this.getSaldo ( ) ;
        dinheiro += aux ;
        this.setSaldo( dinheiro ) ;
    
        System.out.println("\n Valor atual da conta : R$ "+this.getSaldo ( ));
        
    }
    
    public void sacar ( Scanner ler )
    {
        
        float saque, aux ;
        System.out.print("\nDigite a quantidade de dinheiro que deseja sacar : R$ ") ;
        saque = ler.nextFloat ( ) ;
        aux = this.getSaldo ( ) ;
        aux -= saque ;
        this.setSaldo( saque ) ;
        
        System.out.println("\n Valor atual da conta : R$ "+this.getSaldo ( ));
        
    }
    
    public void pagarConta ( Scanner ler )
    {
        
       float saque, aux ;
        System.out.print("\nDigite o valor da conta que deseja pagar : R$ ") ;
        saque = ler.nextFloat ( ) ;
        aux = this.getSaldo ( ) ;
        aux -= saque ;
        this.setSaldo( aux ) ; 
        
        System.out.println("\n Valor atual da conta : R$ "+this.getSaldo ( ));
        
    }
    
    /**
     *
     * @param ler
     */
     
    public void criarConta ( Scanner ler )
    {
        String nome ;
        
        float saldo ;
        
        System.out.println("\nBem - Vindo à criação de conta bancária ! ") ;
        
        System.out.print("\nDigite o nome para registrar na conta : ") ;
        nome = ler.nextLine ( ) ;
        this.setDono( nome );
        
        System.out.print("\nDigite o número da conta : ") ;
        nome = ler.nextLine ( ) ;
        this.setNumConta( nome ) ;
        
        System.out.print("\nDigite o tipo de conta : ") ;
        nome = ler.next ( ) ;
        this.setTipo( nome ) ;
        
        System.out.print("\nDigite o valor inicial da conta : R$ ") ;
        saldo = ler.nextFloat ( ) ;
        this.setSaldo( saldo ) ;
        
    }
    
    public void abrirConta ( Scanner ler )
    {
        int opcao ;
        int sair = 0 ;
        
        System.out.println("\nBem - Vindo "+this.getDono ( )+" Com conta do tipo "+this.getTipo ( ) ) ;
        
        while ( sair != 1 )
        {
            System.out.println("\n--------------------------------\n") ;
            
            System.out.println("\nDigite uma opção de conta : ") ;
            
            System.out.println("\n--------------------------------\n") ;
            
            System.out.println("\n 0 para fechar a conta ") ;
            System.out.println("\n 1 para depositar na conta ") ;
            System.out.println("\n 2 para sacar dinhero da conta ") ;
            System.out.println("\n 3 para pagar contas \n") ;
                        
            opcao = ler.nextInt ( ) ;
            
            if ( opcao > 3 )
            {
                
                System.out.println("\nOpção inválida !!!") ;
                continue ;
            }
           
            switch (opcao)
            {
                case 0:
                    this.fecharConta ( ) ;
                    break;
                case 1:
                    this.depositar ( ler ) ;
                    break;
                case 2:
                    this.sacar( ler ) ;
                    break;
                default:
                    break;
            }
            
        }
           
    }
    
}
