package edu.jcsc.classes.cliente;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ClienteTest {

    Cliente cliente = new Cliente("jose","44345678944");

    @Test
    void testGetCpf() {
        String atual = cliente.getCpf();
        assertEquals("44345678944", atual, "O resultado deve ser 44345678944");
    }

    @Test
    void testGetNome() {
        String atual = cliente.getNome();
        assertEquals("jose", atual, "O resultado deve ser jose");
    }

    @Test
    void testToString() {     
        String atual = cliente.toString();
        assertEquals("Cliente [Nome: jose, Cpf: 44345678944]", atual, "O resultado deve ser igual a string");
    }
}
