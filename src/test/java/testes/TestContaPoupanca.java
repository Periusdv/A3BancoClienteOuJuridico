package testes;

import aula.Agencia;
import aula.ContaPoupanca;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestContaPoupanca {
    
    private ContaPoupanca contaPoupanca;
    private Agencia agencia;
    
    @BeforeEach
    public void setUp() {
        agencia = new Agencia(1);
        contaPoupanca = new ContaPoupanca(1234, 0.05, agencia);
    }
    
    @Test
    public void testGetRendimento() {
        assertEquals(0.05, contaPoupanca.getRendimento());
    }
    
    @Test
    public void testSetRendimento() {
        contaPoupanca.setRendimento(0.07);
        assertEquals(0.07, contaPoupanca.getRendimento());
    }
    
    @Test
    public void testImprimir() {
        contaPoupanca.imprimir();
    }
}
