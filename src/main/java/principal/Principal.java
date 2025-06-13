package principal;

import agencia.Agencia;
import agencia.Banco;
import contas.ContaBancaria;
import contas.ContaCorrente;
import contas.ContaPoupanca;
import java.util.*;
import pessoas.Pessoa;
import pessoas.PessoaFisica;
import pessoas.PessoaJuridica;

public class Principal {

    public static void main(String[] args) {
        // Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);
        // Instância do banco com as agências disponíveis
        Banco banco = new Banco();
        // Lista para armazenar todas as contas criadas
        List<ContaBancaria> contas = new ArrayList<>();
        // Objeto para armazenar titular da conta
        Pessoa pessoa;

        System.out.println("Você é: ");
        System.out.println("1 - Pessoa Física");
        System.out.println("2 - Pessoa Juridica");
        int tipoPessoa = scanner.nextInt();
        scanner.nextLine();

        // Solicita nome do titular
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        // Objeto correspondente ao tipo de pessoa
        if (tipoPessoa == 1) {
            System.out.println("Digite seu CPF: ");
            String cpf = scanner.nextLine();
            pessoa = new PessoaFisica(nome, cpf);
        } else {
            System.out.println("Digite seu CNPJ: ");
            String cnpj = scanner.nextLine();
            pessoa = new PessoaJuridica(nome, cnpj);
        }

        // Exibição das agências disponíveis
        System.out.println("Escolha a sua Agência: ");
        for (Agencia ag : banco.getAgencias()) {
            System.out.println(ag.getNumero() + " - " + ag.getNome());
        }
        // Solicita o número da agência
        System.out.print("Número da Agência: ");
        int numAgencia = scanner.nextInt();
        Agencia agencia = banco.buscaAgenciaNum(numAgencia);

        scanner.nextLine();
        System.out.print("Quantas contas deseja cria? ");
        int qtdContas = scanner.nextInt();
        scanner.nextLine();

        // Laço para criar as contas desejáveis
        for (int i = 0; i < qtdContas; i++) {
            System.out.println("Tipo de Conta " + (i + 1) + ":");
            System.out.println("1 - Conta Corrente");
            System.out.println("2 - Conta Poupança");
            int tipoConta = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Número da Conta: ");
            String numConta = scanner.nextLine();

            ContaBancaria conta;
            // Cria a instância da conta de acordo com a escolha 
            if (tipoConta == 1) {
                conta = new ContaCorrente(numConta, pessoa, agencia);
            } else {
                conta = new ContaPoupanca(numConta, pessoa, agencia);
            }
            // Adciona a conta à lista de contas
            contas.add(conta);
        }

        System.out.println("Número de Contas Cadastradas: ");
        for (ContaBancaria c : contas) {
            c.exibirInformacoes();
            System.out.println("------------------------");
        }

        scanner.close();
    }
}
