package edu.jcsc.classes.cliente;

/**
 * Classe Cliente.
 * 
 * @author Carlos da Costa
 * @version 1.0
 */
public class Cliente {

    private String nome;
    private String cpf;
    
    /**
     * Método construtor da classe Cliente.
     * 
     * @param nome 
     * @param cpf 
     */
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    /**
     * Método getNome.
     * 
     * @return nome do Cliente.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método getCpf.
     * 
     * @return cpf do Cliente.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Converte objeto para string.
     * 
     * @return uma representação string.
     */
    @Override
    public String toString() {
        return "Cliente " + "[" + "Nome: " + nome + ", Cpf: " + cpf + "]";
    }

}

