package edu.jcsc.classes.conta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.jcsc.classes.cliente.PessoaFisica;

public class ContaCorrenteTest {

    PessoaFisica pf1 = new PessoaFisica("soares", "98765432111");
    ContaCorrente cc1 = new ContaCorrente(pf1);
    PessoaFisica pf2 = new PessoaFisica("costa", "11165432111");
    ContaCorrente cc2 = new ContaCorrente(pf1);

    @Test
    void testDepositar() {
        cc1.depositar(500.00);
        Double atual = cc1.getSaldo();
        assertEquals(500.00, atual, "O resultado deve ser 500.00");
    }

    @Test
    void testGetTipoConta() {
        String atual = cc1.getTipoConta();
        assertEquals("Conta Corrente", atual, "O resultado deve ser Conta Corrente");
    }

    @Test
    void testSacar() {
        cc1.depositar(500.00);
        cc1.sacar(400.00);
        Double atual = cc1.getSaldo();
        assertEquals(100.00, atual, "O resultado deve ser 100.00");
    }

    @Test
    void testTransferir() {
        cc1.depositar(500.00);
        cc1.transferir(cc2, 300.00);
        Double atual = cc2.getSaldo();
        assertEquals(300.00, atual, "O resultado deve ser 300.00");
    }
}
