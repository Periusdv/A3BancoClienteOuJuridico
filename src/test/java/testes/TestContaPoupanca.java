package testes;

import aula.Agencia;
import aula.ContaPoupanca;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
 class TestContaPoupanca {
    
    private ContaPoupanca contaPoupanca;
    private Agencia agencia;
    
    @BeforeEach
    void setUp() {
        agencia = new Agencia(1);
        contaPoupanca = new ContaPoupanca(1234, 0.05, agencia);
    }
    
    @Test
    void testGetRendimento() {
        assertEquals(0.05, contaPoupanca.getRendimento());
    }
    
    @Test
    void testSetRendimento() {
        contaPoupanca.setRendimento(0.07);
        assertEquals(0.07, contaPoupanca.getRendimento());
    }
    
    @Test
    void testImprimir() {
        contaPoupanca.imprimir();
    }
}
