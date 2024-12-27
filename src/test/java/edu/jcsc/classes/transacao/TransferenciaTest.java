package edu.jcsc.classes.transacao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TransferenciaTest {
    @Test
    void testGetTipoTransacao() {
        Transferencia transferencia = new Transferencia(500.00);
        String atual = transferencia.getTipoTransacao();
        
        assertEquals("Transferência", atual, "O resultado deve ser igual a string Tranferência."); 
    }
}
