package testes;

import aula.AulaUI;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;

public class TestAula {
    
    @Test
    public void testPessoaJuridicaComContas() {
        String input = String.join(System.lineSeparator(), "1", "João", "1", "12345678000199", "1", "5000,0", "1", "0,05");
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        new AulaUI().executar();
    }
    
    @Test
    public void testPessoaJuridicaSemContas() {
        String input = String.join(System.lineSeparator(), "2", "Ana", "1", "98765432000188", "2", "2");
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        new AulaUI().executar();
    }
    
    @Test
    public void testPessoaFisicaSomenteContaCorrente() {
        String input = String.join(System.lineSeparator(), "2", "Bernardo", "2", "12345678900", "1", "3000,0", "2");
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        new AulaUI().executar();
    }
    
    @Test
    public void testPessoaFisicaSomentePoupanca() {
        String input = String.join(System.lineSeparator(), "3", "Maria", "2", "98765432111", "2", "1", "0,03");
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        new AulaUI().executar();
    }
}
