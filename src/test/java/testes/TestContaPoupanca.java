package testes;

import aula.Agencia;
import aula.ContaPoupanca;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
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
        Logger logger = Logger.getLogger(ContaPoupanca.class.getName());
        TestLogHandler handler = new TestLogHandler();
        logger.addHandler(handler);
        logger.setUseParentHandlers(false);
        
        Agencia agenciaTeste = new Agencia(3);
        ContaPoupanca contaPoupanca = new ContaPoupanca(765, 0.07, agenciaTeste);
        contaPoupanca.depositar(1000);
        
        contaPoupanca.imprimir();
        
        String logs = handler.getLog();
        assertTrue(logs.contains("Conta Poupança"));
        assertTrue(logs.contains("Saldo Atual"));
    }
    
    static class TestLogHandler extends Handler {
        
        private final StringBuilder log = new StringBuilder();
        
        @Override
        public void publish(LogRecord logRecord) {
            log.append(logRecord.getMessage()).append("\n");
        }
        
        @Override
        public void flush() {
            //Métodos obrigatórios no handler, mas não utilizado
        }
        
        @Override
        public void close() throws SecurityException {
            //Métodos obrigatórios no handler, mas não utilizado
        }
        
        public String getLog() {
            return log.toString();
        }
    }
}
