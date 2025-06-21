package aula;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AulaUI {

    private static final Logger LOGGER = Logger.getLogger(AulaUI.class.getName());

    private void mostrarDadosConta(Conta conta) {
        if (LOGGER.isLoggable(Level.INFO)) {
            LOGGER.info(String.format("O número da sua conta é: %d, \nO número da sua agência é: %d", conta.getNumero(), conta.getAgencia().getNumero()));
        }
    }

    private void processoConta(Scanner input, AulaServico servico, Pessoa pessoa, int numAgencia) {

        LOGGER.info("Deseja criar uma Conta Corrente? 1-Sim | 2-Não");
        boolean criarCorrente = input.nextInt() == 1;

        double salario = 0;
        if (criarCorrente) {
            LOGGER.info("Informe o Salário: ");
            salario = Double.parseDouble(input.next().replace(",", "."));

            ContaCorrente cc = servico.criarContaCorrente(salario, numAgencia);
            pessoa.setListaContas(cc);
            mostrarDadosConta(cc);

            cc.imprimir();

        }

        LOGGER.info("Deseja criar uma Conta Poupança? 1-Sim | 2-Não");
        boolean criarPoupanca = input.nextInt() == 1;

        double rendimento = 0;
        if (criarPoupanca) {
            LOGGER.info("Informe o Rendimento: ");
            rendimento = Double.parseDouble(input.next().replace(",", "."));

            ContaPoupanca cp = servico.criarContaPoupanca(rendimento, numAgencia);
            pessoa.setListaContas(cp);
            mostrarDadosConta(cp);

            cp.imprimir();

        }
    }

    public void executar() {
        Scanner input = new Scanner(System.in);
        AulaServico aulaServico = new AulaServico();

        LOGGER.info("Informe qual agencia você deseja criar a conta. Agencias Disponíveis: 1, 2 e 3");
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
