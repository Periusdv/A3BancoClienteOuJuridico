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
1. testConstrutorAgencia: ID 1 
2. testSetNumero: ID 1
3. testGetNumero: ID 1

Procedimentos:
1. Verifica se a agencia e igual a 1 no Id do testCostrutorAgencia.
2. levanta Id = 1 em test SetNumero.
3. retorna Id = 1 em test GetNumero.

Espificação de Saida:
os teste não apresenta saída nenhuma, nem mesmo de Systema

## ID Do Caso de Teste: CT-002

Item do teste: TestAula
dentro dele ha testPessoaJuridicaComContas,testPessoaJuridicaSemContas,testPessoaFisicaSomenteContaCorrente,testPessoaFisicaSomentePoupanca.

Expecificação de Entrada:

1.testPessoaJuridicaComContas: Agencia 1, Nome João,Fisica ou Juridica 1,Cnpj 9999999,Corente 1,Salario 100,000,Poupança 1,Rendimento 0,1,Deseja Fazer uma Operação Bacaria 1.

2.testPessoaJuridicaSemContas: Agencia 2,Nome Fredico,Fisica ou Juridica 1,Cnpj 9999999, Corente 2, Poupança 2.

3.testPessoaFisicaSomenteContaCorrente Agencia 2,Nome Willan Afthon,Fisica ou Juridica 2,CPF 9999999,Corente 1,Salario 300,000,Poupança 2.

4.testPessoaFisicaSomentePoupanca Agencia 2,Nome Amilton,Fisica ou Juridica 2,CPF 9999999,Corente 2,Poupança 1,Rendimento 0,2.

Procedimentos:

Como procedimento principal desses testes o sistema primeiro faqz a pergunta de qual agencia vc vai criar sua conta dps seu nome dps perguga se vc se uma pessoa juridica ou fisica caso vc seja juridica ira perguntar o cnpj caso não o cpf logo dps o sitema ira perguntar se vc quer criar uma conta corente com 1 para sim e 2 para não se sim o sitema  pergunta o salario se nao o sitema pergunta se vc quer criar uma poupança sem sim ele perguta qual o rendimento se não o sistema pergunta com 1 ou 2 se deseja criar uma conta bancaria se sim

Espificação de Saida:
Todas as Saidas estão relacionadas aos testes acima com a injeção de dados dentro da aplicação nehuma saida expecifica como caixas de texto apenas o prorpio sistema sendo auto testado com a ingeção de dados.

## ID Do Caso de Testes: CT-003

Item do Teste:TestContaCorrente
dentro dele ha testGetSalario,testSetSalario,testNumeroConta,testAgenciaConta,testImprimir.

Expecificação de Entrada:

1.testGetSalario:Salario 2500.0,Conta Corente, Rendimento de 0.01.

2.testSetSalario:Salario 2500.0,Conta Corente, Rendimento de 0.01.

3.testNumeroConta:Numero Da conta 1234,Conta Corente.

4.testAgenciaConta:Agencia 1,Conta Corente.

5.testImprimir:Chama Imprimir com informações de conta corrente.

Procedimento:

sobre o procedimeto geral dos 2 primeiros testes os testes vao simular uma injeção de dados para testar pricipalmente o salario e o rendimeto.
ja no 2  teste sera testado Numero da conta e conta corente.
no 3 teste sera testado a agencia e a conta corente.
no ultimo testes o imprimir ele mostra o salario e seu rendimento.

Espificação de Saida:
Nehuma saida pode ser vista nem mesmo pelo Systema.

## ID Do Caso de Teste: CT-004

Item Do Teste:TestContaPoupanca
dentro dele ha testGetRendimento,testSetRendimento,testImprimir.

Expecificação De Entrada:

1.testGetRendimento:Rendimento 0,05,Conta poupanca.

2.testSetRendimento:Rendimento 0,07,Conta poupanca.

3.testImprimir:Chama Imprimir com informações de conta corrente.

Procedimento:

sobre o procedimeto geral dos 2 primeiros testes os testes vao simular uma injeção de dados para testar pricipalmente o salario e o rendimeto.
no ultimo testes o imprimir ele mostra o seu rendimento.

Espificação de Saida:
Nehuma saida pode ser vista nem mesmo pelo Systema.

## ID Do Caso de Teste: CT-005

Item do Teste:TestPessoaFisica 
dentro dele ha testConstrutorPessoaFisica,testSetCPF.

Expecificação De Entrada:

1.testConstrutorPessoaFisica: Agencia 1,Nome Pedro,CPF 123.456.789-00,Conta 123,Salario 2500.0.

2.testSetCPF:Nome Pedro, CPF 111.222.333-44.

Procedimento:
Sobre o procedimento de ambos os testes eles etão injetando/modificando as informações dentro do teste para serem verificados coretamente.

Espificação de Saida:
Nehuma saida pode ser vista nem mesmo pelo Systema.

## ID Do Caso de Teste: CT-006

Item Do Teste: TestPessoaJuridica
dento dele ha testConstrutorPessoaJuridica,testSetCnpj

Expecificação De Entrada:

1.testConstrutorPessoaJuridica: Agencia 1,Nome Amanda ,Cnpj 12.345.678/0000-00,Conta 111,Salario 5000.

2.testSetCnpj: Nome Amanda,cnpj 12.345.678/0000-00.

Procedimento:
Sobre o procedimento de ambos os testes eles etão injetando/modificando as informações dentro do teste para serem verificados coretamente.

Espificação de Saida:
Nehuma saida pode ser vista nem mesmo pelo Systema.
