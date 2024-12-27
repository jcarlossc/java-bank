package edu.jcsc.classes.transacao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TransacaoTest {

    @Test
    void testGetTipoTransacao() {
        Deposito deposito = new Deposito(500.00);
        String atual = deposito.getTipoTransacao();
        
        assertEquals("Depósito", atual, "O resultado deve ser igual a string Depósito."); 
    }

    @Test
    void testGetValor() {
        Deposito deposito = new Deposito(500.00);
        Double atual = deposito.getValor();
        
        assertEquals(500.00, atual, "O resultado deve ser igual a 500.00"); 
    }

}
