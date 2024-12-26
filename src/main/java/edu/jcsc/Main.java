package edu.jcsc;

import edu.jcsc.classes.cliente.PessoaFisica;
import edu.jcsc.classes.conta.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        
        PessoaFisica pf1 = new PessoaFisica("carlos", "12345678944");
        System.out.println(pf1);
        PessoaFisica pf2 = new PessoaFisica("carlos", "12345678944");
        System.out.println(pf2);

        ContaCorrente cc1 = new ContaCorrente(pf1);
        System.out.println(cc1);
        ContaCorrente cc2 = new ContaCorrente(pf1);
        System.out.println(cc2);

        cc1.depositar(1000.00);
        System.out.println(cc1.getSaldo());
        cc1.sacar(100.00);
        System.out.println(cc1.getSaldo());
        cc1.transferir(cc2, 100.00);
        System.out.println(cc1.getSaldo());

        cc1.depositar(0.0);
        System.out.println(cc1.getSaldo());
        cc1.depositar(-50.00);
        System.out.println(cc1.getSaldo());

        cc1.sacar(0.00);
        System.out.println(cc1.getSaldo());
        cc1.sacar(-100.00);
        System.out.println(cc1.getSaldo());

        cc1.transferir(cc2, 0.0);
        System.out.println(cc1.getSaldo());
        cc1.transferir(cc2, -50.0);
        System.out.println(cc1.getSaldo());

        System.out.println(cc1.getSaldo());
        cc1.sacar(5000.00);
        System.out.println(cc1.getSaldo());
        cc1.transferir(cc2, 50000.00);
        System.out.println(cc1.getSaldo());

        System.out.println(cc2.getSaldo());
    }
}