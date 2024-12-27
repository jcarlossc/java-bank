package edu.jcsc.classes.transacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Classe Transacao.
 * 
 * @author Carlos da Costa
 * @version 1.0
 */
public abstract class Transacao {
    
    protected Double valor;
    protected String dataHora;
    private static final DateTimeFormatter formatar = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

       /**
     * Método construtor da classe Transacao.
     * 
     * @param valor do tipo Double
     */
    public Transacao(Double valor) {
        this.valor = valor;
        this.dataHora = LocalDateTime.now().format(formatar);
    }

    /**
     * Método getTipoTransacao.
     * 
     * @return tipo de transação do tipo string
     */
    public abstract String getTipoTransacao();

       /**
     * Método getValor.
     * 
     * @return valor
     */
    public Double getValor() {
        return valor;
    }

      /**
     * Método getDataHora.
     * 
     * @return data e hora da transação
     */
    public String getDataHora() {
        return dataHora;
    }

     /**
     * Converte objeto para string.
     * 
     * @return uma representação string.
     */
    @Override
    public String toString() {
        return "Transacao " + "[" + "Tipo: " + getTipoTransacao() + " | " + "Valor: R$ " + valor + " | " + "DataHora: " + getDataHora() + "]";
    }
    
}
