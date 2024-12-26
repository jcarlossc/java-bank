package edu.jcsc.classes.transacao;


/**
 * Classe Deposito, derivada da classe Transacao.
 * 
 * @author Carlos da Costa
 * @version 1.0
 */
public class Deposito extends Transacao {

    private final String TIPO_TRANSACAO = "Depósito";

    /**
     * Método construtor da classe Deposito.
     * 
     * @param valor do tipo Double
     */
    public Deposito(Double valor) {
        super(valor);
    }

    /**
     * Método getTipoTransacao.
     * 
     * @return tipo de transacao
     */
    @Override
    public String getTipoTransacao() {
        return TIPO_TRANSACAO;
    }
   
}

