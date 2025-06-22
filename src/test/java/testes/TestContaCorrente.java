package testes;

import aula.Agencia;
import aula.ContaCorrente;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestContaCorrente {

    private ContaCorrente contacorrente;
    private Agencia agencia;

    @BeforeEach
    void setUp() {
        agencia = new Agencia(1);
        contacorrente = new ContaCorrente(1234, 2500.0, agencia);
    }

    @Test
    void testGetSalario() {
        assertEquals(2500.0, contacorrente.getSalario(), 0.01);
    }

    @Test
    void testSetSalario() {
        contacorrente.setSalario(2500.0);
        assertEquals(2500.0, contacorrente.getSalario(), 0.01);
    }

    @Test
    void testNumeroConta() {
        assertEquals(1234, contacorrente.getNumero());
    }

    @Test
    void testAgenciaConta() {
        assertEquals(1, contacorrente.getAgencia().getNumero());
    }

    @Test
    void testImprimir() {
        //Obtém logger na classe ContaCorrente
        Logger logger = Logger.getLogger(ContaCorrente.class.getName());

        //Cria um handler personalizado para capturar os logs gerados no teste
        TestLogHandler handler = new TestLogHandler();
        logger.addHandler(handler);

        //Evita que os logs sejam exibidos no console durante o teste
        logger.setUseParentHandlers(false);

        //Cria uma instancia para Agencia
        Agencia agenciaTeste = new Agencia(2);

        //Cria uma instacia de ContaCorrente (número, salário e agência)
        ContaCorrente contaCorrente = new ContaCorrente(123, 2000.0, agenciaTeste);

        //Realiza depósito para alterar o saldo
        contaCorrente.imprimir();

        //Verifica se os logs capturados contem as palavras esperadas
        boolean logContemTextoEsperado = handler.getLog().stream().anyMatch(msg -> msg.contains("Conta Corrente") && msg.contains("Salário"));

        //Asserção para garantir que o log foi capturado com sucesso
        assertTrue(logContemTextoEsperado, "O log deveria conter as informações da conta.");
    }

    @Test
    void testSetSaldo() {
        contacorrente.setSaldo(500.0);
        assertEquals(500.0, contacorrente.getSaldo(), 0.001);
    }

    @Test
    void testSetAgencia() {
        Agencia novaAgencia = new Agencia(99);
        contacorrente.setAgencia(novaAgencia);
        assertEquals(99, contacorrente.getAgencia().getNumero());
    }

    @Test
    void testSetNumero() {
        contacorrente.setNumero(777);
        assertEquals(777, contacorrente.getNumero());
    }

    @Test
    void testSacarComSaldoSuficiente() {
        contacorrente.setSaldo(200.0);
        contacorrente.sacar(100.0);
        assertEquals(100.0, contacorrente.getSaldo(), 0.001);
    }

    @Test
    void testSacarComSaldoInsuficiente() {
        contacorrente.setSaldo(50.0);
        contacorrente.sacar(100.0); // Não deve sacar nada
        assertEquals(50.0, contacorrente.getSaldo(), 0.001);
    }

    /**
     * Classe interna do handler customizado Propósito de capturar os logs
     * gerados no teste
     */
    static class TestLogHandler extends Handler {

        private final java.util.List<String> logMessages = new java.util.ArrayList<>();

        //Captura cada mensagen de log
        @Override
        public void publish(LogRecord logRecord) {
            logMessages.add(logRecord.getMessage());
        }

        @Override
        public void flush() {
            //Métodos obrigatórios no handler, mas não utilizado
        }

        @Override
        public void close() throws SecurityException {
            //Métodos obrigatórios no handler, mas não utilizado
        }

        //Retorna as mensagens dos logs capturados
        public java.util.List<String> getLog() {
            return logMessages;
        }
    }
}
