package edu.jcsc.classes.conta;

import edu.jcsc.classes.cliente.Cliente;
import edu.jcsc.classes.log.Logger;
import edu.jcsc.classes.transacao.Deposito;
import edu.jcsc.classes.transacao.Saque;
import edu.jcsc.classes.transacao.Transferencia;

/**
 * Classe ContaPupanca, derivada da classe Conta.
 * 
 * @author Carlos da Costa
 * @version 1.0
 */
public class ContaPoupanca extends Conta {
    
    public final String TIPO_CONTA = "Conta Poupança";
    private Logger logs;
    
     /**
     * Método construtor da classe ContaPoupanca.
     * 
     * @param Cliente
     * @param endereco
     * @param telefone
     */
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        this.logs = Logger.getInstance();
    }

     /**
     * Método depositar.
     * 
     * @param valor do tipo Double
     * @exception Exception para valores Double negativos e nulos.
     */
    @Override
    public void depositar(Double valor) {
        try {
            if(valor <= 0 || valor == null) {
                System.out.println("O valor não pode ser nulo ou vazio.");
                logs.log("WARNING", "Tentativa de operação com entrada nula ou número negativo.");
            } else {
                this.saldo += valor;
                historico.addTransacao(new Deposito(valor));
            }
        } catch(Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
    }

     /**
     * Método sacar.
     * 
     * @param valor do tipo Double
     * @exception Exception para valores Double negativos e nulos.
     */
    @Override
    public void sacar(Double valor) {
        try {
            if(valor <= 0 || valor == null ) {
                System.out.println("O valor não pode ser nulo ou vazio.");
                logs.log("WARNING", "Tentativa de operação com entrada nula ou número negativo.");
            }else if(this.saldo < valor) {
                System.out.println("Saldo insuficiente.");
                logs.log("WARNING", "Tentativa de operação com saldo insuficiente..");
            }else {
                this.saldo -= valor;
                historico.addTransacao(new Saque(valor));
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

     /**
     * Método transferir.
     * 
     * @param valor do tipo Double
     * @exception Exception para valores Double negativos, nulos e saldo insuficiente.
     */
    @Override
    public void transferir(Conta contaDestino, Double valor) {
        try {
            if(valor < 0 || valor == null) {
                System.out.println("O valor não pode ser nulo ou vazio.");
                logs.log("WARNING", "Tentativa de operação com entrada nula ou número negativo.");
            }else if(this.saldo < valor) {  
                System.out.println("Saldo insuficiente.");
                logs.log("WARNING", "Tentativa de operação com saldo insuficiente.");
            }else {
                this.saldo -= valor;
                contaDestino.saldo += valor;
                historico.addTransacao(new Transferencia(valor));
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

     /**
     * Método getTipoConta.
     * 
     * @return tipo da conta.
     */
    @Override
    public String getTipoConta() {
        return TIPO_CONTA;
    }

}
