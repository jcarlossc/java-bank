package edu.jcsc.classes.transacao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SaqueTest {
    @Test
    void testGetTipoTransacao() {
        Saque saque = new Saque(500.00);
        String atual = saque.getTipoTransacao();
        
        assertEquals("Saque", atual, "O resultado deve ser igual a string Saque."); 
    }
    
}
