package edu.jcsc.classes.transacao;

/**
 * Classe Saque, derivada da classe Transacao.
 * 
 * @author Carlos da Costa
 * @version 1.0
 */
public class Saque extends Transacao {
    
    private final String TIPO_TRANSACAO = "Saque";

      /**
     * Método construtor da classe Saque.
     * 
     * @param valor do tipo Double
     */
    public Saque(Double valor) {
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
