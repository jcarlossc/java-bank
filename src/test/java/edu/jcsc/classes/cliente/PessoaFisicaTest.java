package edu.jcsc.classes.cliente;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PessoaFisicaTest {

    PessoaFisica pessoaFisica = new PessoaFisica("carlos","12345678944");

    @Test
    void testToString() {
        String atual = pessoaFisica.toString();
        assertEquals("PessoaFisica [Nome: carlos | Cpf: 12345678944]", atual, "O resultado deve ser igual a string.");
    }
}
