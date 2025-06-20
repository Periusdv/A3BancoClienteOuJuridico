package aula;

import java.util.ArrayList;
import java.util.Random;

public class AulaServico {
    
    private Random random = new Random();
    
    public PessoaJuridica criarPessoaJuridica(String nome, String cnpj, int numAgencia, boolean criarCorrente, double salario, boolean criarPoupanca, double rendimento) {
       
        ArrayList<Conta> contas = new ArrayList<>();
        Agencia agencia = new Agencia(numAgencia);
        PessoaJuridica pessoajuridica = new PessoaJuridica(nome, contas, cnpj);
        
        
        if (criarCorrente) {
            ContaCorrente contacorrente = new ContaCorrente(random.nextInt(100), salario, agencia);
            pessoajuridica.setListaContas(contacorrente);
        }
        
        if (criarPoupanca) {
            ContaPoupanca contapoupanca = new ContaPoupanca(random.nextInt(100), rendimento, agencia);
            pessoajuridica.setListaContas(contapoupanca);
        }
        
        return pessoajuridica;
    }
    
    public PessoaFisica criarPessoaFisica(String nome, String cpf, int numAgencia, boolean criarCorrente, double salario, boolean criarPoupanca, double rendimento) {
        
        ArrayList<Conta> contas = new ArrayList<>();
        Agencia agencia = new Agencia(numAgencia);
        PessoaFisica pessoafisica = new PessoaFisica(nome, contas, cpf);
                
        if (criarCorrente) {
            ContaCorrente contacorrente = new ContaCorrente(random.nextInt(100), salario, agencia);
            pessoafisica.setListaContas(contacorrente);
        }
        
        if (criarPoupanca) {
            ContaPoupanca contapoupanca = new ContaPoupanca(random.nextInt(100), rendimento, agencia);
            pessoafisica.setListaContas(contapoupanca);
        }
        
        return pessoafisica;
    }
}
