package testes;

import aula.AulaServico;
import aula.AulaUI;
import aula.ContaCorrente;
import aula.ContaPoupanca;
import aula.Pessoa;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Test
    void testExecutarLoopOperacoes() throws Exception {
        // Simula as entradas do usuario
        String inputSimulado = String.join("\n", 
                "1", // Conta Corrente 
                "1", // Depositar
                "100,00",
                "2", // Conta Poupança
                "3", // Imprimir
                "3" // Sair
        );
        
        // Scanner que simula a entrada do usuario 
        Scanner scanner = new Scanner(new ByteArrayInputStream(inputSimulado.getBytes()));
        // Ajusta o Locale para pt_BR para interpretar vírgula como separador decimal
        scanner.useLocale(new Locale("pt", "BR"));
        
        // Instancia o servico da aplicação
        AulaServico servico = new AulaServico();
        
        // Cria uma pessoa fisica
        Pessoa pessoa = servico.criarPessoaFisica("João", "12345678900");
        
        // Cria uma conta poupança e corrente
        ContaCorrente cc = servico.criarContaCorrente(2000.0, 1);
        ContaPoupanca cp = servico.criarContaPoupanca(0.02, 1);
        
        // Adiciona as contas as listas de contas
        pessoa.setListaContas(cc);
        pessoa.setListaContas(cp);
        
        // Instancia a interface 
        AulaUI ui = new AulaUI();
        
        // Usa reflexão para acessar o método privado "executarLoopOperacoes" 
        Method metodo = AulaUI.class.getDeclaredMethod("executarLoopOperacoes", Scanner.class, Pessoa.class, ContaCorrente.class, ContaPoupanca.class);
        metodo.setAccessible(true);// Permite acessar método privado
        
        // Executa o método com os parametros simulados
        metodo.invoke(ui, scanner, pessoa, cc, cp);
        
        // Verifica se o saldo foi atualizado corretamente
        assertEquals(100.0, cc.getSaldo(), 0.01);
    }
}
