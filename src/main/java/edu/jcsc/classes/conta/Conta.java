package edu.jcsc.classes.conta;

import edu.jcsc.classes.cliente.Cliente;
import edu.jcsc.classes.historico.Historico;

/**
 * Classe Conta.
 * 
 * @author Carlos da Costa
 * @version 1.0
 */
public abstract class Conta {
    
    protected Cliente cliente;
    protected Double saldo;
    protected Historico historico;

    /**
     * Método construtor da classe Conta.
     * 
     * @param Cliente
     */
    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.saldo = 0.0;
        this.historico = new Historico();
    }

    /**
     * Método abstrato depositar.
     * 
     * @param valor
     * @throws Exception 
     */
    public abstract void depositar(Double valor) throws Exception;

    /**
     * Método abstrato sacar.
     * 
     * @param valor
     */
    public abstract void sacar(Double valor);

    /**
     * Método abstrato transferir.
     * 
     * @param valor
     */
    public abstract void transferir(Conta contaDestino, Double valor);

    /**
     * Método abstrato tipo conta.
     * 
     * @return tipo de conta
     */
    public abstract String getTipoConta();

    /**
     * Método getCliente.
     * 
     * @return Cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Método getSaldo.
     * 
     * @return saldo.
     */
    public Double getSaldo() {
        return saldo;
    }

    /**
     * Método getHistorico.
     * 
     * @return histórico
     */
    public Historico getHistorico() {
        return historico;
    }

    /**
     * Converte objeto para string.
     * 
     * @return uma representação string.
     */
    @Override
    public String toString() {
        return "Conta" + "[" + cliente + " | " + "saldo: R$ " + saldo + "]";
    }

}
