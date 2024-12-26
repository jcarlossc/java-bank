package edu.jcsc.classes.transacao;

/**
 * Classe Tranferencia, derivada da classe Transacao.
 * 
 * @author Carlos da Costa
 * @version 1.0
 */
public class Transferencia extends Transacao {
    
    private final String TIPO_TRANSACAO = "Transferência";

        /**
     * Método construtor da classe Tranferencia.
     * 
     * @param valor do tipo Double
     */
    public Transferencia(Double valor) {
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

