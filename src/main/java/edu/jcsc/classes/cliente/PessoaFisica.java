package edu.jcsc.classes.cliente;

import edu.jcsc.classes.log.Logger;

/**
 * Classe PessoaFísica, derivada da classe Cliente.
 * 
 * @author Carlos da Costa
 * @version 1.0
 */
public class PessoaFisica extends Cliente {

    private Logger logs;
    /**
     * Método constutor da classe Pessoa.
     * Contém um log informativo.
     * 
     * @param nome 
     * @param cpf 
     */
    public PessoaFisica(String nome, String cpf) {
        super(nome, cpf);
        this.logs = Logger.getInstance();
        logs.log("INFO", "Sistema iniciado.");
    }

    /**
     * Converte objeto para string.
     * 
     * @return uma representação string.
     */
    @Override
    public String toString() {
        return "PessoaFisica " + "[" + "Nome: " + getNome() + " | " + "Cpf: " + getCpf() + "]";
    }

}
