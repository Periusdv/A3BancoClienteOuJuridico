package aula;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AulaUI {

    private static final Logger LOGGER = Logger.getLogger(AulaUI.class.getName());

    private void processoConta(Scanner input, AulaServico servico, Pessoa pessoa, int numAgencia) {
        ContaCorrente cc = criarContaCorrente(input, servico, pessoa, numAgencia);
        ContaPoupanca cp = criarContaPoupanca(input, servico, pessoa, numAgencia);

        if (!desejaFazerOperacaoBancaria(input)) {
            return;
        }
        executarLoopOperacoes(input, pessoa, cc, cp);
    }

    private void mostrarDadosConta(Conta conta) {
        if (LOGGER.isLoggable(Level.INFO)) {
            LOGGER.info(String.format("O número da sua conta é: %d, %nO número da sua agência é: %d", conta.getNumero(), conta.getAgencia().getNumero()));
        }
    }

    private ContaCorrente criarContaCorrente(Scanner input, AulaServico servico, Pessoa pessoa, int numAgencia) {
        LOGGER.info("Deseja criar uma Conta Corrente?\n1-Sim | 2-Não");
        if (input.nextInt() != 1) {
            return null;
        }

        LOGGER.info("Informe o Salário: ");
        double salario = Double.parseDouble(input.next().replace(",", "."));

        ContaCorrente cc = servico.criarContaCorrente(salario, numAgencia);
        pessoa.setListaContas(cc);
        mostrarDadosConta(cc);
        return cc;
    }

    private ContaPoupanca criarContaPoupanca(Scanner input, AulaServico servico, Pessoa pessoa, int numAgencia) {
        LOGGER.info("Deseja criar uma Conta Poupança?\n1-Sim | 2-Não");
        if (input.nextInt() != 1) {
            return null;
        }

        LOGGER.info("Informe o Rendimento: ");
        double rendimento = Double.parseDouble(input.next().replace(",", "."));

        ContaPoupanca cp = servico.criarContaPoupanca(rendimento, numAgencia);
        pessoa.setListaContas(cp);
        mostrarDadosConta(cp);
        return cp;
    }

    private boolean desejaFazerOperacaoBancaria(Scanner input) {
        LOGGER.info("Deseja Fazer uma Operação Bancaria?\n1-Sim  2-Não");
        return input.nextInt() == 1;
    }

    private void executarLoopOperacoes(Scanner input, Pessoa pessoa, ContaCorrente cc, ContaPoupanca cp) {
        int contaEscolhida = -1;
        while (contaEscolhida != 3) {
            if (LOGGER.isLoggable(Level.INFO)) {
                LOGGER.info(String.format("Bem vindo(a) %s.%nInforme qual conta você deseja escolher:%n1: Conta Corrente%n2: Conta Poupança%n3: Sair", pessoa.getNome()));
            }
            contaEscolhida = input.nextInt();

            if (contaEscolhida == 3) {
                break;
            }
            if (LOGGER.isLoggable(Level.INFO)) {
                LOGGER.info(String.format("Informe qual Operação Bancaria você deseja realizar:%n1: Depositar%n2: Sacar%n3: Imprimir"));
            }
            int operacaoBancaria = input.nextInt();
            realizarOperacao(input, contaEscolhida, operacaoBancaria, cc, cp);
        }
    }

    private Conta obterConta(int contaEscolhida, ContaCorrente cc, ContaPoupanca cp) {
        if (contaEscolhida == 1) {
            return cc;
        }
        if (contaEscolhida == 2) {
            return cp;
        }
        return null;
    }

    private void realizarOperacao(Scanner input, int contaEscolhida, int operacao, ContaCorrente cc, ContaPoupanca cp) {
        Conta conta = obterConta(contaEscolhida, cc, cp);
        if (conta == null) {
            LOGGER.warning("Conta não encontrada para a escolha informada.");
            return;
        }

        switch (operacao) {
            case 1: // Depositar
                LOGGER.info("Informe o valor que deseja depositar:");
                double valorDeposito = input.nextDouble();
                conta.depositar(valorDeposito);
                break;
            case 2: // Sacar
                LOGGER.info("Informe o valor que deseja sacar:");
                double valorSaque = input.nextDouble();
                conta.sacar(valorSaque);
                break;
            case 3: // Imprimir
                conta.imprimir();
                break;
            default:
                LOGGER.warning("Operação inválida.");
                break;
        }
    }

    public void executar() {
        Scanner input = new Scanner(System.in);
        executar(input);
        input.close();
    }

    public void executar(Scanner input) {
        AulaServico aulaServico = new AulaServico();

        LOGGER.info("Informe qual agencia você deseja criar a conta.\n Agencias Disponíveis: 1, 2 e 3");
        int numAgencia = input.nextInt();

        LOGGER.info("Informe o nome da Pessoa: ");
        String nome = input.next();

        LOGGER.info("Deseja criar a conta para pessoa Jurídica ou Fisíca: \n Digite \n 1: Jurídica \n 2: Física");
        int tipoPessoa = input.nextInt();

        if (tipoPessoa == 1) {
            LOGGER.info("Informe o CNPJ: ");
            String cnpj = input.next();

            PessoaJuridica pj = aulaServico.criarPessoaJuridica(nome, cnpj);
            processoConta(input, aulaServico, pj, numAgencia);

        } else if (tipoPessoa == 2) {
            LOGGER.info("Informe o CPF: ");
            String cpf = input.next();

            PessoaFisica pf = aulaServico.criarPessoaFisica(nome, cpf);
            processoConta(input, aulaServico, pf, numAgencia);
        }
    }
}
