package aula;

import java.security.SecureRandom;
import java.util.ArrayList;

public class AulaServico {

    private SecureRandom random = new SecureRandom();

    public PessoaJuridica criarPessoaJuridica(String nome, String cnpj) {
        ArrayList<Conta> contas = new ArrayList<>();
        return new PessoaJuridica(nome, contas, cnpj);
    }

    public PessoaFisica criarPessoaFisica(String nome, String cpf) {
        ArrayList<Conta> contas = new ArrayList<>();
        return new PessoaFisica(nome, contas, cpf);
    }

    public ContaCorrente criarContaCorrente(double salario, int numAgencia) {
        Agencia agencia = new Agencia(numAgencia);
        return new ContaCorrente(random.nextInt(100), salario, agencia);
    }

    public ContaPoupanca criarContaPoupanca(double rendimento, int numAgencia) {
        Agencia agencia = new Agencia(numAgencia);
        return new ContaPoupanca(random.nextInt(100), rendimento, agencia);
    }
}
