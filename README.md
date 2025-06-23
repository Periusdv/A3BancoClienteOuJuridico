[![Github Actions Status for Periusdv/A3BancoClienteOuJuridico](https://github.com/Periusdv/A3BancoClienteOuJuridico/workflows/Java%20CI%20with%20Maven/badge.svg)](https://github.com/Periusdv/A3BancoClienteOuJuridico/actions)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=Periusdv_A3BancoClienteOuJuridico&metric=coverage)](https://sonarcloud.io/summary/new_code?id=Periusdv_A3BancoClienteOuJuridico)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=Periusdv_A3BancoClienteOuJuridico&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=Periusdv_A3BancoClienteOuJuridico)

## Integrantes:

Gabriel Teotônio Cordeiro 10724111027 \
Luan Campi Galatti 1072419087 \
Davi Dias Perius 10724114628 \
Victor Lucio Scheuer Rodrigues 1072410296

Trabalho A3 de Gestão e Qualidade de Software Prof.ª Samara Soares Leal
------------------------------------------------------------------------
## Casos De Teste:

## ID Do Caso de Teste: CT-001

Item do teste: TestAgencia
dentro dele ha testConstrutorAgencia,testSetNumero,testGetNumero.

Espexificação de Entrada:
1. testConstrutorAgencia: Agencia 1. 
2. testSetNumero: Agencia agencia = new Agencia(1); agencia.setNumero(1);.
3. testGetNumero: Agencia agencia = new Agencia(1); int numero = agencia.getNumero();

Procedimentos:
1. Verifica se a agencia e igual a 1 no Id do testCostrutorAgencia.
2. levanta Id = 1 em test SetNumero.
3. retorna Id = 1 em test GetNumero.

Espificação de Saida:

Em todos os testes a saida esperada é 1 

## ID Do Caso de Teste: CT-002

Item do teste: TestAula
dentro dele ha testPessoaJuridicaComContas,testPessoaJuridicaSemContas,testPessoaFisicaSomenteContaCorrente,testPessoaFisicaSomentePoupanca.

Expecificação de Entrada:

1.testPessoaJuridicaComContas: Agencia 1, Nome João,Fisica ou Juridica 1,Cnpj 9999999,Corente 1,Salario 100,000,Poupança 1,Rendimento 0,1,Deseja Fazer uma Operação Bacaria 2.

2.testPessoaJuridicaSemContas: Agencia 2,Nome Fredico,Fisica ou Juridica 1,Cnpj 9999999, Corente 2, Poupança 2,Deseja Fazer uma Operação Bacaria 2.

3.testPessoaFisicaSomenteContaCorrente: Agencia 2,Nome Willan Afthon,Fisica ou Juridica 2,CPF 9999999,Corente 1,Salario 300,000,Poupança 2,Deseja Fazer uma Operação Bacaria 2.

4.testPessoaFisicaSomentePoupanca: Agencia 2,Nome Amilton,Fisica ou Juridica 2,CPF 9999999,Corente 2,Poupança 1,Rendimento 0,2,Deseja Fazer uma Operação Bacaria 2.

5.testExecutarLoopOperacoes: Agencia 2,Nome Amilton,Fisica e Juridica ,CPF e Cnpj 9999999,Corente 1,Salario 100,Poupança 1,Rendimento 0,2,Imprimir 3, Sair 3.

Procedimentos:

Como procedimento principal desses testes o sistema primeiro faz a pergunta de qual agencia vc vai criar sua conta dps seu nome dps perguga se vc se uma pessoa juridica ou fisica caso vc seja juridica ira perguntar o cnpj caso não o cpf logo dps o sitema ira perguntar se vc quer criar uma conta corente com 1 para sim e 2 para não se sim o sitema  pergunta o salario se nao o sitema pergunta se vc quer criar uma poupança sem sim ele perguta qual o rendimento se não o sistema pergunta com 1 ou 2 se deseja criar uma conta bancaria se sim ira aparecer 3 opções 1 conta corrente conta poupança e sair se escolheu conta corente ira aparecer 1 depositar 2 sacar 3 imprimir caso escolha conta poupança ira aparecer as msm informaçoes a opção imprimir ela faz voltar para a 1 etapa da operação bancaria.
Sobre testExecutarLoopOperacoes essse teste simula as açoes de Acesso de conta corente e poupança que dentro deles ha Depositar Sacar e imprimir.

Espificação de Saida:
Todas as Saidas estão relacionadas aos testes acima com a injeção de dados dentro da aplicação nehuma saida expecifica como caixas de texto apenas o prorpio sistema sendo auto testado com a ingeção de dados.

## ID Do Caso de Testes: CT-003

Item do Teste:TestContaCorrente
dentro dele ha testGetSalario,testSetSalario,testNumeroConta,testAgenciaConta,testImprimir,testSetSaldo,testSetAgencia,testSetNumero,testSacarComSaldoSuficiente,testSacarComSaldoInsuficiente

Expecificação de Entrada:

1.testGetSalario:Salario 2500.0,Conta Corente, Rendimento de 0.01.

2.testSetSalario:Salario 2500.0,Conta Corente, Rendimento de 0.01.

3.testNumeroConta:Numero Da conta 1234,Conta Corente.

4.testAgenciaConta:Agencia 1,Conta Corente.

5.testImprimir:Criando metodo com informações da conta corrente.

6.testSetSaldo:Saldo 400,Conta Corente,Rendimento 0,02.

7.testSetAgencia:Agencia 28,Conta Corente,Numero da conta.

8.testSetNumero:Numero da conta,Conta Corente.

9.testSacarComSaldoSuficiente:Saldo 200,Sacar 100,Conta Corente,Rendimento 0,02.

10.testSacarComSaldoInsuficiente:Saldo 50,Sacar 100,Conta Corente,Rendimento 0,02.
Procedimento:

sobre o procedimeto:
geral dos 2 primeiros testes os testes vao simular uma injeção de dados para testar pricipalmente o salario e o rendimeto.
ja no 2  teste sera testado Numero da conta e conta corente.
no 3 teste sera testado a agencia e a conta corente.
no 4 testes o imprimir ele mostra o salario e seu rendimento.
no teste 5 deve ser testado se foi posivivel criar uma conta corente com os dados istanciados.
nos tests 6 ate 9 os testes se baseam interamente em testar o numero da agencia o sacque de dinheiro e o rendimento.
no 10 teste e testado se e posivel sacar mais do que vc posui na conta.

Espificação de Saida:

Salário da conta: 2500.0

Número da conta: 1234

Número da agência: 1

Definição de salário: após getSalario() 2500.0

Definição de saldo: após getSaldo() 500.0

Saque com saldo suficiente: após getSaldo() 100.0

Saque com saldo insuficiente: após getSaldo() 50.0(sem alteração)

Alteração de agência: após getAgencia().getNumero() 99

Alteração de número da conta: após getNumero() 777

Impressão de informações da conta(log): "Conta Corrente", "Salário"

## ID Do Caso de Teste: CT-004

Item Do Teste:TestContaPoupanca
dentro dele ha testGetRendimento,testSetRendimento,testImprimir.

Expecificação De Entrada:

1.testGetRendimento:Rendimento 0,05,Conta poupanca.

2.testSetRendimento:Rendimento inicial 0,05,Rendimento Final 0,07,Conta poupanca.

3.testImprimir:Chama Imprimir com informações de conta corrente.

Procedimento:

sobre o procedimeto geral dos 2 primeiros testes os testes vao simular uma injeção de dados para testar pricipalmente o salario e o rendimeto.
no ultimo testes o imprimir ele mostra o seu rendimento.

Espificação de Saida:
a saida em testeGetRendimento e o retorno de 0,05 do rendimento.
a saida em testSetRendimento e o getRendimento que retorna 0,07 em seu rendimento.
a saida em Imprimir e conta poupanca e o  saldo atual.

## ID Do Caso de Teste: CT-005

Item do Teste:TestPessoaFisica 
dentro dele ha testConstrutorPessoaFisica,testSetCPF,testSetNome.

Expecificação De Entrada:

1.testConstrutorPessoaFisica: Agencia 1,Nome Pedro,CPF 123.456.789-00,Conta 123,Salario 2500.0.

2.testSetCPF:Nome Pedro, CPF inicial 000.000.000-00,CPF Final 111.222.333-44.

3.testSetNome:Nome Inicial Carlos,Nome Final Pedro Alberto,CPF 196.348,296-00.

Procedimento:
Sobre o procedimento de ambos os testes eles etão injetando/modificando as informações dentro do teste para serem verificados coretamente.

Espificação de Saida:
a saida em testConstrutorPessoaFisica e pedro e sua lista de contas que e 123 e sue cnpj 12.345.678/0000-00.
a saida em testSetCpf e seu cpf diferente do primeiro.
a saida em testSetNome e seu Nome diferente do primeiro.

## ID Do Caso de Teste: CT-006

Item Do Teste: TestPessoaJuridica
dento dele ha testConstrutorPessoaJuridica,testSetCnpj

Expecificação De Entrada:

1.testConstrutorPessoaJuridica: Agencia 1,Nome Amanda ,Cnpj 12.345.678/0000-00,Conta 111,Salario 5000.

2.testSetCnpj: Nome Amanda,cnpj Inicial 00.000.000/0000-00, cnpj Final 12.345.678/0000-00.

Procedimento:
Sobre o procedimento de ambos os testes eles etão injetando/modificando as informações dentro do teste para serem verificados coretamente.

Espificação de Saida:
a saida em testConstrutorPessoaJuridica e amanda e sua lista de contas que e 111 e sue cnpj 12.345.678/0000-00.
a saida em testSetCnpj e seu cnpj diferente do primeiro.

Correção do programa:
No início do desenvolvimento do projeto foi identificado nas classes, PessoaJuridica e PessoaFisica um método usando int ao invés de String

Antes:

    public class PessoaJuridica extends Pessoa{
    private int cnpj;
    PessoaJuridica(String nome, ArrayList<Conta> listacontas, int cnpj){
        super(nome, listacontas);
        this.cnpj = cnpj;
    }
    public int getCnpj(){
        return this.cnpj;
    }

    public void setCnpj(int cnpj){
        this.cnpj = cnpj;
    }
}


Depois:

    private String cnpj;

    public PessoaJuridica(String nome, List<Conta> listacontas, String cnpj) {
        super(nome, listacontas);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

Outro fator que encontramos durante o desenvolvimento foi que a classe aula por ser a "Principal" do projeto impedia de aumentar o code coverage, então decidimos separa-lá em tres classes conectadas para aumentar o code coverage

Antes:
Classe - > Aula.java

Depois:
Classes - > Aula.java / AulaUI.java / AulaServico.java

Imagens dos testes:

![Image](https://github.com/user-attachments/assets/ba8daf71-6b14-4938-bc02-19de9792da06)

![Image](https://github.com/user-attachments/assets/535b58c4-b5ba-4040-b804-c1ad0fd4c66c)

![Image](https://github.com/user-attachments/assets/d1f28155-5c20-4d8b-a206-c8a7dfefb345)

![Image](https://github.com/user-attachments/assets/e1b77a63-72e1-4e35-89f1-c4b4d2fd77ac)

![Image](https://github.com/user-attachments/assets/4cc221b7-bcd1-4d0b-828a-8ebdc7b58657)
