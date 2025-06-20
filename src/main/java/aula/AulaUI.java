package aula;

import java.util.Scanner;
import java.util.logging.Logger;

public class AulaUI {
    
    private static final Logger LOGGER = Logger.getLogger(AulaUI.class.getName());
    
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
            
            LOGGER.info("Deseja criar uma Conta Corrente? 1-Sim | 2-Não");
            boolean criarCorrente = input.nextInt() == 1;
            
            double salario = 0;
            if (criarCorrente) {
                LOGGER.info("Informe o Salário: ");
                salario = Double.parseDouble(input.next().replace(",", "."));
            }
            
            LOGGER.info("Deseja criar uma Conta Poupança? 1-Sim | 2-Não");
            boolean criarPoupanca = input.nextInt() == 1;
            
            double rendimento = 0;
            if (criarPoupanca) {
                LOGGER.info("Informe o Rendimento: ");
                rendimento = Double.parseDouble(input.next().replace(",", "."));
            }
            
            aulaServico.criarPessoaJuridica(nome, cnpj, numAgencia, criarCorrente, salario, criarPoupanca, rendimento);
            
        } else if (tipoPessoa == 2) {
            LOGGER.info("Informe o CPF: ");
            String cpf = input.next();
            
            LOGGER.info("Deseja criar uma Conta Corrente? 1-Sim | 2-Não");
            boolean criarCorrente = input.nextInt() == 1;
            
            double salario = 0;
            if (criarCorrente) {
                LOGGER.info("Informe o Salário: ");
                salario = Double.parseDouble(input.next().replace(",", "."));
            }
            
            LOGGER.info("Deseja criar uma Conta Poupança? 1-Sim | 2-Não");
            boolean criarPoupanca = input.nextInt() == 1;
            
            double rendimento = 0;
            if (criarPoupanca) {
                LOGGER.info("Informe o Rendimento: ");
                rendimento = Double.parseDouble(input.next().replace(",", "."));
            }
            
            aulaServico.criarPessoaFisica(nome, cpf, numAgencia, criarCorrente, salario, criarPoupanca, rendimento);
        }
        
        input.close();
    }
}
