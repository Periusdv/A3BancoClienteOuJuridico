package aula;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AulaUI {

    private static final Logger LOGGER = Logger.getLogger(AulaUI.class.getName());

    private void mostrarDadosConta(Conta conta) {
        if (LOGGER.isLoggable(Level.INFO)) {
            LOGGER.info(String.format("O número da sua conta é: %d, %nO número da sua agência é: %d", conta.getNumero(), conta.getAgencia().getNumero()));
        }
    }

    private void processoConta(Scanner input, AulaServico servico, Pessoa pessoa, int numAgencia) {
        ContaCorrente cc = null;
        ContaPoupanca cp = null;

        LOGGER.info("Deseja criar uma Conta Corrente?\n1-Sim | 2-Não");
        boolean criarCorrente = input.nextInt() == 1;

        double salario = 0;
        if (criarCorrente) {
            LOGGER.info("Informe o Salário: ");
            salario = Double.parseDouble(input.next().replace(",", "."));

            cc = servico.criarContaCorrente(salario, numAgencia);
            pessoa.setListaContas(cc);
            mostrarDadosConta(cc);
        }

        LOGGER.info("Deseja criar uma Conta Poupança?\n1-Sim | 2-Não");
        boolean criarPoupanca = input.nextInt() == 1;

        double rendimento = 0;
        if (criarPoupanca) {
            LOGGER.info("Informe o Rendimento: ");
            rendimento = Double.parseDouble(input.next().replace(",", "."));

            cp = servico.criarContaPoupanca(rendimento, numAgencia);
            pessoa.setListaContas(cp);
            mostrarDadosConta(cp);
        }

        LOGGER.info("Deseja Fazer uma Operação Bancaria?\n1-Sim  2-Não");
        int prosseguirOperacaoBancaria = input.nextInt();

        if (prosseguirOperacaoBancaria == 1) {
            int operacaoBancaria;
            int contaEscolhida = -1;
            double depositarValor;
            double sacarValor;
            while (contaEscolhida != 3) {
                LOGGER.info(String.format("Bem vindo(a) %s%n Informe Qual conta você deseja escolher %n Digite %n 1: Conta Corrente %n 2: Conta Poupança %n 3: Sair", pessoa.getNome()));
                contaEscolhida = input.nextInt();
                LOGGER.info("Informe qual Operação Bancaria você deseja reaizar: \n Digite \n 1: Depositar \n 2: Sacar \n 3: Imprimir contacorrente e contaPoupanca");
                operacaoBancaria = input.nextInt();
                if (operacaoBancaria == 1) {
                    LOGGER.info("Informe o a quantia que deseja depositar");
                    depositarValor = input.nextInt();
                    if (contaEscolhida == 1 && cc != null) {
                        cc.depositar(depositarValor);
                    } else if(contaEscolhida == 2 && cp != null){
                        cp.depositar(depositarValor);
                    }
                } else if (operacaoBancaria == 2) {
                    LOGGER.info("Informe o a quantia que deseja depositar");
                    sacarValor = input.nextInt();
                    if (contaEscolhida == 1 && cc != null) {
                        cc.sacar(sacarValor);
                    } else if(contaEscolhida == 2 && cp != null) {
                        cp.sacar(sacarValor);
                    }
                } else if (operacaoBancaria == 3) {
                    if (contaEscolhida == 1 && cc != null) {
                        cc.imprimir();
                    } else if(contaEscolhida == 2 && cp != null) {
                        cp.imprimir();
                    }
                }
            }
        }
    }

    public void executar() {
        Scanner input = new Scanner(System.in);
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

        input.close();
    }
}
