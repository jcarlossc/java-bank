package edu.jcsc.classes.transacao;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositoTest {

    @Test
    void testGetTipoTransacao() {
        Deposito deposito = new Deposito(500.00);
        String atual = deposito.getTipoTransacao();
        
        assertEquals("Depósito", atual, "O resultado deve ser igual a string Depósito."); 
    }
}
