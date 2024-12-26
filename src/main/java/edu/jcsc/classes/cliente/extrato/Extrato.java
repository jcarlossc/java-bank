package edu.jcsc.classes.cliente.extrato;

import edu.jcsc.classes.conta.Conta;
import edu.jcsc.classes.transacao.Transacao;

/**
 * Classe Extrato.
 * 
 * @author Carlos da Costa
 * @version 1.0
 */
public class Extrato {

    /**
     * Método estático.
     * 
     * @param conta do tipo Conta
     */
    public static void getExtrato(Conta conta) {

        System.out.print("\n------------------------------ ");
        System.out.print("JAVA BANK");
        System.out.print(" ------------------------------\n");
        System.out.println("EXTRATO");
        System.out.println("Tipo: " + conta.getTipoConta());
        System.out.println("Cliente: " + conta.getCliente().getNome());
        System.out.println("Cpf: " + conta.getCliente().getCpf());
        System.out.println("Saldo: R$ " + conta.getSaldo());
        System.out.println("\nTRANSAÇÕES");
        for(Transacao transacoes : conta.getHistorico()) {
            System.out.println(transacoes);
        }
        System.out.print("\n------------------------------ ");
        System.out.print("OBRIGADO");
        System.out.print(" ------------------------------\n");
    }
}
