package edu.jcsc.classes.historico;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import edu.jcsc.classes.transacao.Transacao;

/**
 * Classe Historico.
 * 
 * @author Carlos da Costa
 * @version 1.0
 */
public class Historico implements Iterable<Transacao> {

    private List<Transacao> transacoes;
    
    /**
     * Método construtor da classe Histotico.
     * 
     */
    public Historico() {
        transacoes = new ArrayList<>();
    }

    /**
     * Método addTransacao.
     * 
     * @param transacao 
     */
    public void addTransacao(Transacao transacao) {
        this.transacoes.add(transacao);
    }

    /**
     * Método iterator.
     * 
     * @return lista de transações.
     */
    @Override
    public Iterator<Transacao> iterator() {
        return transacoes.iterator();
         
    }

    /**
     * Converte objeto para string.
     * 
     * @return uma representação string.
     */
    @Override
    public String toString() {
        return "Histórico " + "[" + "Transacões: " + transacoes + "]";
    }

}
