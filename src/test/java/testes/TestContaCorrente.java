package testes;

import aula.Agencia;
import aula.ContaCorrente;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestContaCorrente {
    
    private ContaCorrente contacorrente;
    private Agencia agencia;
    
    @BeforeEach
    public void setUp() {
        agencia = new Agencia(1);
        contacorrente = new ContaCorrente(1234, 2500.0, agencia);
    }
    
    @Test
    public void testGetSalario() {
        assertEquals(2500.0, contacorrente.getSalario(), 0.01);
    }
    
    @Test
    public void testSetSalario() {
        contacorrente.setSalario(2500.0);
        assertEquals(2500.0, contacorrente.getSalario(), 0.01);
    }
    
    @Test
    public void testNumeroConta() {
        assertEquals(1234, contacorrente.getNumero());
    }
    
    @Test
    public void testAgenciaConta() {
        assertEquals(1, contacorrente.getAgencia().getNumero());
    }
    
    @Test
    void testImprimir() {
        contacorrente.imprimir();
    }
}
