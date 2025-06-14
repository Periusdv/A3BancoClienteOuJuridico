package testes;

import aula.Agencia;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestAgencia {
    
    @Test
    public void testConstrutorAgencia() {
        Agencia agencia = new Agencia(1);
        assertEquals(1, agencia.getNumero(), "O número da agência deve ser 1");
    }
    
    @Test
    public void testSetNumero() {
        Agencia agencia = new Agencia(1);
        agencia.setNumero(1);
        assertEquals(1, agencia.getNumero(), "O número da agência deve ser 1 após setNumero");
    }
    
    @Test
    public void testGetNumero() {
        Agencia agencia = new Agencia(1);
        int numero = agencia.getNumero();
        assertEquals(1, numero, "getNumero deve retornar o valor atribuido no construtor");
    }
}
