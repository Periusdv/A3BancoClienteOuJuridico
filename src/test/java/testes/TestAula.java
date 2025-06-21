package testes;

import aula.AulaUI;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.*;

class TestAula {
    
    private String executarComLogger(String inputSimulado) {
        ByteArrayInputStream inputSimuladoStream = new ByteArrayInputStream(inputSimulado.getBytes());
        Scanner scanner = new Scanner(inputSimuladoStream);
        
        ByteArrayOutputStream logCapturado = new ByteArrayOutputStream();
        StreamHandler handler = new StreamHandler(logCapturado, new SimpleFormatter());
        
        Logger logger = Logger.getLogger("aula.AulaUI");
        logger.setUseParentHandlers(false);
        logger.addHandler(handler);
        logger.setLevel(Level.INFO);
        
        new AulaUI().executar(scanner);
        
        handler.flush();
        
        return logCapturado.toString();
    }

    @Test
    void testPessoaJuridicaComContas() {
        String input = String.join(System.lineSeparator(), "1", "João", "1", "12345678000199", "1", "5000,0", "1", "0,05", "2");
        String output = executarComLogger(input);
        
        assertTrue(output.contains("Informe o nome da Pessoa"));
        assertTrue(output.contains("Informe o CNPJ"));
        assertTrue(output.contains("Informe o Salário"));
        assertTrue(output.contains("Informe o Rendimento"));
    }

    @Test
    void testPessoaJuridicaSemContas() {
        String input = String.join(System.lineSeparator(), "2", "Ana", "1", "98765432000188", "2", "2", "2");
        String output = executarComLogger(input);
        
        assertTrue(output.contains("Informe o nome da Pessoa"));
        assertTrue(output.contains("Informe o CNPJ"));
    }

    @Test
    void testPessoaFisicaSomenteContaCorrente() {
        String input = String.join(System.lineSeparator(), "2", "Bernardo", "2", "12345678900", "1", "3000,0", "2", "2");
        String output = executarComLogger(input);
        
        assertTrue(output.contains("Informe o nome da Pessoa"));
        assertTrue(output.contains("Informe o CPF"));
        assertTrue(output.contains("Informe o Salário"));
    }

    @Test
    void testPessoaFisicaSomentePoupanca() {
        String input = String.join(System.lineSeparator(), "3", "Maria", "2", "98765432111", "2", "1", "0,03", "2");
        String output = executarComLogger(input);
        
        assertTrue(output.contains("Informe o nome da Pessoa"));
        assertTrue(output.contains("Informe o CPF"));
        assertTrue(output.contains("Informe o Rendimento"));
    }
}
