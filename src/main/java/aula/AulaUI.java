package aula;

import java.util.Scanner;
import aula.AulaServico;

public class AulaUI {
    
    public void executar() {
        Scanner input = new Scanner(System.in);
        AulaServico aulaServico = new AulaServico();
        
        System.out.println("Informe qual agencia você deseja criar a conta. Agencias Disponíveis: 1, 2 e 3");
        int numAgencia = input.nextInt();
        
        System.out.println("Informe o nome da Pessoa: ");
        String nome = input.next();
        
        System.out.println("Deseja criar a conta para pessoa Jurídica ou Fisíca: \n Digite \n 1: Jurídica \n 2: Física");
        int tipoPessoa = input.nextInt();
        
        if (tipoPessoa == 1) {
            System.out.println("Informe o CNPJ: ");
            String cnpj = input.next();
            
            System.out.println("Deseja criar uma Conta Corrente? 1-Sim | 2-Não");
            boolean criarCorrente = input.nextInt() == 1;
            
            double salario = 0;
            if (criarCorrente) {
                System.out.println("Informe o Salário: ");
                salario = Double.parseDouble(input.next().replace(",", "."));
            }
            
            System.out.println("Deseja criar uma Conta Poupança? 1-Sim | 2-Não");
            boolean criarPoupanca = input.nextInt() == 1;
            
            double rendimento = 0;
            if (criarPoupanca) {
                System.out.println("Informe o Rendimento: ");
                rendimento = Double.parseDouble(input.next().replace(",", "."));
            }
            
            aulaServico.criarPessoaJuridica(nome, cnpj, numAgencia, criarCorrente, salario, criarPoupanca, rendimento);
            
        } else if (tipoPessoa == 2) {
            System.out.println("Informe o CPF: ");
            String cpf = input.next();
            
            System.out.println("Deseja criar uma Conta Corrente? 1-Sim | 2-Não");
            boolean criarCorrente = input.nextInt() == 1;
            
            double salario = 0;
            if (criarCorrente) {
                System.out.println("Informe o Salário: ");
                salario = Double.parseDouble(input.next().replace(",", "."));
            }
            
            System.out.println("Deseja criar uma Conta Poupança? 1-Sim | 2-Não");
            boolean criarPoupanca = input.nextInt() == 1;
            
            double rendimento = 0;
            if (criarPoupanca) {
                System.out.println("Informe o Rendimento: ");
                rendimento = Double.parseDouble(input.next().replace(",", "."));
            }
            
            aulaServico.criarPessoaFisica(nome, cpf, numAgencia, criarCorrente, salario, criarPoupanca, rendimento);
        }
        
        input.close();
    }
}
